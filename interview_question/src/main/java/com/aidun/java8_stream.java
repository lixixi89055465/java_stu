package com.aidun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 1.创建流
 * 2。中间流
 * 3。终止流
 *
 * @author lixiang
 * @date 2020-03-27-09:57
 */
public class java8_stream {
    public static List<Employee> employees = Arrays.asList(

            new Employee("张撒", 18, 9999.99, Employee.Status.FREE),
            new Employee("里斯", 58, 5555.55, Employee.Status.BUSY),
            new Employee("wangwu", 28, 3333.33, Employee.Status.VOCATION),
            new Employee("zhaoliu", 38, 6666.66, Employee.Status.FREE),
            new Employee("tianqi", 12, 8888.88, Employee.Status.BUSY)
    );

    public static void main(String[] args) {
        /**
         * 终止操作
         * allMatch--检查是否匹配所有元素
         * anyMatch--检查是否至少匹配一个元素
         * noneMatch--检查是否没有匹配所有元素
         * findFirst--返回第一个元素
         * findAny--返回当前流中元素的任意元素
         * count--返回流中元素的总个数
         * max --返回流中最大值
         * min--返回流中的最小值
         */
        boolean b1 = employees.stream().allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);
        boolean b = employees.stream().anyMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b);
        boolean b2 = employees.stream().noneMatch(e -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);
        Optional<Employee> first = employees.stream().sorted((e1, e2) -> Double.compare(e1.getSlave(), e2.getSlave())).findFirst();
        System.out.println(first.get());

        Optional<Employee> any = employees.stream().filter((e) -> e.getStatus().equals(Employee.Status.BUSY)).findAny();
        System.out.println(any.get());
        Long count = employees.stream().count();
        System.out.println(count);
        Optional<Employee> max = employees.stream().max((e1, e2) -> Double.compare(e1.getSlave(), e2.getSlave()));
        System.out.println(max.get());
    }

    private static void test6() {
        /**
         * 排序
         * sorted() 自然排序 (Comparable )
         * sorted(Comparator com) --定制排序
         */
        employees.stream().sorted().forEach(e -> System.out.println(e));
        employees.stream().sorted((e1, e2) -> {
            if (e1.getAge() > e2.getAge()) {
                return -1;
            } else if (e2.getAge() < e2.getAge()) {
                return 1;
            }
            return 0;
        }).forEach(e -> System.out.println(e));
    }

    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();
        for (Character ch : str.toCharArray()) {
            list.add(ch);
        }
        return list.stream();
    }

    /**
     * 映射
     * map---接收Lambda,将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素中。
     * flatMap--接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流 。
     */
    private static void test5() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map((e) -> e.toUpperCase()).forEach(System.out::print);
        System.out.println();
        employees.stream().map(Employee::getAge).forEach(System.out::print);
        Stream<Stream<Character>> streamStream = list.stream().map(java8_stream::filterCharacter);
        System.out.println();
        streamStream.forEach(sm -> {
            sm.forEach(System.out::print);
            System.out.println();
        });
        Stream<Character> characterStream = list.stream().flatMap(java8_stream::filterCharacter);
        characterStream.forEach(e -> System.out.println(e));
        System.out.println();
    }

    private static void test4() {
        employees.stream()//
                .distinct()//
                .forEach(e -> {
                    System.out.println(e);
                });
    }

    private static void test3() {
        employees.stream()//
                .filter((e) -> e.getSlave() > 5000)//
                .skip(2)//
                .forEach(System.out::print);
    }

    /**
     * 筛选与切片
     * filter --接收Lambda,从流中排除某些元素。
     * limit --截断流，使其元素不超过给定数量 。
     * skip(n)--跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流.与limit(n)互补
     * distinct--筛选，通过流所生成元素的hashcode()和equals()去除重复元素
     */
    private static void test2() {
        //内部迭代，不会执行任何操作
        Stream stream = employees.stream().filter(e -> e.getAge() > 44);
        //终止操作：一次性执行全部内容，即"惰性求值"
        stream.forEach(e -> System.out.println(e));
        System.out.println();
    }

    /**
     * 创建流
     */
    private static void test01() {
        //通过collection
        List<Stream> list = new ArrayList<>();
        Stream<Stream> stream = list.stream();
        Stream<Stream> stream1 = list.parallelStream();
        Employee[] emps = new Employee[10];
        //通过Arrays 中的静态方法stream()获取数组流
        Stream<Employee> stream2 = Arrays.stream(emps);
        //通过stream 类中的of方法
        Stream<String> aa = Stream.of("aa", "bb", "cc");
        //4.创建无限流
        //迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10).forEach(System.out::println);

        //生成
        Stream stream5 = Stream.generate(Math::random);
        stream5.limit(5).forEach(System.out::println);
    }
}
