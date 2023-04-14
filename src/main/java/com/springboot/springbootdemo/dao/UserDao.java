package com.springboot.springbootdemo.dao;

import com.springboot.springbootdemo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 新增数据
     */
    @Insert("insert into users(user_id,district_id,username,password,email,phone,is_admin) values (#{user_id},#{district_id},#{username},#{password},#{email},#{phone},#{is_admin})")
    void addUser(User user);

    /**
     * 修改数据
     */
    @Update("update users set username=#{username},email=#{email},phone=#{phone} where user_id=#{user_id}")
    void updateUser(User user);

    /**
     * 删除数据
     */
    @Delete("delete from users where user_id=#{id}")
    void deleteUser(int id);

    /**
     * 根据查询数据
     *
     */
    @Select("select user_id,username,password,email,phone,is_admin from users where username=#{userName}")
    User findByName(@Param("userName") String userName);

    /**
     * 查询所有数据
     */
    @Select("select * from users")
    List<User> findAll();
}
