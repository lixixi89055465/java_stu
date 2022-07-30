package com.testjava8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Pair{
    private String key;
    private Double value;

    public Pair(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
public class LocalDateTest {
    public static void main(String[] args) {
//        List<Pair<String,Double>>pairArrayList=new ArrayList<>(3);
        List<Pair> pairArrayList=new ArrayList<>(3);
        pairArrayList.add(new Pair("version",12.0));
        pairArrayList.add(new Pair("version",12.19));
        pairArrayList.add(new Pair("version",null));
        Map<String,Double> map=pairArrayList.stream().collect(
                Collectors.toMap(Pair::getKey,Pair::getValue,(v1,v2)->v2)
        );
        System.out.println(map);



    }
}
