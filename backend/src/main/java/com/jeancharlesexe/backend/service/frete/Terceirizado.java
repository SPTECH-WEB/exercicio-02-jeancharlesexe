package com.jeancharlesexe.backend.service.frete;

import org.springframework.stereotype.Component;

@Component
public class Terceirizado {
    public String calcularFrete(Double peso){
        Double preco = peso * 10;
        return "Frete "+this.tipo()+", preco: "+preco;
    }

    public String tipo(){
        return "terceirizado";
    }
}
