package com.springboot.springbootdemo.service;

import com.springboot.springbootdemo.bean.District;
import com.springboot.springbootdemo.dao.DistrictDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService{
    @Autowired
    private DistrictDao districtDao;

    @Override
    public boolean addDistrict(District district) {
        boolean flag=false;
        try{
            districtDao.addDistrict(district);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateDistrict(District district) {
        boolean flag=false;
        try{
            districtDao.updateDistrict(district);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteDistrict(int id) {
        boolean flag=false;
        try{
            districtDao.deleteDistrict(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public District findDistrictByName(String districtName) {
        return districtDao.findByName(districtName);
    }

    @Override
    public List<District> findAllDistricts() {
        return districtDao.findAll();
    }
}
