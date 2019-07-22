package com.zero.mao.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by guoyu.mao on 2019/7/18.
 * Email:maoguoyu@ewell.cc
 */
@WebService
public class HelloService {
    @WebMethod
    public String syHello(String name) {
        return "hello " + name;
    }

}
