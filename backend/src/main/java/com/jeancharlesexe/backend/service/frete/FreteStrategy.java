package com.jeancharlesexe.backend.service.frete;

public interface FreteStrategy {
    String calcularFrete(Double valor);
    String tipo();
}
