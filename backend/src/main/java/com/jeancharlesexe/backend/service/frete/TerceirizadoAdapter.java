package com.jeancharlesexe.backend.service.frete;

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
        return "Terceirizado";
    }
}
