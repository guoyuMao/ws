package jax_ws.service;

import jax_ws.domain.User;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface HelloService {
    String sayHi(String text);
    String getUser(User user);
    List<User> getListUser();
}
