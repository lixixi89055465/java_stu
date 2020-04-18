package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author lixiang
 * @date 2020-04-18-12:28
 * @description
 *
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 */
public abstract class Expression {
    //a+b+c
    public abstract int interpreter(HashMap<String,Integer> var);
}
