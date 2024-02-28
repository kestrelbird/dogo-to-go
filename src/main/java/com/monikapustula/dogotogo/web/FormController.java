package com.monikapustula.dogotogo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    String getForm() {
        return "form";
    }
}
