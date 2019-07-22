package com.zero.mao.service;
import com.zero.mao.Employee;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by guoyu.mao on 2019/7/23.
 * Email:maoguoyu@ewell.cc
 */

@WebService(serviceName="EmployeeService")
public interface EmployeeManager {

    void add(@WebParam(name="employee")Employee employee);

    @WebResult(name="employees")List<Employee> query();

}
