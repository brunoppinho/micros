package tech.ada.pedido.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.ada.pedido.model.ProdutoReplica;

@FeignClient(value = "produto")
public interface ProdutoClient {

    @PostMapping
    ProdutoReplica create(@RequestBody ProdutoReplica produto);

    @GetMapping("{id}")
    ProdutoReplica get(@PathVariable int id) ;

    @DeleteMapping("{id}")
    void delete(@PathVariable int id) ;
}
