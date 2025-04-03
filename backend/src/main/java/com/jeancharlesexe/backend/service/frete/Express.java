package com.jeancharlesexe.backend.service.frete;

import org.springframework.stereotype.Component;

@Component
public class Express implements FreteStrategy{
    @Override
    public String calcularFrete(Double peso) {
        Double preco = peso * 1;
        return "Frete "+this.tipo()+", preco: "+preco;
    }

    @Override
    public String tipo() {
        return "Express";
    }
}
