package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.bean.District;

import java.util.List;

public interface DistrictService {
    /**
     * 新增用户
     * @param district
     * @return
     */
    boolean addDistrict(District district);

    /**
     * 修改用户
     * @param district
     * @return
     */
    boolean updateDistrict(District district);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteDistrict(int id);

    /**
     * 根据名字查询用户信息
     * @param districtName
     */
    District findDistrictByName(String districtName);


    /**
     * 查询所有数据
     * @return
     */
    List<District> findAllDistricts();

}
