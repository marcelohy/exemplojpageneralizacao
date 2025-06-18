package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AcervoRepoMemoImpl implements IAcervoRepository {
    private List<Livro> livros;

    public AcervoRepoMemoImpl(){
        livros = new ArrayList<>();

        livros.add(new Livro(110, "Aprendendo Java", "Maria da Silva", 2015));
        livros.add(new Livro(120, "Spring-Boot", "Jose de Souza", 2020));
        livros.add(new Livro(130, "Principios SOLID", "Pedro da Silva", 2023));
        livros.add(new Livro(140, "Padroes de Projeto", "JoanaMoura", 2023));
        livros.add(new Livro(150, "Teste Unitario", "Pedro da Silva", 2024)); 
        livros.add(new LivroEspecial(160, "Teste Unitario 2", "Pedro da Silva", 2025,"Plastico")); 
        livros.add(new LivroEspecial(170, "Aprendendo Java 2", "Maria da Silva", 2025, "Papel")); 

    }

    @Override
    public List<Livro>getLivros(){  
        return livros; 
    }

    @Override
    public Livro getLivroId(long id) {
        return livros.stream()
        .filter(livro->livro.getId()==id)
        .findFirst()
        .orElse(null);   
    }
    
}