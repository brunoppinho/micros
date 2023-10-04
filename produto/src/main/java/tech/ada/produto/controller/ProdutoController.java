package tech.ada.produto.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.produto.model.Produto;
import tech.ada.produto.service.ProdutoService;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return produtoService.create(produto);
    }

    @GetMapping("{id}")
    public Produto get(@PathVariable int id) {
        return produtoService.get(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        produtoService.delete(id);
    }
}
