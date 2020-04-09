package com.aidun;

/**
 * 不要在 finally 块中使用 return。
 * 说明：try 块中的 return 语句执行成功后，并不马上返回，而是继续执行 finally 块中的语句，如果此处存
 * 在 return 语句，则在此直接返回，无情丢弃掉 try 块中的返回点
 */
public class TestException {
    private int x = 0;

    public static void main(String[] args) {
        TestException testException = new TestException();
        int result = testException.checkReturn();
        System.out.println(result);
    }

    public int checkReturn() {
        try {
            return ++x;
        } finally {
            return ++x;
        }
    }
}
