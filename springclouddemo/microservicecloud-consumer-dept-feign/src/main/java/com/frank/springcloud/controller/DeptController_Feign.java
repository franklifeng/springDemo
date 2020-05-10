package com.frank.springcloud.controller;

import com.frank.springcloud.entities.Dept;
import com.frank.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author frank
 * @create 2020-02-10 10:32
 */
@RestController
public class DeptController_Feign {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }
}
