package com.springboot.springbootdemo.bean;

public class User {
    private static final long serialVersionUID = 1L;

    private int user_id;
    private int district_id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private boolean is_admin;

    // Constructors
    public User() {
    }

    public User(int userId, int districtId, String username, String password, String email, String phone, boolean isAdmin) {
        this.user_id = userId;
        this.district_id = districtId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.is_admin = isAdmin;
    }

    // Getters and Setters
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean isAdmin) {
        this.is_admin = isAdmin;
    }
}
