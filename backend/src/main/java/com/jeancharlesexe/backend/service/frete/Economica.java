package com.jeancharlesexe.backend.service.frete;

import org.springframework.stereotype.Component;

@Component
public class Economica implements FreteStrategy{
    @Override
    public String calcularFrete(Double peso) {
        Double preco = peso * 0.05;
        return "Frete "+this.tipo()+", preco: "+preco;
    }

    @Override
    public String tipo() {
        return "Economica";
    }
}
