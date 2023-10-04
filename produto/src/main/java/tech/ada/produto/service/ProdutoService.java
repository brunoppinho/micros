package tech.ada.produto.service;

import org.springframework.stereotype.Service;
import tech.ada.produto.client.PedidoClient;
import tech.ada.produto.model.Produto;
import tech.ada.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final PedidoClient pedidoClient;

    public ProdutoService(ProdutoRepository produtoRepository, PedidoClient pedidoClient) {
        this.produtoRepository = produtoRepository;
        this.pedidoClient = pedidoClient;
    }

    public Produto create(Produto produto) {
        produto = produtoRepository.save(produto);
        pedidoClient.createProduto(produto);
        return produto;
    }

    public Produto get(int id) {
        return produtoRepository.findById(id).orElseThrow();
    }

    public void delete(int id) {
        produtoRepository.deleteById(id);
        pedidoClient.deleteProduto(id);
    }
}
