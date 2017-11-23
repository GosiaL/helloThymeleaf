package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.model.Book;

import java.util.Arrays;

@Controller
public class BookController {

    @GetMapping("/loop")
    public String loop(ModelMap modelMap) {
        modelMap.addAttribute("books", Arrays.asList(new Book("A1", "T1", 12), new Book("A2", "T2", 22), new Book("A3", "T3", 33)));
        return "loop";
    }
}
