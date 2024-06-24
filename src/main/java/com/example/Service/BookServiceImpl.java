package com.example.Service;

import com.example.Entity.Book;
import com.example.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book, long id) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getallBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getoneBook(long id) {
        return bookRepository.findById(id).get();
    }
}
