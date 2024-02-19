package com.tiagoCSoares.imdb.entities;

import jakarta.persistence.*;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
@Table(name = "tb_diretor")
public class Diretor extends Pessoa{
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor da id gerado automaticamente
    private Long id;
}
