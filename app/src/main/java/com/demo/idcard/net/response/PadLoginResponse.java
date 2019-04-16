package com.demo.idcard.net.response;


import com.demo.idcard.net.bean.Box;
import com.demo.idcard.net.bean.Company;
import com.demo.idcard.net.bean.Page;

import java.util.List;

public class PadLoginResponse extends BaseResponse {

    @Override
    public String toString() {
        return "PadLoginResponse{" +
                "code=" + code +
                ", data=" + data +
                ", page=" + page +
                ", desc=" + desc +
                '}';
    }

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }


    public static class DataBean {
        private String avatar;
        private Company company;
        private int company_id;
        private int id;
        private Object organization_id;
        private boolean password_reseted;
        private String position;
        private int role_id;
        private int screen_id;

        @Override
        public String toString() {
            return "DataBean{" +
                    "avatar='" + avatar + '\'' +
                    ", company=" + company +
                    ", company_id=" + company_id +
                    ", id=" + id +
                    ", organization_id=" + organization_id +
                    ", password_reseted=" + password_reseted +
                    ", position='" + position + '\'' +
                    ", role_id=" + role_id +
                    ", screen_id=" + screen_id +
                    ", screen_token='" + screen_token + '\'' +
                    ", username='" + username + '\'' +
                    ", boxes=" + boxes +
                    ", permission=" + permission +
                    '}';
        }

        private String screen_token;
        private String username;
        private List<Box> boxes;
        private List<?> permission;

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Company getCompany() {
            return company;
        }

        public void setCompany(Company company) {
            this.company = company;
        }

        public int getCompany_id() {
            return company_id;
        }

        public void setCompany_id(int company_id) {
            this.company_id = company_id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getOrganization_id() {
            return organization_id;
        }

        public void setOrganization_id(Object organization_id) {
            this.organization_id = organization_id;
        }

        public boolean isPassword_reseted() {
            return password_reseted;
        }

        public void setPassword_reseted(boolean password_reseted) {
            this.password_reseted = password_reseted;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getRole_id() {
            return role_id;
        }

        public void setRole_id(int role_id) {
            this.role_id = role_id;
        }

        public int getScreen_id() {
            return screen_id;
        }

        public void setScreen_id(int screen_id) {
            this.screen_id = screen_id;
        }

        public String getScreen_token() {
            return screen_token;
        }

        public void setScreen_token(String screen_token) {
            this.screen_token = screen_token;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<Box> getBoxes() {
            return boxes;
        }

        public void setBoxes(List<Box> boxes) {
            this.boxes = boxes;
        }

        public List<?> getPermission() {
            return permission;
        }

        public void setPermission(List<?> permission) {
            this.permission = permission;
        }
    }


}
