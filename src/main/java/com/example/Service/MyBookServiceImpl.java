package com.example.Service;

import com.example.Entity.MyBooks;
import com.example.Repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookServiceImpl implements MyBookService {

    @Autowired
    private MyBookRepository myBookRepository;

    @Override
    public void saveMyBooks(MyBooks myBooks) {
        myBookRepository.save(myBooks);
    }

    @Override
    public MyBooks getoneMybooks(long id) {
        return myBookRepository.findById(id).get();
    }

    @Override
    public void deleteMybooks(long id) {
        myBookRepository.deleteById(id);
    }

    @Override
    public List<MyBooks> getallMyBooks() {
        return myBookRepository.findAll();
    }
}
