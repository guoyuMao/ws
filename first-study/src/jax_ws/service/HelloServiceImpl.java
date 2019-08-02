package jax_ws.service;

import jax_ws.domain.User;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(
        endpointInterface = "jax_ws.service.HelloService", //表示webservice接口名，因为一个类可以继承多个接口，你必须指明哪个是webservice接口
        serviceName = "HelloService",               //表示当前webservice的别名
        portName="HelloServicePort")                //表示当前webservice的端口名
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String text) {
        System.out.println("sayHi called...");
        return "Hi :" + text;
    }

    @Override
    public String getUser(User user) {
        System.out.println("sayUser called...");
        return "User:[id=" + user.getId() + "][name=" + user.getName() + "]";
    }

    @Override
    public List<User> getListUser() {
        System.out.println("getListUser called...");
        List<User> lst = new ArrayList<User>();
        lst.add(new User(2, "u2"));
        lst.add(new User(3, "u3"));
        lst.add(new User(4, "u4"));
        lst.add(new User(5, "u5"));
        lst.add(new User(6, "u6"));
        return lst;
    }
}
