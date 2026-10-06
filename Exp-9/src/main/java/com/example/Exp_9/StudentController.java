package com.example.Exp_9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("student") Student student,
                             Model model) {

        model.addAttribute("student", student);
        return "result";
    }
}