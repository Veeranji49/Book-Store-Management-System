package com.example.Controller;

import com.example.Entity.Book;
import com.example.Entity.MyBooks;
import com.example.Service.BookService;
import com.example.Service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookService myBookService;

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "book-register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping(value = "/available-books")
    public ModelAndView availableBooks() {
        List<Book> list = bookService.getallBooks();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bookList");
        mav.addObject("book", list);
        return mav;
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/available-books";
    }

    @GetMapping("/my-books")
    public String getMyBooks(Model model) {
        List<MyBooks> list = myBookService.getallMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") long id) {
        Book b = bookService.getoneBook(id);
        MyBooks mb = new MyBooks(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my-books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") long id, Model model) {
        Book b = bookService.getoneBook(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") long id) {
        bookService.deleteBook(id);
        return "redirect:/available-books";
    }
}
