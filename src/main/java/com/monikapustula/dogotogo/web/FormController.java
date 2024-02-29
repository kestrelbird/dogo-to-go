package com.monikapustula.dogotogo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    String getForm() {
        return "form";
    }

    @PostMapping("/save")
    String getOutcome(@RequestParam int size, @RequestParam int activity, @RequestParam int coatCare) {
        return "redirect:outcome";
    }

    @GetMapping("/outcome")
    String getOutcome() {
        return "outcome";
    }
}
