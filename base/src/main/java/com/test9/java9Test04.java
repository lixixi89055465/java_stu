package com.test9;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class java9Test04 {
    public static void main(String[] args) throws IOException {
        InputStream stream= Files.newInputStream(Paths.get("pom.xml"));
        try(stream){
            for (int w = 0; w < 100; w++) {
                System.out.println((char)stream.read());
            }
        }

    }
}
