package com.zero.mao.service.impl;

import com.zero.mao.Employee;
import com.zero.mao.service.EmployeeManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyu.mao on 2019/7/23.
 * Email:maoguoyu@ewell.cc
 */
public class EmployeeManagerImpl implements EmployeeManager {

    private List<Employee> employees=new ArrayList<>();
    @Override
    public void add(Employee employee){
        //添加到集合中
        employees.add(employee);
    }
    @Override
    public List<Employee> query(){
        return employees;
    }
}
