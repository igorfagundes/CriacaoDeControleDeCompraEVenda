package com.thecode.controledeestoque.controledeestoque.orm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String nome;
    public String contato;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "endereco_id", nullable = true)
    public Endereco enderecos;
    

    @Deprecated
    public Cliente(){
    }

    public Cliente(Long id, String nome, String contato, Endereco enderecos) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.enderecos = enderecos;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public Endereco getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco endereco) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", contato=" + contato + ", endereco=" + endereco + "]";
    }

   
    

}