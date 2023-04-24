package com.thecode.controledeestoque.controledeestoque.Repository;

import org.springframework.data.repository.CrudRepository;

import com.thecode.controledeestoque.controledeestoque.orm.Endereco;

public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
    
}
