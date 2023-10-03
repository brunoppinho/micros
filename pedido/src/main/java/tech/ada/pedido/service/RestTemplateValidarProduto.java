package tech.ada.pedido.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnSingleCandidate
public class RestTemplateValidarProduto implements ValidarProduto {

    @Override
    public void execute(int produtoId) {

    }
}
