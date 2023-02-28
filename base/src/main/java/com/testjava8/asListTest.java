package com.testjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class asListTest {
    public static void main(String[] args) {
        String []str=new String[]{"chen","yang","hao"};
        List list= Arrays.asList(str);
        list.forEach(System.out::println);
//        list.add("aaaaaa");
        str[0]="change";
        list.forEach(System.out::println);
        List<String> strList=new ArrayList<>();
        strList.add("1");
        strList.add("2");
        for(String item:strList){
            if ("2".equals(item)){
                strList.remove(item);
            }
        }
        strList.forEach(System.out::println);
    }
}
