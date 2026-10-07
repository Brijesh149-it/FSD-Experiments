package com.example.Exp_10;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/addStudent")
    public String addStudent(
            @Valid @ModelAttribute("student") Student s,
            BindingResult br,
            Model model) {

        if (br.hasErrors()) {

            Map<String, String> errors = new HashMap<>();

            br.getFieldErrors().forEach(error ->
                    errors.put(error.getField(), error.getDefaultMessage())
            );

            model.addAttribute("errors", errors);

            return "student";
        }

        return "addStudent";
    }
}