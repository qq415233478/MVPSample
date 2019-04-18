package com.demo.idcard.net;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.demo.idcard.net.response.PadLoginResponse;
import com.demo.idcard.net.response.RegisterResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetApi {
    private KoalaApi mApiService;
    private static volatile NetApi INSTANCE;
    private String mUrl = "http://127.0.0.1";
    private UrlInterceptor mUrlInterceptor;
    private List<String> mCookies = new ArrayList<>();

    private NetApi() {
        mUrlInterceptor = new UrlInterceptor();
        OkHttpClient okHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(mUrlInterceptor)
                .addInterceptor(new SetCookiesIntercept())
                .addInterceptor(new GetCookiesIntercept())
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        mApiService = retrofit.create(KoalaApi.class);
    }

    public static NetApi getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NetApi();
        }
        return INSTANCE;
    }


    public void setUrl(String url) {
        mUrlInterceptor.setOriginalBaseUrl(mUrl);
        mUrlInterceptor.setNewBaseUrl(url);
    }

    public Observable<PadLoginResponse> padLogin(String username
            , String password
            , String pad_id
            , String device_type) {
        return mApiService.padLogin(username, password, pad_id, device_type);
    }

    public Observable<RegisterResponse> register(String name, long startTime, long endTime, int subjectType) {
        return mApiService.register(name, startTime, endTime, subjectType);
    }

    class SetCookiesIntercept implements Interceptor {
        @NonNull
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Request original = chain.request();
            Request.Builder builder = original.newBuilder();
            builder.header("user-agent", "Koala Admin");

            for (String cookie : mCookies) {
                builder.header("Cookie", cookie);
            }
            builder.method(original.method(), original.body());
            Request request = builder.build();
            return chain.proceed(request);
        }
    }

    class GetCookiesIntercept implements Interceptor {
        @NonNull
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Response original = chain.proceed(chain.request());
            if (!original.headers("Set-Cookie").isEmpty()) {
                mCookies.addAll(original.headers("Set-Cookie"));
            }
            return original;
        }
    }

    class UrlInterceptor implements Interceptor {
        private String mOriginalBaseUrl;
        private String mNewBaseUrl;

        @NonNull
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {

            Request oldRequest = chain.request();
            HttpUrl requestUrl = oldRequest.url();
            String oldUrl = requestUrl.toString();
            if (TextUtils.isEmpty(mOriginalBaseUrl)
                    || TextUtils.isEmpty(mNewBaseUrl)
                    || TextUtils.equals(mOriginalBaseUrl, mNewBaseUrl)
                    || !oldUrl.startsWith(mOriginalBaseUrl)) {
                return chain.proceed(chain.request());
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (!TextUtils.isEmpty(mNewBaseUrl)) {
                stringBuilder.append(mNewBaseUrl);
            }
            stringBuilder.append(oldUrl.substring(mOriginalBaseUrl.length(), oldUrl.length()));
            String newUrl = stringBuilder.toString();
            Request newRequest = oldRequest
                    .newBuilder()
                    .url(newUrl)
                    .build();
            return chain.proceed(newRequest);
        }

        private void setOriginalBaseUrl(String originalBaseUrl) {
            mOriginalBaseUrl = originalBaseUrl;
        }


        private void setNewBaseUrl(String newBaseUrl) {
            mNewBaseUrl = newBaseUrl;
        }
    }
}
