package com.atguigu.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiang
 * @date 2020-04-01-21:35
 */
//客户端
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

//学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id=" + i);
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }
}

//学校管理类
//分析Schoolmanager 类的直接朋友类有哪些Employee ,CollegeManager
//CollegeEmployee不是直接朋友，而是一个陌生类，这样违背了迪米特范泽
class SchoolManager {
    //返回学校的所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {//这里我们增加了5个员工到list
            Employee employee = new Employee();
            employee.setId("学校总部员工id=" + i);
            list.add(employee);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息 (id)
    void printAllEmployee(CollegeManager sub) {
        //分析问题
        //1。这里的CollegeEmployee不是SchoolManager的直接朋友
        //2。CollegeEmployee 是以局部变量方式出现在SchoolManager
        //3.违反了迪米特法则

        //获取到学院员工
        List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        System.out.println("-------学院员工-------");
        allEmployee.forEach(e -> {
            System.out.println(e.getId());
        });
        List<Employee> allEmployee1 = this.getAllEmployee();
        System.out.println("----------学院总部员工--------");
        for (Employee employee : allEmployee1) {
            System.out.println(employee.getId());
        }
    }
}
