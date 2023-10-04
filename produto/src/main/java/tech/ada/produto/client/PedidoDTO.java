package tech.ada.produto.client;

import tech.ada.produto.model.Produto;

public record PedidoDTO(int id, int quantidade, Produto produto) {
}
