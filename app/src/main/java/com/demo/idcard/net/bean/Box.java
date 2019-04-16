package com.demo.idcard.net.bean;

import java.util.List;

public class Box {

    private String box_address;
    private String box_token;
    private int company_id;
    private String current_version;
    private String dog_expiration;
    private int facemin;
    private String firmware_version;
    private int heartbeat;
    private int id;
    private LeafConfigBean leaf_config;
    private int model;
    private String status;
    private List<Screen> all_screens;

    public String getBox_address() {
        return box_address;
    }

    public void setBox_address(String box_address) {
        this.box_address = box_address;
    }

    public String getBox_token() {
        return box_token;
    }

    public void setBox_token(String box_token) {
        this.box_token = box_token;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCurrent_version() {
        return current_version;
    }

    public void setCurrent_version(String current_version) {
        this.current_version = current_version;
    }

    public String getDog_expiration() {
        return dog_expiration;
    }

    public void setDog_expiration(String dog_expiration) {
        this.dog_expiration = dog_expiration;
    }

    public int getFacemin() {
        return facemin;
    }

    public void setFacemin(int facemin) {
        this.facemin = facemin;
    }

    public String getFirmware_version() {
        return firmware_version;
    }

    public void setFirmware_version(String firmware_version) {
        this.firmware_version = firmware_version;
    }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LeafConfigBean getLeaf_config() {
        return leaf_config;
    }

    public void setLeaf_config(LeafConfigBean leaf_config) {
        this.leaf_config = leaf_config;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Screen> getAll_screens() {
        return all_screens;
    }

    public void setAll_screens(List<Screen> all_screens) {
        this.all_screens = all_screens;
    }

    public static class LeafConfigBean {

        private double blurriness;
        private int facemin;
        private int fmp;
        private double fmp_threshold;
        private int pitch;
        private int roll;
        private int threshold;
        private double unthreshold;
        private int verify;
        private int yaw;

        public double getBlurriness() {
            return blurriness;
        }

        public void setBlurriness(double blurriness) {
            this.blurriness = blurriness;
        }

        public int getFacemin() {
            return facemin;
        }

        public void setFacemin(int facemin) {
            this.facemin = facemin;
        }

        public int getFmp() {
            return fmp;
        }

        public void setFmp(int fmp) {
            this.fmp = fmp;
        }

        public double getFmp_threshold() {
            return fmp_threshold;
        }

        public void setFmp_threshold(double fmp_threshold) {
            this.fmp_threshold = fmp_threshold;
        }

        public int getPitch() {
            return pitch;
        }

        public void setPitch(int pitch) {
            this.pitch = pitch;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public int getThreshold() {
            return threshold;
        }

        public void setThreshold(int threshold) {
            this.threshold = threshold;
        }

        public double getUnthreshold() {
            return unthreshold;
        }

        public void setUnthreshold(int unthreshold) {
            this.unthreshold = unthreshold;
        }

        public int getVerify() {
            return verify;
        }

        public void setVerify(int verify) {
            this.verify = verify;
        }

        public int getYaw() {
            return yaw;
        }

        public void setYaw(int yaw) {
            this.yaw = yaw;
        }
    }
}