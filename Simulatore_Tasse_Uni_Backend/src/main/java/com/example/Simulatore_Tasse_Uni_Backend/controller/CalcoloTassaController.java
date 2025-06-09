package com.example.Simulatore_Tasse_Uni_Backend.controller;


import com.example.Simulatore_Tasse_Uni_Backend.models.CalcoloTassa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcoloTassaController {
    private CalcoloTassa service;
    public CalcoloTassaController (CalcoloTassa service) {
        this.service = service;
    }

    @GetMapping("/calcola")
    public String  CalcolaTassa(float valoreISEE) {
        return service.calcolaFascia(valoreISEE);
    }

}
