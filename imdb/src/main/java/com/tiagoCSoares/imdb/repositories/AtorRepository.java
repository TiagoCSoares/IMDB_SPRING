package com.tiagoCSoares.imdb.repositories;

import com.tiagoCSoares.imdb.entities.Ator;
import org.apache.el.parser.JJTELParserState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtorRepository extends JpaRepository<Ator, Long> {
    //JpaRepository permite executar operações de CRUD em uma entidade
    // <Ator, Long> é o tipo da entidade e o tipo da chave

}
