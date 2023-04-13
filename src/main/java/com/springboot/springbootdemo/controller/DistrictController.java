package com.springboot.springbootdemo.controller;

import com.springboot.springbootdemo.bean.District;
import com.springboot.springbootdemo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping(value = "/district", method = RequestMethod.POST)
    public boolean addDistrict(@RequestBody District district) {
        System.out.println("新增小区：");
        return districtService.addDistrict(district);
    }

    @RequestMapping(value = "/district", method = RequestMethod.PUT)
    public boolean updateDistrict(@RequestBody District district) {
        System.out.println("更新小区：");
        return districtService.updateDistrict(district);
    }

    @RequestMapping(value = "/district", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "id", required = true) int Id) {
        System.out.println("删除小区：");
        return districtService.deleteDistrict(Id);
    }

    @RequestMapping(value = "/district", method = RequestMethod.GET)
    public District findDistrictByName(@RequestParam(value = "districtName", required = true) String districtName) {
        System.out.println("查询小区：");
        return districtService.findDistrictByName(districtName);
    }

    @RequestMapping(value = "/districtAll", method = RequestMethod.GET)
    public List<District> findAllDistricts() {
        System.out.println("查询所有小区：");
        try {
            return districtService.findAllDistricts();
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
            return null;
        }
    }
}
