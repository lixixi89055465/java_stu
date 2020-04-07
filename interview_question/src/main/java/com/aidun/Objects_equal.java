package com.aidun;

import java.util.Comparator;
import java.util.Objects;

public class Objects_equal {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee employee1=new Employee();
        Objects.compare(employee, employee1, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
    }
}
