package com.jeancharlesexe.backend.service.entrega;

public interface NotificacaoObserver {
    void notificarEntrega(String email, String modalidade);
}
