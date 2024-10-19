package com.deepak.springmvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }
    @RequestMapping("/")
    public String greet() {
        return "index";
    }

//    @RequestMapping("add")
//    public ModelAndView addTwoNumbers(int num1, int num2, ModelAndView mv) {
//        mv.addObject("result", num1 + num2);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String addTwoNumbers(@ModelAttribute Alien alien) {
        return "result";
    }
}
