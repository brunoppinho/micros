package tech.ada.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.produto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
