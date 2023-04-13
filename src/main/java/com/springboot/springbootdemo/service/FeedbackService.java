package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.bean.Feedback;

import java.util.List;

public interface FeedbackService {
/**
     * 新增数据
     * @param feedback
     * @return
     */
    boolean addFeedback(Feedback feedback);

    /**
     * 修改数据
     * @param feedback
     * @return
     */
    boolean updateFeedback(Feedback feedback);

    /**
     * 删除数据
     * @param id
     * @return
     */
    boolean deleteFeedback(int id);

    /**
     * 根据名字查询数据
     * @param feedbackType
     */
    List<Feedback> findFeedbackByType(String feedbackType);

    /**
     * 查询所有数据
     * @return
     */
    List<Feedback> findAllFeedbacks();
}
