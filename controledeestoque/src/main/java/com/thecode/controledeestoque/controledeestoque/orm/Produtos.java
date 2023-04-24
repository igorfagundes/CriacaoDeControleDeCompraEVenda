package com.thecode.controledeestoque.controledeestoque.orm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String nome;
    public String codigo;
    public String descricao;

    @Deprecated
    public Produtos(){

    }


    public Produtos(Long id, String nome, String codigo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produtos [id=" + id + ", nome=" + nome + ", codigo=" + codigo + ", descricao=" + descricao + "]";
    }

    


    
}
