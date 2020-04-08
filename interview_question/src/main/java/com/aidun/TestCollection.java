package com.aidun;

import java.util.*;

/**
 * @author lixiang,
 * @date 2020/4/8
 */
public class TestCollection {
    public static void main(String[] args) {
        test3();
    }

    /**
     * immutable的使用
     * immutable是一种持久化数据结构，immutable数据就是一旦创建，就不能更改的数据，
     * 每当对immutable对象进行修改的时候，就会返回一个新的immutable对象，
     * 以此来保证数据的不可变。
     */
    private static void test3() {
        //在jdk8
        List<String> stringList = Arrays.asList("a", "b", "c");
        List<String> strings = Collections.unmodifiableList(stringList);
        // In JDK 9:
//        使用 List.of 工厂方法创建 immutable list，list 中的元素是有序的，允许重复，但不允许为 null。
//        List stringList = List.of("a", "b", "c");

        Set<String> stringsSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> strings1 = Collections.unmodifiableSet(stringsSet);
        System.out.println(strings1);
        strings1.add("bb");
        Collections.emptyList();
        List<String> list3=Collections.singletonList("a");


    }

    /**
     * 在使用 Collection 接口任何实现类的 addAll()方法时，都要对输入的集合参数进行
     * NPE 判断。
     * 说明：在 ArrayList#addAll 方法的第一行代码即 Object[] a = c.toArray(); 其中 c 为输入集合参数，如果
     * 为 null，则直接抛出异常。
     */
    private static void test2() {
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
        List<String>allList=new ArrayList<>();
        allList.addAll(strList);
        allList.forEach(e->{
            System.out.println(e);
        });
//        List list1=Arrays.asList();
        List list1=null;
        allList.addAll(list1);
        System.out.println(allList.size());
    }

    private static void test1() {
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
//        strList.add("guan");
//        strList.add("bao");
        String[] strings = strList.toArray(new String[4]);
        for (int j = 0; j < strings.length; j++) {
            System.out.println(strings[j]);
        }
    }
}
