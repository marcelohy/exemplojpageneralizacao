package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.Entity;

@Entity
public class LivroEspecial extends Livro {
    private String material;

    protected LivroEspecial() {
        super();
    }

    public LivroEspecial(long id, String titulo, String autor, int ano, String material) {
        super(id, titulo, autor, ano);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + "LivroEspecial [material=" + material + "]";
    }    

}
