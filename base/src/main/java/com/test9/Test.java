package com.test9;

public abstract class Test<T>{
    public T t;
    public Test(T t){
        this.t=t;
    }
    public abstract T test();

}
