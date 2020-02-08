package com.example.demo;

public class BookNotFoundException extends Exception {

    private Integer id;
    public BookNotFoundException(Integer id){
        super(String.format("Book not found with id   %s", id));
    }

}
