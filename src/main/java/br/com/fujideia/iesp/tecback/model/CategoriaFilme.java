package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CategoriaFilme {

    @Id
    @GeneratedValue
    private Integer id;

    @Column( length = 500)
    private String nome;

}
