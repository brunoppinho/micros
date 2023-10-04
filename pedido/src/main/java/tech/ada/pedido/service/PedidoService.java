package tech.ada.pedido.service;

import org.springframework.stereotype.Service;
import tech.ada.pedido.model.Pedido;
import tech.ada.pedido.repository.PedidoRepository;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ValidarProduto validarProduto;

    public PedidoService(PedidoRepository pedidoRepository, ValidarProduto validarProduto) {
        this.pedidoRepository = pedidoRepository;
        this.validarProduto = validarProduto;
    }

    public Pedido create(Pedido pedido) {
        validarProduto.execute(pedido.getProduto().getId());
        return pedidoRepository.save(pedido);
    }

    public Pedido get(int id) {
        return pedidoRepository.findById(id).orElseThrow();
    }
}
