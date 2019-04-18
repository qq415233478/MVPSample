package com.demo.idcard.net.bean;

import java.util.List;

public class Subject {

    private String avatar;
    private String come_from;
    private int company_id;
    private String department;
    private String description;
    private String email;
    private int end_time;
    private int gender;
    private int id;
    private String interviewee;
    private String name;
    private boolean password_reseted;
    private String phone;
    private int purpose;
    private int start_time;
    private int subject_type;
    private String title;
    private List<Integer> photo_ids;
    private List<Photo> photos;

    public Subject() {

    }

    public Subject(String name, int subject_type) {
        this.name = name;
        this.subject_type = subject_type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCome_from() {
        return come_from;
    }

    public void setCome_from(String come_from) {
        this.come_from = come_from;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInterviewee() {
        return interviewee;
    }

    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPassword_reseted() {
        return password_reseted;
    }

    public void setPassword_reseted(boolean password_reseted) {
        this.password_reseted = password_reseted;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPurpose() {
        return purpose;
    }

    public void setPurpose(int purpose) {
        this.purpose = purpose;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(int subject_type) {
        this.subject_type = subject_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getPhoto_ids() {
        return photo_ids;
    }

    public void setPhoto_ids(List<Integer> photo_ids) {
        this.photo_ids = photo_ids;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "avatar='" + avatar + '\'' +
                ", come_from='" + come_from + '\'' +
                ", company_id=" + company_id +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                ", end_time=" + end_time +
                ", gender=" + gender +
                ", id=" + id +
                ", interviewee='" + interviewee + '\'' +
                ", name='" + name + '\'' +
                ", password_reseted=" + password_reseted +
                ", phone='" + phone + '\'' +
                ", purpose=" + purpose +
                ", start_time=" + start_time +
                ", subject_type=" + subject_type +
                ", title='" + title + '\'' +
                ", photo_ids=" + photo_ids +
                ", photos=" + photos +
                '}';
    }
}
