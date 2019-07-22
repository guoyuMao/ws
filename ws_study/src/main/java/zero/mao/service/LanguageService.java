package com.zero.mao.service;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by guoyu.mao on 2019/7/23.
 * Email:maoguoyu@ewell.cc
 */


@WebService(serviceName="languageManager")
public interface LanguageService {

    @WebMethod
    public @WebResult(name="language")String getLanguage(@WebParam(name="position")int position);

}
