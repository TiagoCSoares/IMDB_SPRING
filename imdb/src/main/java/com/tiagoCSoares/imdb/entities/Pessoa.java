package com.tiagoCSoares.imdb.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;
import java.util.List;

public abstract class Pessoa {

    /*
    * Atributos
    * nome
    * idade
    * sexo
    * lista de filmes
    *
     */
    private String nome;
    private Integer idade; // Mudar para Instant depois
    //private Instant dataNascimento;
    private char sexo;
    private List<Filme> listaDeFilmes;



    public  Pessoa() {}

    public Pessoa(List<Filme> listaDeFilmes, String nome, Integer idade, char sexo) {
        this.listaDeFilmes = listaDeFilmes;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIDade(Integer idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public List<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public void setListaDeFilmes(List<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }
}
