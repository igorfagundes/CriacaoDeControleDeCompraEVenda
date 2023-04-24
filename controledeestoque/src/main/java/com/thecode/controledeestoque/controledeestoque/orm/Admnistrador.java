package com.thecode.controledeestoque.controledeestoque.orm;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admnistradores")
public class Admnistrador{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String nome;
    public String senha;

    @Deprecated
    public Admnistrador(){
    }

    public Admnistrador(Long id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.senha = contato;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Administrador [id=" + id + ", nome=" + nome + ", senha=" + senha + "]";
    }

    

}
