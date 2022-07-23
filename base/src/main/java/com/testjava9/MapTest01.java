package com.testjava9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("AAA",18,"BBB",20);
        System.out.println(map);
//        map.put("CCC",49);
//        System.out.println(map);
        Set<String> set=Set.of("BBB","CCC","AAAA");
        List<String> list=List.of("AAA","BBB","CCC");
        System.out.println(set);
        System.out.println(list);


    }
}
