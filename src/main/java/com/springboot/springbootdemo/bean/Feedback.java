package com.springboot.springbootdemo.bean;
public class Feedback {
    private int feedback_id;
    private int user_id;
    private int district_id;
    private String feedback_type;
    private String feedback;
    private boolean is_finished;
    private String CREATED_AT;
    private String UPDATED_AT;

    // Constructors
    public Feedback() {
    }

    public Feedback(int feedbackId, int userId, int districtId, String feedbackType, String feedback, boolean isFinished, String createdAt, String updatedAt) {
        this.feedback_id = feedbackId;
        this.user_id = userId;
        this.district_id = districtId;
        this.feedback_type = feedbackType;
        this.feedback = feedback;
        this.is_finished = isFinished;
        this.CREATED_AT = createdAt;
        this.UPDATED_AT = updatedAt;
    }

    // Getters and Setters
    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

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

    public String getFeedback_type() {
        return feedback_type;
    }

    public void setFeedback_type(String feedback_type) {
        this.feedback_type = feedback_type;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public boolean getIs_finished() {
        return is_finished;
    }

    public void setIs_finished(boolean is_finished) {
        this.is_finished = is_finished;
    }
    public String getCREATED_AT() {
        return CREATED_AT;
    }

    public void setCREATED_AT(String CREATED_AT) {
        this.CREATED_AT = CREATED_AT;
    }

    public String getUPDATED_AT() {
        return UPDATED_AT;
    }

    public void setUPDATED_AT(String UPDATED_AT) {
        this.UPDATED_AT = UPDATED_AT;
    }

}
