package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author lixiang
 * @date 2020-04-18-12:32
 * @description 抽象运算符解析器 这里，每个运算符都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，
 * 都是Expression类的实现类 。
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为SymbolExpression 是让其子类来实现的，因此interpreter 是一个默认实现
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
