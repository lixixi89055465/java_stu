package com.atguigu.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author lixiang
 * @date 2020-04-18-12:41
 * @description
 */
public class Calculator {
    //定义表达式
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        //遍历我的的字符数组 ,即遍历[a,+,b]
        //针对不同的情况，做相应的处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+'://
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));//
                    break;
                case '-'://
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;

            }
        }
        //当遍历完整个charArray数组后，stack就得到了最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b 和var={ a=10,b=20 }
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
