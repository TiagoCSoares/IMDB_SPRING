package com.tiagoCSoares.imdb.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "tb_ator")
public class Ator extends Pessoa{
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor da id gerado automaticamente
    private Long id;

    public Ator() {
    }

    public Ator(Long id,List<Filme> listaDeFilmes, String nome, Integer idade, char sexo) {
        super(listaDeFilmes, nome, idade, sexo);
        this.id = id;
    }
}
