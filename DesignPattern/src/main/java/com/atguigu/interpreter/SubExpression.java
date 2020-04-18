package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * @author lixiang
 * @date 2020-04-18-12:39
 * @description
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 求出left 和 right 表达式相减后的结果
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.interpreter(var);
    }
}
