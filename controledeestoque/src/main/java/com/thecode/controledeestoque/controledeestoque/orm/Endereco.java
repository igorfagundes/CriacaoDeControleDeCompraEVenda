package com.thecode.controledeestoque.controledeestoque.orm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String rua;
    public Integer numero;
    public String bairro;
    public String cidade;
    public String estado;
    public Integer cep;

    @Deprecated
    public Endereco(){

    }

    public Endereco(Long id, String rua, Integer numero, String bairro, String cidade, String estado, Integer cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }



    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
                + cidade + ", estado=" + estado + ", cep=" + cep + "]";
    }

    
    

    
}
