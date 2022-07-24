package com.testjava16;

public class Student {
    private final String name;
    public Student(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)return true;
        if (obj instanceof Student){
            Student student=(Student) obj;
            return student.name.equals(this.name);
        }
        return false;
    }

    public static void main(String[] args) {
        Student sA=new Student("A");
        Student sB=new Student("B");
        System.out.println(sA.equals(sB));
    }
}

