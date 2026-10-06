package com.example.Exp_10;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @GetMapping("/registration")
    public ModelAndView registration() {
        return new ModelAndView("student", "student", new Student());
    }

    @PostMapping("/addStudent")
    public ModelAndView addStudent(
            @Valid @ModelAttribute("student") Student s,
            BindingResult br) {

        if (br.hasErrors()) {
            return new ModelAndView("student", "student", s);
        }

        return new ModelAndView("addStudent", "student", s);
    }
}