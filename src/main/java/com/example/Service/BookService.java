package com.example.Service;

import com.example.Entity.Book;

import java.util.List;

public interface BookService {

    public void saveBook(Book book);

    public void updateBook(Book book, long id);

    public void deleteBook(long id);

    public List<Book> getallBooks();

    public Book getoneBook(long id);
}
