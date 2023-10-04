package tech.ada.pedido.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.pedido.model.Pedido;
import tech.ada.pedido.service.PedidoService;

@RestController
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("pedido")
    public Pedido create(@RequestBody Pedido pedido) {
        return pedidoService.create(pedido);

    }

    @GetMapping("pedido/{id}")
    public Pedido get(@PathVariable int id) {
        return pedidoService.get(id);
    }
}
