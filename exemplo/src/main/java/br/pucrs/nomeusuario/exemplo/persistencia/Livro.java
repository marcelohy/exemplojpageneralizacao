package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    private long id;
    private String titulo;
    private String autor;
    private int ano;

    protected Livro() {        
    }

    public Livro(long id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
    }
}
