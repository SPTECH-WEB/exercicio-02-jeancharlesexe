package com.jeancharlesexe.backend.service.entrega;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoService {
    private List<NotificacaoObserver> notificadores;

    public NotificacaoService(List<NotificacaoObserver> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificarEntrega(String email, String modalidade){
        notificadores.forEach(notificador -> notificador.notificarEntrega(email, modalidade));
    }
}
