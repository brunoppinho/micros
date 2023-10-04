package tech.ada.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.pedido.model.Pedido;
import tech.ada.pedido.model.ProdutoReplica;

@Repository
public interface ProdutoReplicaRepository extends JpaRepository<ProdutoReplica, Integer> {
}
