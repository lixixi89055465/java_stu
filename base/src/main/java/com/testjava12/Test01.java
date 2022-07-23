package com.testjava12;

public class Test01 {
    public static void main(String[] args) {
//        System.out.println(grade(45));
        System.out.println(grade1(45));
    }

    public static String grade1(int score) {
        score /= 10;
        String grade = "";
        return switch (score) {
            case 10, 9 -> "优秀";
            case 8, 7 -> "良好";
            case 6 -> "及格";
            default -> "不及格";
        };
    }
    public static String grade(int score){
        score/=10;
        String grade="";
        switch (score){
            case 10:
            case 9:
                grade="优秀";
                break;
            case 8:
            case 7:
                grade="良好";
                break;
            case 6:
                grade="及格";
                break;
                default:
                    grade="不及格";
        }
        return grade;
    }
}
