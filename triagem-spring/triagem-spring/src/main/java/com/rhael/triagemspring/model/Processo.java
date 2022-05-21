package com.rhael.triagemspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
//@Table(name = "processos") caso o nome da tabela fosse diferente...
public class Processo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String autor;

    @Column(length = 20)
    private String gratuita;

    @Column(length = 20)
    private String valor;

}
