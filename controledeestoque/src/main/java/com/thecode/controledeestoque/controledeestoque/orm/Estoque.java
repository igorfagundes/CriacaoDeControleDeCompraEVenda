package com.thecode.controledeestoque.controledeestoque.orm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public Integer entrada;
    public Integer saida;
    
    @Deprecated
    public Estoque(){

    }
    //construtor
    public Estoque(Long id, Integer entrada, Integer saida) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
    }


    public Long getId() {
        return id;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }


    public Integer getSaida() {
        return saida;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }


    @Override
    public String toString() {
        return "Estoque [id=" + id + ", entrada=" + entrada + ", saida=" + saida + "]";
    }

    
    
}
