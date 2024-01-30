package com.sefaz.pontoestagiario.features.pessoa.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="pessoa")
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Boolean ativo;
    private String email;
    private String login;
}
