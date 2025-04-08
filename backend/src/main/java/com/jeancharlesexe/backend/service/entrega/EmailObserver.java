package com.jeancharlesexe.backend.service.entrega;

import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements NotificacaoObserver {
    @Override
    public void notificarEntrega(String email, String modalidade) {
        System.out.println("simulando envio para o " + email + ", entrega na modalidade: " + modalidade);
    }
}
