package zero.mao.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by guoyu.mao on 2019/7/23.
 * Email:maoguoyu@ewell.cc
 */
@Data
public class Employee implements Serializable {
    private Integer  id;
    private String name;
    private Integer age;
}
