package com.jeancharlesexe.backend.service.frete;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("economica")
public class Economica implements FreteStrategy{
    @Override
    public String calcularFrete(Double peso) {
        Double preco = peso * 0.05;
        return "Frete "+this.tipo()+", preco: "+preco;
    }

    @Override
    public String tipo() {
        return "economica";
    }
}
