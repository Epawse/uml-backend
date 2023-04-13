package com.springboot.springbootdemo.dao;

import com.springboot.springbootdemo.bean.Feedback;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface FeedbackDao {
    /**
     * 新增数据
     */
    @Insert("insert into feedbacks(feedback_id,user_id,district_id,feedback_type,feedback,is_finished) values (#{feedback_id},#{user_id},#{district_id},#{feedback_type},#{feedback},#{is_finished})")
    void addFeedback(Feedback feedback);

    /**
     * 修改数据
     */
    @Update("update feedbacks set user_id=#{user_id},district_id=#{district_id},feedback_type=#{feedback_type},feedback=#{feedback},is_finished=#{is_finished} where feedback_id=#{feedback_id}")
    void updateFeedback(Feedback feedback);

    /**
     * 删除数据
     */
    @Delete("delete from feedbacks where feedback_id=#{id}")
    void deleteFeedback(int id);

    /**
     * 根据查询数据
     *
     */
    @Select("select * from feedbacks where feedback_type=#{feedback_type}")
    List<Feedback> findByType(@Param("feedbackType") String feedbackType);

    /**
     * 查询所有数据
     */
    @Select("select * from feedbacks")
    List<Feedback> findAll();
}
