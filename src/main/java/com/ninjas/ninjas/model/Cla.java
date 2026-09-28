package com.ninjas.ninjas.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="cla")
@Valid
public class Cla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cla;

    @Column(name = "nome_cla", nullable = false, unique = true)
    @NotBlank(message = "Nome é obrigatório.")
    @Size(max = 50, message = "Nome deve ter entre 1 e 50 caracteres.")
    private String nome;

    @Column(name = "descricao_cla", nullable = false)
    @Size(max = 100, message = "Descrição deve ter entre 1 e 100 caracteres.")
    private String descricao;

    @Column(name="habilidade_cla", nullable = false)
    @Size(max = 50, message = "Habilidade deve ter entre 1 e 50 caracteres.")
    private String habilidade;

}
