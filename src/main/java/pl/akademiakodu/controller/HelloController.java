package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("text1", "ht");
        return "hello";
    }

    @GetMapping("if")
    public String ifMethod(ModelMap modelMap){
        modelMap.addAttribute("text", "Sample text");
        modelMap.addAttribute("a", "123");
        modelMap.addAttribute("b", "456");
        return "if";
    }
}
