package com.jeancharlesexe.backend.controller;

import com.jeancharlesexe.backend.service.frete.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fretes")
public class FreteController {
    @Autowired
    private FreteService freteService;

    @GetMapping("/{modalidade}")
    public String escolherModalidade(@PathVariable String modalidade, @RequestParam Double peso) {
        return freteService.calcularFrete(modalidade, peso);
    }
}
