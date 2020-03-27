package com.aidun;

import java.util.Objects;

/**
 * @author lixiang
 * @date 2020-03-27-09:59
 */
public class Employee implements Comparable<Employee> {
    private String username;
    private Integer age;
    private double slave;
    private Status status;

    public Employee() {
    }

    public Employee(String username, Integer age, double slave) {
        this.username = username;
        this.age = age;
        this.slave = slave;
    }

    public Employee(String username, Integer age, double slave, Status status) {
        this.username = username;
        this.age = age;
        this.slave = slave;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSlave() {
        return slave;
    }

    public void setSlave(double slave) {
        this.slave = slave;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.slave, slave) == 0 &&
                Objects.equals(username, employee.username) &&
                Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, slave);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", slave=" + slave +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        }
        return 0;
    }

    public enum Status {
        FREE, BUSY, VOCATION;
    }
}
