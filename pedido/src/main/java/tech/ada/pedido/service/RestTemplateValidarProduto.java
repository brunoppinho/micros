package tech.ada.pedido.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tech.ada.produto.model.Produto;

@Service
@ConditionalOnSingleCandidate(ValidarProduto.class)
public class RestTemplateValidarProduto implements ValidarProduto {

    @Override
    public void execute(int produtoId) {
        String hostName = "127.0.0.1";
        String port = "8762";
        String url = "http://" + hostName + ":" + port + "/" + produtoId;
        new RestTemplate().getForObject(url, Produto.class);
    }
}
