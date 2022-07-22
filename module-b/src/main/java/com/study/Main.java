package com.study;

import com.test.User;

import java.lang.reflect.Field;


public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        User user=new User("lixiang",12);
//        System.out.println(user);

        User user=new User("AAA",18);
        Class<User> userClass=User.class;
        Field field=userClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(user));


    }
}
