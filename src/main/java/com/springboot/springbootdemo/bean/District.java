package com.springboot.springbootdemo.bean;

public class District {
    private int district_id;
    private String district_name;
    private float latitude;
    private float longitude;

    // Constructors
    public District() {
    }

    public District(int districtId, String name, float latitude, float longitude) {
        this.district_id = districtId;
        this.district_name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and Setters
    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

}

