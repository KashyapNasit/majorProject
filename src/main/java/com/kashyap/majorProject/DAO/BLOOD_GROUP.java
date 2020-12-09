package com.kashyap.majorProject.DAO;

public enum BLOOD_GROUP {
    A_POSITIVE("A+"),
    B_POSITIVE("B+"),
    AB_POSITIVE("AB+"),
    O_POSITIVE("O+"),
    A_NEGATIVE("A-"),
    B_NEGATIVE("B-"),
    AB_NEGATIVE("AB-"),
    O_NEGATIVE("O-");


    private String value;
    private BLOOD_GROUP(String value)
    {
        this.value = value;
    }

    public String toString()
    {
        return this.value; //This will return , # or +
    }
}
