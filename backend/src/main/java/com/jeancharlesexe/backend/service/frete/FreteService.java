package com.jeancharlesexe.backend.service.frete;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FreteService {
    private Map<String, FreteStrategy> modalidades = new HashMap<>();
    private final Terceirizado terceirizado = new Terceirizado();

    public FreteService() {
        modalidades.put("economica", new Economica());
        modalidades.put("express", new Express());
        modalidades.put("terceirizado", new TerceirizadoAdapter(terceirizado));
    }

    public String calcularFrete(String modalidade, Double peso){
        FreteStrategy strategy = modalidades.get(modalidade.toLowerCase());

        if(strategy == null){
            return "Erro ao encontrar a modalidade";
        }

        return strategy.calcularFrete(peso);
    }
}
