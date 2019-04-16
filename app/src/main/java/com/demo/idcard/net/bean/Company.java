package com.demo.idcard.net.bean;

import java.util.List;

public class Company {

    private boolean attendance_on;
    private String consigner;
    private int create_time;
    private int data_version;
    private int deployment;
    private int feature_version;
    private boolean full_day;
    private int id;
    private String logo;
    private String name;
    private String remark;
    private String scenario;
    private boolean upload;
    private List<Integer> attendance_weekdays;
    private List<List<Integer>> door_range;
    private List<Integer> door_weekdays;

    public boolean isAttendance_on() {
        return attendance_on;
    }

    public void setAttendance_on(boolean attendance_on) {
        this.attendance_on = attendance_on;
    }

    public String getConsigner() {
        return consigner;
    }

    public void setConsigner(String consigner) {
        this.consigner = consigner;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getData_version() {
        return data_version;
    }

    public void setData_version(int data_version) {
        this.data_version = data_version;
    }

    public int getDeployment() {
        return deployment;
    }

    public void setDeployment(int deployment) {
        this.deployment = deployment;
    }

    public int getFeature_version() {
        return feature_version;
    }

    public void setFeature_version(int feature_version) {
        this.feature_version = feature_version;
    }

    public boolean isFull_day() {
        return full_day;
    }

    public void setFull_day(boolean full_day) {
        this.full_day = full_day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }

    public List<Integer> getAttendance_weekdays() {
        return attendance_weekdays;
    }

    public void setAttendance_weekdays(List<Integer> attendance_weekdays) {
        this.attendance_weekdays = attendance_weekdays;
    }

    public List<List<Integer>> getDoor_range() {
        return door_range;
    }

    public void setDoor_range(List<List<Integer>> door_range) {
        this.door_range = door_range;
    }

    public List<Integer> getDoor_weekdays() {
        return door_weekdays;
    }

    public void setDoor_weekdays(List<Integer> door_weekdays) {
        this.door_weekdays = door_weekdays;
    }

    @Override
    public String toString() {
        return "Company{" +
                "attendance_on=" + attendance_on +
                ", consigner='" + consigner + '\'' +
                ", create_time=" + create_time +
                ", data_version=" + data_version +
                ", deployment=" + deployment +
                ", feature_version=" + feature_version +
                ", full_day=" + full_day +
                ", id=" + id +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", scenario='" + scenario + '\'' +
                ", upload=" + upload +
                ", attendance_weekdays=" + attendance_weekdays +
                ", door_range=" + door_range +
                ", door_weekdays=" + door_weekdays +
                '}';
    }
}