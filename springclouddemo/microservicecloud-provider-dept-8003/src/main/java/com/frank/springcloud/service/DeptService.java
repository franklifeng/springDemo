package com.frank.springcloud.service;

import com.frank.springcloud.entities.Dept;

import java.util.List;

/**
 * @author frank
 * @create 2020-02-07 10:15
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> list();
}
