package com.springboot.springbootdemo.controller;

import com.springboot.springbootdemo.bean.Feedback;
import com.springboot.springbootdemo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    public boolean addFeedback(@RequestBody Feedback feedback) {
        System.out.println("新增反馈：");
        return feedbackService.addFeedback(feedback);
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.PUT)
    public boolean updateFeedback(@RequestBody Feedback feedback) {
        System.out.println("更新反馈：");
        return feedbackService.updateFeedback(feedback);
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "id", required = true) int Id) {
        System.out.println("删除反馈：");
        return feedbackService.deleteFeedback(Id);
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.GET)
    public List<Feedback> findFeedbackByType(@RequestParam(value = "feedbackType", required = true) String feedbackType) {
        System.out.println("查询反馈：");
        return feedbackService.findFeedbackByType(feedbackType);
    }

    @RequestMapping(value = "/feedbackAll", method = RequestMethod.GET)
    public List<Feedback> findAllFeedbacks() {
        System.out.println("查询所有反馈：");
        try {
            return feedbackService.findAllFeedbacks();
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
            return null;
        }
    }

}
