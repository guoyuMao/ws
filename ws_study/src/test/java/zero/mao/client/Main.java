package com.zero.mao.client;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by guoyu.mao on 2019/7/23.
 * Email:maoguoyu@ewell.cc
 */
public class Main {

    /**
     * Get
     * @param mobileCode
     * @param userID
     * @throws Exception
     */
    public void get(String mobileCode ,String userID ) throws Exception{
        URL url=new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode="+mobileCode+
                "&userID="+userID);
        HttpURLConnection conn=(HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");

        if(conn.getResponseCode()==HttpURLConnection.HTTP_OK){ //结果码=200
            InputStream is=conn.getInputStream();
            //内存流 ，
            ByteArrayOutputStream boas=new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                boas.write(buffer, 0, len);
            }
            System.out.println("GET请求获取的数据:"+boas.toString());
            boas.close();
            is.close();
        }
    }

    /**
     * 2.Post请求 ：通过Http-Client 框架来模拟实现 Http请求
     * HttpClient访问网络的实现步骤：
     *  1. 准备一个请求客户端:浏览器
     *  2. 准备请求方式： GET 、POST
     *  3. 设置要传递的参数
     *  4.执行请求
     *  5. 获取结果
     */
    public void post(String mobileCode ,String userID) throws Exception{

        HttpClient client=new HttpClient();
        PostMethod postMethod=new PostMethod("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo");
        //3.设置请求参数
        postMethod.setParameter("mobileCode", mobileCode);
        postMethod.setParameter("userID", userID);
        //4.执行请求 ,结果码
        int code=client.executeMethod(postMethod);
        //5. 获取结果
        String result=postMethod.getResponseBodyAsString();
        System.out.println("Post请求的结果："+result);
    }


    //2.Post请求 ：通过Http-Client 框架来模拟实现 Http请求
    public void soap() throws Exception{

        HttpClient client=new HttpClient();
        PostMethod postMethod=new PostMethod("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        //3.设置请求参数
        postMethod.setRequestBody(new FileInputStream("c:/soap.xml"));
        //修改请求的头部
        postMethod.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
        //4.执行请求 ,结果码
        int code=client.executeMethod(postMethod);
        System.out.println("结果码:"+code);
        //5. 获取结果
        String result=postMethod.getResponseBodyAsString();
        System.out.println("Post请求的结果："+result);
    }

    @Test
    public void test() {
        String mobile = "15683053295";
        String userId = "";
        try {
//            get(mobile, userId);
            post(mobile, userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
