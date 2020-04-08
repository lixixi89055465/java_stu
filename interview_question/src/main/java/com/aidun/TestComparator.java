package com.aidun;

import java.util.*;

/**
 * @author lixiang,
 * @date 2020/4/8
 */
public class TestComparator {

    public static void main(String[] args) {
        test1();

    }

    /**
     * .【强制】在 JDK7 版本及以上，Comparator 实现类要满足如下三个条件，不然 Arrays.sort，
     * Collections.sort 会抛 IllegalArgumentException 异常。
     * 说明：三个条件如下
     * 1） x，y 的比较结果和 y，x 的比较结果相反。
     * 2） x>y，y>z，则 x>z。
     * 3） x=y，则 x，z 比较结果和 y，z 比较结果相同*
     */
    private static void test1() {
        Student student1 = new Student(3);
        Student student2 = new Student(3);
        Student student3 = new Student(3);
        Student student4 = new Student(3);
        Student student5 = new Student(3);
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        };
//        int compare = cp_stu.compare(student1, student2);
        int compare = studentComparator.compare(student1, student1);
        System.out.println(compare);

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);
        List<Student> list1=new ArrayList<>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        Collections.sort(list1,studentComparator);
        list1.forEach(e->{
            System.out.println(e);
        });
    }
}


class Student {
    private Integer id;

    public Student(int id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
