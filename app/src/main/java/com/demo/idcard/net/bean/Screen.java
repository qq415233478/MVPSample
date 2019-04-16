package com.demo.idcard.net.bean;

import java.util.List;

public class Screen {

    private boolean allow_all_subjects;
    private boolean allow_visitor;
    private Object box_address;
    private Object box_heartbeat;
    private String box_status;
    private Object box_token;
    private Object camera_address;
    private Object camera_name;
    private String camera_position;
    private Object camera_status;
    private Object description;
    private int id;
    private Object network_switcher;
    private int network_switcher_drive;
    private Object network_switcher_status;
    private Object network_switcher_token;
    private String screen_token;
    private double server_time;
    private int type;
    private List<?> allowed_subject_ids;

    public Screen(int id, String camera_address, String camera_position) {
        this.id = id;
        this.camera_address = camera_address;
        this.camera_position = camera_position;
    }

    public boolean isAllow_all_subjects() {
        return allow_all_subjects;
    }

    public void setAllow_all_subjects(boolean allow_all_subjects) {
        this.allow_all_subjects = allow_all_subjects;
    }

    public boolean isAllow_visitor() {
        return allow_visitor;
    }

    public void setAllow_visitor(boolean allow_visitor) {
        this.allow_visitor = allow_visitor;
    }

    public Object getBox_address() {
        return box_address;
    }

    public void setBox_address(Object box_address) {
        this.box_address = box_address;
    }

    public Object getBox_heartbeat() {
        return box_heartbeat;
    }

    public void setBox_heartbeat(Object box_heartbeat) {
        this.box_heartbeat = box_heartbeat;
    }

    public String getBox_status() {
        return box_status;
    }

    public void setBox_status(String box_status) {
        this.box_status = box_status;
    }

    public Object getBox_token() {
        return box_token;
    }

    public void setBox_token(Object box_token) {
        this.box_token = box_token;
    }

    public Object getCamera_address() {
        return camera_address;
    }

    public void setCamera_address(Object camera_address) {
        this.camera_address = camera_address;
    }

    public Object getCamera_name() {
        return camera_name;
    }

    public void setCamera_name(Object camera_name) {
        this.camera_name = camera_name;
    }

    public String getCamera_position() {
        return camera_position;
    }

    public void setCamera_position(String camera_position) {
        this.camera_position = camera_position;
    }

    public Object getCamera_status() {
        return camera_status;
    }

    public void setCamera_status(Object camera_status) {
        this.camera_status = camera_status;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getNetwork_switcher() {
        return network_switcher;
    }

    public void setNetwork_switcher(Object network_switcher) {
        this.network_switcher = network_switcher;
    }

    public int getNetwork_switcher_drive() {
        return network_switcher_drive;
    }

    public void setNetwork_switcher_drive(int network_switcher_drive) {
        this.network_switcher_drive = network_switcher_drive;
    }

    public Object getNetwork_switcher_status() {
        return network_switcher_status;
    }

    public void setNetwork_switcher_status(Object network_switcher_status) {
        this.network_switcher_status = network_switcher_status;
    }

    public Object getNetwork_switcher_token() {
        return network_switcher_token;
    }

    public void setNetwork_switcher_token(Object network_switcher_token) {
        this.network_switcher_token = network_switcher_token;
    }

    public String getScreen_token() {
        return screen_token;
    }

    public void setScreen_token(String screen_token) {
        this.screen_token = screen_token;
    }

    public double getServer_time() {
        return server_time;
    }

    public void setServer_time(double server_time) {
        this.server_time = server_time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<?> getAllowed_subject_ids() {
        return allowed_subject_ids;
    }

    public void setAllowed_subject_ids(List<?> allowed_subject_ids) {
        this.allowed_subject_ids = allowed_subject_ids;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "allow_all_subjects=" + allow_all_subjects +
                ", allow_visitor=" + allow_visitor +
                ", box_address=" + box_address +
                ", box_heartbeat=" + box_heartbeat +
                ", box_status='" + box_status + '\'' +
                ", box_token=" + box_token +
                ", camera_address=" + camera_address +
                ", camera_name=" + camera_name +
                ", camera_position='" + camera_position + '\'' +
                ", camera_status=" + camera_status +
                ", description=" + description +
                ", id=" + id +
                ", network_switcher=" + network_switcher +
                ", network_switcher_drive=" + network_switcher_drive +
                ", network_switcher_status=" + network_switcher_status +
                ", network_switcher_token=" + network_switcher_token +
                ", screen_token='" + screen_token + '\'' +
                ", server_time=" + server_time +
                ", type=" + type +
                ", allowed_subject_ids=" + allowed_subject_ids +
                '}';
    }
}