package com.aidun;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author lixiang
 * @date 2020-03-26-16:16
 */
public class ArraySort {
    public static void main(String[] args) {

    }

    /**
     * 公约数
     */
    private static void minCommonMultiple() {
        int a = 100, b = 90;
        int min = maxCommonDivisor(a, b);
        System.out.println(a * b / maxCommonDivisor(a, b));
    }


    /**
     * 公约数
     * @param a
     * @param b
     * @return
     */
    private static int maxCommonDivisor(int a, int b) {
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }
        while (temp != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
        return a;
    }

    private static void factor() {
        int num = 97;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                list.add(i);
                num /= i;
            }
            if (num == 1) {
                break;
            }
        }
        list.stream().forEach(e -> {
            System.out.println(e);
        });
    }

    /**
     * 获取指定的位置
     *
     * @param num
     * @param start
     * @param end
     * @return
     */
    public static int intSub(int num, int start, int end) {
        String s = String.valueOf(num);
        String subString = s.substring(s.length() - end, s.length() - start + 1);
        return Integer.parseInt(subString);
    }

    private static void obb2Prime() {
        int[] ins = obb2Prime(457);
        for (int i = 0; i < ins.length; i++) {
            System.out.print(ins[i] + "\t");
        }
    }

    public static int[] obb2Prime(int obb) {
        if (obb % 2 != 0) {
            return null;
        }
        for (int i = 2; i < obb / 2; i++) {
            if (IsPrime3(i) && IsPrime3(obb - i)) {
                return new int[]{i, obb - i};
            }
        }
        return null;
    }

    public static boolean IsPrime3(int n) {
        if (n <= 3) {
            return n > 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 7、统计字符串中子串出现的次数
     */
    private static void subCount() {
        String str1 = "abcfjsljfabclsajgshabc";
        String str2 = "abc";
        int i;
        int count = 0;
        while ((i = str1.indexOf(str2)) >= 0) {
            str1 = str1.substring(i + str2.length());
            count++;
        }
        System.out.println(count);
    }

    private static void test06() {
        String s = String.valueOf(4354355);
        String subString = s.substring(s.length() - 4, s.length() - 4 + 1);
        System.out.println(Integer.parseInt(subString));
    }

    private static void test05() {
        int[] arr = {3, 5, 6, 3, 4};
        int[] aaa = IntStream.of(arr).boxed()//
                .sorted(Comparator.reverseOrder())//
                .mapToInt(e -> (int) e)//
                .toArray();
        int[] bbb = IntStream.of(arr).boxed()
                .sorted(Comparator.reverseOrder())//
                .mapToInt(e -> (int) e)
                .toArray();
    }


    private static void reverse01() {
        Integer[] arr = {3, 5, 6, 3, 4};
        List list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
        Integer[] integers = (Integer[]) list.toArray();
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
        }
    }

    /**
     * 降序
     *
     * @param arr
     * @return
     */
    public static Integer[] sortByArrays(Integer... arr) {
        Arrays.sort(arr, (x, y) -> x - y);
        return arr;
    }

    /**
     * 升序
     *
     * @param arr
     * @return
     */
    public static int[] sortByArrays(int... arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * 逆序
     *
     * @param arr
     * @return
     */
    public static Integer[] reverseInteger(Integer[] arr) {
        List<Integer> integers = Arrays.asList(arr);
        Collections.reverse(integers);
        return integers.toArray(new Integer[arr.length]);
    }


}

