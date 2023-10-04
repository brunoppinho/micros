package tech.ada.pedido.service;

import org.springframework.stereotype.Service;
import tech.ada.pedido.client.ProdutoClient;

@Service
public class FeignValidarProduto implements ValidarProduto {

    private final ProdutoClient produtoClient;

    public FeignValidarProduto(ProdutoClient produtoClient) {
        this.produtoClient = produtoClient;
    }

    @Override
    public void execute(int produtoId) {
        produtoClient.get(produtoId);
    }
}
