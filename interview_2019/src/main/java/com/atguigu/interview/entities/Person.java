package com.atguigu.interview.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lixiang
 * @date 2020-05-17-16:38
 */
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private Integer id;
    private String personName;

    public Person(String personName) {
        this.personName = personName;
    }
}
