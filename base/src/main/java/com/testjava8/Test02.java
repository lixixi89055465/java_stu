package com.testjava8;

import java.io.File;
public class Test02 {
    public static void main(String[] args) {
        String path="d:/";
        File file=new File(path);
        File []tempList=file.listFiles();
        System.out.println("该目录下对象个数 ");
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()){
                System.out.println(" 文  件："+tempList[i]);
            }
            if (tempList[i].isDirectory()){
                System.out.println("文件夹:"+tempList[i]);
            }
        }
    }

}
