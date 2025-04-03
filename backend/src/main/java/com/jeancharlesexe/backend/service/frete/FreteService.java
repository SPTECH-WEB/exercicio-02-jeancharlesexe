package com.jeancharlesexe.backend.service.frete;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class FreteService {
    private Map<String, FreteStrategy> modalidades = new HashMap<>();

    public FreteService() {
        modalidades.put("economica", new Economica());
        modalidades.put("express", new Express());
    }

    public String calcularFrete(String modalidade, Double peso){
        FreteStrategy strategy = modalidades.get(modalidade.toLowerCase());

        if(strategy == null){
            return "Erro ao encontrar a modalidade";
        }

        return strategy.calcularFrete(peso);
    }
}
