package com.jeancharlesexe.backend.service.frete;

import com.jeancharlesexe.backend.service.entrega.NotificacaoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FreteService {
    private final Map<String, FreteStrategy> modalidades = new HashMap<>();
    private final NotificacaoService notificacaoService;

    public FreteService(List<FreteStrategy> freteStrategies, NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;

        for (FreteStrategy freteStrategy : freteStrategies) {
            modalidades.put(freteStrategy.tipo(), freteStrategy);
        }
    }

    public String calcularFrete(String modalidade, Double peso, String email){
        FreteStrategy modalidadeEscolhida = modalidades.get(modalidade);

        if(modalidadeEscolhida == null){
            return "Erro ao encontrar a modalidade";
        }

        notificacaoService.notificarEntrega(email, modalidade);
        return modalidadeEscolhida.calcularFrete(peso);
    }
}
