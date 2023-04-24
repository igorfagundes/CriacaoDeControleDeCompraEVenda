package com.thecode.controledeestoque.controledeestoque.Repository;

import org.springframework.data.repository.CrudRepository;

import com.thecode.controledeestoque.controledeestoque.orm.Produtos;

public interface ProdutosRepository extends CrudRepository<Produtos, Long>{
    
}
