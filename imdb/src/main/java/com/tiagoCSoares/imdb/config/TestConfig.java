package com.tiagoCSoares.imdb.config;

import com.tiagoCSoares.imdb.entities.Ator;
import com.tiagoCSoares.imdb.repositories.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { // CommandLineRunner é uma interface que permite executar um método assim que a aplicação é iniciada

    @Autowired // Injeção de dependência
    private AtorRepository atorRepository;

    @Override
    public void run(String... args) throws Exception {
        // Aqui dentro do método run, vamos instanciar objetos para popular o banco de dados
        Ator ator1 = new Ator(null, null, "Tom Hanks", 65, 'M');
        Ator ator2 = new Ator(null, null, "Leonardo DiCaprio", 46, 'M');
        atorRepository.save(ator1); // Salva o objeto no banco de dados
        atorRepository.save(ator2);
    }
}
