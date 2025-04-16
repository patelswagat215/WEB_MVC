package in.myproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.myproject.entity.Book;
import in.myproject.repository.BookRepository;

@Controller
public class FindBook {

    @Autowired
    BookRepository repo;

    @GetMapping("/book")
    public ModelAndView faindBookById(@RequestParam(value = "id", required = false) Integer id){
        ModelAndView m1 = new ModelAndView();
        if (id == null) {
            // Handle the case where id is not provided
            m1.addObject("errorMessage", "ID parameter is missing.");
            m1.setViewName("index");
            return m1;
        }

        Optional<Book> byId = repo.findById(id);
        if (byId.isPresent()) {
            Book b1 = byId.get();
            m1.addObject("book", b1);
        } else {
            // Add error message to the ModelAndView
            m1.addObject("errorMessage", "No book found with the given ID.");
        }
        // Set the view name
        m1.setViewName("index");

        return m1;
    }
}
