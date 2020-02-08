package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "book")

public class Book {

    @Id
    //@GeneratedValue
    private int id;

    @NotBlank
    private String bookname;

    public Book(){ super();}
    public Book (int id, String bookname) {
        super();
        this.id = id;
        this.bookname= bookname;
    }
    public Integer getId(){return id;}
    public Integer setId(){return id;}
    public String getBookname() {return bookname;}
    public void setBookname (String bookname){
        this.bookname = bookname;
    }



}
