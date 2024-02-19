package com.tiagoCSoares.imdb.services;

import com.tiagoCSoares.imdb.entities.Ator;
import com.tiagoCSoares.imdb.repositories.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //  Classe que realiza tarefas de serviço ou lógica de negócio
public class AtorService {

    @Autowired
    private AtorRepository repository;

    public List<Ator> findAll() {
        return repository.findAll(); // Retorna todos os atores
    }

    public Ator findById(Long id) {
        /*// Verifica se o Optional contém um valor e retorna o objeto User,
        // ou retorna null se o Optional estiver vazio.
        Optional<Ator> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));    // Retorna o objeto User ou lança uma exceção
        // Tenta o método .get(), se não conseguir, lança a exceção, no caso a exceção personalizada ResourceNotFoundException*/
        Optional<Ator> obj = repository.findById(id);
        return obj.get();
    }
}
