package com.monikapustula.dogotogo.web;

import com.monikapustula.dogotogo.model.DogDto;
import com.monikapustula.dogotogo.model.DogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FormController {
    private final DogService dogService;
    List<DogDto> dogs;

    public FormController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/form")
    String getForm() {
        return "form";
    }

    @PostMapping("/save")
    String getOutcome(@RequestParam int size, @RequestParam int activity, @RequestParam int coatCare) {
        dogs = dogService.getDogs(size, activity, coatCare);
        return "redirect:outcome";
    }

    @GetMapping("/outcome")
    String getOutcome(Model model) {
        model.addAttribute("dogs", dogs);
        return "outcome";
    }
    // TODO: 01.03.2024
    // style for outcome for mobile
    // add th:fragment for header or layout
    // add validation
    // implement prod profile
    // consider api and security

}
