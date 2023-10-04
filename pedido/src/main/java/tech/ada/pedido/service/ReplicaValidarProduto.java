package tech.ada.pedido.service;

import org.springframework.stereotype.Service;
import tech.ada.pedido.repository.ProdutoReplicaRepository;

//@Service
public class ReplicaValidarProduto implements ValidarProduto {

    private final ProdutoReplicaRepository repository;

    public ReplicaValidarProduto(ProdutoReplicaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(int produtoId) {
        repository.findById(produtoId).orElseThrow();
    }
}
