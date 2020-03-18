package com.atguigu.sh.juc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Book {
    private int id;
    private String bookName;
    private double price;

    public static void main(String[] args) {
        Book book = new Book();
        book.setId(11);
        book.setBookName("java");
        book.setPrice(33.5d);
    }
}
