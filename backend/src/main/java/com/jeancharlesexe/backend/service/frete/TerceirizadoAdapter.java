package com.jeancharlesexe.backend.service.frete;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("terceirizado")
public class TerceirizadoAdapter implements FreteStrategy{
    private final Terceirizado terceirizado;

    public TerceirizadoAdapter(Terceirizado terceirizado) {
        this.terceirizado = terceirizado;
    }

    public String calcularFrete(Double peso) {
        return terceirizado.calcularFrete(peso);
    }

    @Override
    public String tipo() {
        return "terceirizado";
    }
}
