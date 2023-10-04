package tech.ada.produto.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.ada.produto.model.Produto;

@FeignClient("pedido")
public interface PedidoClient {

    @PostMapping("pedido")
    PedidoDTO createPedido(@RequestBody PedidoDTO pedido);

    @GetMapping("pedido/{id}")
    void getPedido(@PathVariable int id);

    @PostMapping("produto")
    Produto createProduto(@RequestBody Produto produto);

    @DeleteMapping("produto/{id}")
    void deleteProduto(@PathVariable int id);
}
