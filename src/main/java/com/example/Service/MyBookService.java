package com.example.Service;

import com.example.Entity.MyBooks;

import java.util.List;

public interface MyBookService {

    public void saveMyBooks(MyBooks myBooks);

    public MyBooks getoneMybooks(long id);

    public void deleteMybooks(long id);

    public List<MyBooks> getallMyBooks();
}
