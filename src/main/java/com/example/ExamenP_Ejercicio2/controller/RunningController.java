
package com.example.ExamenP_Ejercicio2.controller;



import com.example.ExamenP_Ejercicio2.model.Runner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RunningController {
    @GetMapping("/form")
    public String showRegistrationForm(Model model) {
        model.addAttribute("runner", new Runner());
        return "form";
    }
    @PostMapping("/submit")
    public String processRegistration(@ModelAttribute Runner runner, Model model) {
        model.addAttribute("runner", runner);
        return "success";
    }

}
