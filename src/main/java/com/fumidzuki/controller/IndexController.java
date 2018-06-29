package com.fumidzuki.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fumidzuki.form.IndexForm;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("input", new IndexForm());
        return "index";
    }

    @PostMapping
    public String postIndex(@ModelAttribute("input") @Valid IndexForm form, BindingResult bindingResult) {
        return "index";
    }

}
