package tech.ada.produto.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String descricao;

    @Column
    private String nome;

}
