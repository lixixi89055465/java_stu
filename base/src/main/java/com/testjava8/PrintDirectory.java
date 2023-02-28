package com.testjava8;

import java.io.File;

public class PrintDirectory {
    public static void printDirectory(File file){
       File[]child=file.listFiles();
       for(File childFile :child){
           if (childFile.isDirectory()){
               System.out.println(childFile.getName());
               printDirectory(childFile);
           }
           System.out.println(childFile.getName());
       }
    }
    public static void main(String[] args) {
        String path="D:\\workspace\\java_stu\\base\\src\\main\\java\\com";
        printDirectory(new File(path));
    }
}
