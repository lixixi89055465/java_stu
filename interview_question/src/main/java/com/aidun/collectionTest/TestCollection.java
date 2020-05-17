package com.aidun.collectionTest;

import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lixiang,
 * @date 2020/4/8
 */
public class TestCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        System.out.println(list.size());
        for (int i = 0; i < 100; i++) {
            list.add((int) (System.nanoTime()%10));
        }
    }

    /**
     * 在无泛型限制定义的集合赋值给泛型限制的集合时，在使用集合元素时，需要进行
     * instanceof 判断，避免抛出 ClassCastException 异常。
     * 说明：毕竟泛型是在 JDK5 后才出现，考虑到向前兼容，编译器是允许非泛型集合与泛型集合互相赋值。
     */
    private static void test8() {
        List<String> generics = null;
        List notGenerics = new ArrayList(10);
        notGenerics.add(new Object());
        notGenerics.add(new Integer(1));
        generics = notGenerics;
// 此处抛出 ClassCastException 异常
        String string = generics.get(0);
    }

    /**
     * 使用工具类 Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方法，
     * 它的 add/remove/clear 方法会抛出 UnsupportedOperationException 异常。
     * 说明：asList 的返回对象是一个 Arrays 内部类，并没有实现集合的修改方法。Arrays.asList 体现的是适配
     * 器模式，只是转换接口，后台的数据仍是数组。
     */
    private static void test7() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> integers1 = Arrays.asList(5, 65, 76, 76);
        integers1.addAll(integers);
        System.out.println(integers1);
    }

    /**
     * 在使用 java.util.stream.Collectors 类的 toMap()方法转为 Map 集合时，一定要注
     * 意当 value 为 null 时会抛 NPE 异常。
     */
    private static void test6() {
        List<Pair> pairs = Arrays.asList(
                new Pair("a", 1.1),
                new Pair("b", 1.2),
//                new Pair("b", null),
                new Pair("c", 1.3));
        Map<String, Double> collect = pairs.stream().collect(
                Collectors.toMap(Pair::getName, Pair::getPrice, (v1, v2) -> 1.1));
        System.out.println(collect);
    }

    /**
     * 【强制】在使用 java.util.stream.Collectors 类的 toMap()方法转为 Map 集合时，一定要使
     * 用含有参数类型为 BinaryOperator，参数名为 mergeFunction 的方法，否则当出现相同 key
     * 值时会抛出 IllegalStateException 异常。
     * 说明：参数 mergeFunction 的作用是当出现 key 重复时，自定义对 value 的处理策略。
     */
    private static void test5() {
//        String[] departments = {"iERP", "iERP", "iERU"};
        String[] departments = {"iERP", "iERP", "iERU"};
        //跑出illegalStateException 异常
        Map<Integer, String> collect = Arrays.stream(departments).collect(Collectors.toMap(String::hashCode, str -> str));
        System.out.println(collect);
    }

    private static void test4() {
        Map<String, String> map = new HashMap<>();
        CollectionUtils.isEmpty(map);
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
        List<String> list3 = Collections.singletonList("a");


    }

    /**
     * 在使用 Collection 接口任何实现类的 addAll()方法时，都要对输入的集合参数进行
     * NPE 判断。
     * 说明：在 ArrayList#addAll 方法的第一行代码即 Object[] a = c.toArray(); 其中 c 为输入集合参数，如果
     * 为 null，则直接抛出异常。
     */
    private static void test2() {
        List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff");
        List<String> allList = new ArrayList<>();
        allList.addAll(strList);
        allList.forEach(e -> {
            System.out.println(e);
        });
//        List list1=Arrays.asList();
        List list1 = null;
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
