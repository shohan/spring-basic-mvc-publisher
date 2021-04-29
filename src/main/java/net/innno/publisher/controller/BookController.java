package net.innno.publisher.controller;

import net.innno.publisher.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("add")
    public String getBook(@ModelAttribute("book")Book book) {
        return "book-form";
    }

    @PostMapping("add")
    public String addBook(@ModelAttribute("book")Book book) {
        System.out.println(book.getName());
        return "book-form";
    }
}
