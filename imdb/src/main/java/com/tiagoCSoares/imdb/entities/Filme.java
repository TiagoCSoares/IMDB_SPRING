package com.tiagoCSoares.imdb.entities;


import jakarta.persistence.*;

import java.util.List;

/*Neste sistema cada filme deve possuir alguns atributos como o nome,
data de lançamento, orçamento e descrição.

Cada filme também deve possuir um diretor e uma lista de atores que
trabalharam no filme, adicione atributos para as pessoas. Implemente uma aplicação em que o usuário possa
*/
@Entity
@Table(name="tb_filme")
public class Filme {
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor da id gerado automaticamente
    private Long id;
    private String nome;
    private String descricao;
    private String dataLancamento;
    private Double orcamento;
    private List<Diretor> diretores;
    private List<Ator> atores;

    public Filme() {
    }

    public Filme(Long id, String nome, String descricao, String dataLancamento, Double orcamento, List<Diretor> diretores, List<Ator> atores) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.diretores = diretores;
        this.atores = atores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<Diretor> diretores) {
        this.diretores = diretores;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}
