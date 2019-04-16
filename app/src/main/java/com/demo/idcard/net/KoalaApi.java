package com.demo.idcard.net;

import com.demo.idcard.net.response.PadLoginResponse;
import com.demo.idcard.net.response.RegisterResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface KoalaApi {

    @FormUrlEncoded
    @POST("/pad/login")
    Observable<PadLoginResponse> padLogin(
            @Field("username") String username
            , @Field("password") String password
            , @Field("pad_id") String pad_id
            , @Field("device_type") String device_type);


    @FormUrlEncoded
    @POST("/subject")
    Observable<RegisterResponse> register(
            @Field("name") String name
            , @Field("start_time") int startTime
            , @Field("end_time") int endTime
    );
}
