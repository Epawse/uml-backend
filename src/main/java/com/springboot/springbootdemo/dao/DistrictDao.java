package com.springboot.springbootdemo.dao;

import com.springboot.springbootdemo.bean.District;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface DistrictDao {
    /**
     * 新增数据
     */
    @Insert("insert into districts(district_id,district_name,latitude,longitude) values (#{district_id},#{district_name},#{latitude},#{longitude})")
    void addDistrict(District district);

    /**
     * 修改数据
     */
    @Update("update districts set district_name=#{district_name},latitude=#{latitude},longitude=#{longitude} where district_id=#{district_id}")
    void updateDistrict(District district);

    /**
     * 删除数据
     */
    @Delete("delete from districts where district_id=#{id}")
    void deleteDistrict(int id);

    /**
     * 根据查询数据
     *
     */
    @Select("select * from districts where district_name=#{districtName}")
    District findByName(@Param("districtName") String districtName);

    /**
     * 查询所有数据
     */
    @Select("select * from districts")
    List<District> findAll();
}
