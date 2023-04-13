package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.bean.Feedback;
import com.springboot.springbootdemo.dao.FeedbackDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    private FeedbackDao feedbackDao;

    @Override
    public boolean addFeedback(Feedback feedback) {
        boolean flag=false;
        try{
            feedbackDao.addFeedback(feedback);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateFeedback(Feedback feedback) {
        boolean flag=false;
        try{
            feedbackDao.updateFeedback(feedback);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteFeedback(int id) {
        boolean flag=false;
        try{
            feedbackDao.deleteFeedback(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Feedback> findFeedbackByType(String feedbackType) {
        return feedbackDao.findByType(feedbackType);
    }

    @Override
    public List<Feedback> findAllFeedbacks() {
        return feedbackDao.findAll();
    }
}
