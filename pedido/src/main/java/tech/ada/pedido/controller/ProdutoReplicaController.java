package tech.ada.pedido.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.pedido.model.ProdutoReplica;
import tech.ada.pedido.repository.ProdutoReplicaRepository;

@RestController
public class ProdutoReplicaController {

    private final ProdutoReplicaRepository produtoReplicaRepository;

    public ProdutoReplicaController(ProdutoReplicaRepository produtoReplicaRepository) {
        this.produtoReplicaRepository = produtoReplicaRepository;
    }

    @PostMapping("produto")
    public ProdutoReplica create(@RequestBody ProdutoReplica produtoReplica) {
        return produtoReplicaRepository.save(produtoReplica);

    }

    @DeleteMapping("produto/{id}")
    public void delete(@PathVariable int id) {
        produtoReplicaRepository.deleteById(id);
    }
}
