package com.thecode.controledeestoque.controledeestoque.orm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Financeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public Double vendas;
    public Double vendasTot;
    public Integer devolucao;

    @Deprecated
    public Financeiro(){
    }
    //construtor
    public Financeiro(Long id, Double vendas, Double vendasTot, Integer devolucao) {
        this.id = id;
        this.vendas = vendas;
        this.vendasTot = vendasTot;
        this.devolucao = devolucao;
    }

    public Long getId() {
        return id;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getVendasTot() {
        return vendasTot;
    }

    public void setVendasTot(Double vendasTot) {
        this.vendasTot = vendasTot;
    }

    public Integer getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Integer devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public String toString() {
        return "Financeiro [id=" + id + ", vendas=" + vendas + ", vendasTot=" + vendasTot + ", devolucao=" + devolucao
                + "]";
    }

    
    

    
}
