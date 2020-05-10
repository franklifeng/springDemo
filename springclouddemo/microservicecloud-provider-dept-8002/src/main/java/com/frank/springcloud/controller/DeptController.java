package com.frank.springcloud.controller;

import com.frank.springcloud.entities.Dept;
import com.frank.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author frank
 * @create 2020-02-07 10:21
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping(value="/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        return service.addDept(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
    public Dept findById(@PathVariable Long id){
        return service.findById(id);
    }

    @RequestMapping(value="/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }
}
