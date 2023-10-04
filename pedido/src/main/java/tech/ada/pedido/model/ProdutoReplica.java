package tech.ada.pedido.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProdutoReplica {

    @Id
    private int id;

    @Column
    private String nome;
}
