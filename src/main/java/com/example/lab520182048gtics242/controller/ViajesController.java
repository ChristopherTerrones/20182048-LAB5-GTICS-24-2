package com.example.lab520182048gtics242.controller;

import com.example.lab520182048gtics242.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ViajesController {
    @Autowired
    private ViajeRepository viajeRepository;
    @GetMapping("/tecnicos")
    public String tecnicos(Model model){
        model.addAttribute("listaViajes",viajeRepository.findAll());
        return "viajes";
    }
}
