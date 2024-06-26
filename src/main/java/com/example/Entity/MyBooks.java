package com.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mybooks")
public class MyBooks {

    @Id
    private long id;
    private String name;
    private String author;
    private double price;

    //PDC
    public MyBooks() {

    }

    //PPC
    public MyBooks(long id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //PSM & PGM
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //ToString

    @Override
    public String toString() {
        return "MyBooks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}


