package com.example.trackingtest.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class TestInfoVO {
    @PrimaryKey
    @Expose
    @SerializedName("startTime")
    public int startTime;

    @Expose
    @SerializedName("title")
    public String title;

    @Expose
    @SerializedName("memo")
    public String memo;

    @Expose
    @SerializedName("age")
    public String age;

    @Expose
    @SerializedName("gender")
    public String gender;

    @Expose
    @SerializedName("height")
    public String height;

    @Expose
    @SerializedName("weight")
    public String weight;

    @Expose
    @SerializedName("name")
    public String name;

    public TestInfoVO(int startTime, String title, String memo, String age, String gender, String height, String weight, String name) {
        this.startTime = startTime;
        this.title = title;
        this.memo = memo;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }
}
