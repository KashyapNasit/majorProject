package com.kashyap.majorProject.DAO;

import java.sql.Date;

public class Student {
    private String regno;
    private String name;
    private String father_name;
    private Date dob;
    private String phone;
    private String mobile;
    private String email;
    private String address;
    private BLOOD_GROUP blood_group;
    private GENDER sex;
    private String state;
    private String category;


    public String getRegno() {
        return regno;
    }

    public Student setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getFather_name() {
        return father_name;
    }

    public Student setFather_name(String father_name) {
        this.father_name = father_name;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public Student setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public Student setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public BLOOD_GROUP getBlood_group() {
        return blood_group;
    }

    public Student setBlood_group(BLOOD_GROUP blood_group) {
        this.blood_group = blood_group;
        return this;
    }

    public GENDER getSex() {
        return sex;
    }

    public Student setSex(GENDER sex) {
        this.sex = sex;
        return this;
    }

    public String getState() {
        return state;
    }

    public Student setState(String state) {
        this.state = state;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Student setCategory(String category) {
        this.category = category;
        return this;
    }

    public String toString(){
        return getRegno()+" - "+getName();
    }


}
