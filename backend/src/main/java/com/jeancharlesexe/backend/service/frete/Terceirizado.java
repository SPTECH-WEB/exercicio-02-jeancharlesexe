package com.jeancharlesexe.backend.service.frete;

public class Terceirizado {
    public String calcularFrete(Double peso){
        Double preco = peso * 10;
        return "Frete "+this.tipo()+", preco: "+preco;
    }

    public String tipo(){
        return "Terceirizado";
    }
}
