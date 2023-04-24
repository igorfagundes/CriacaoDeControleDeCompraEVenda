package com.thecode.controledeestoque.controledeestoque.Repository;

import org.springframework.data.repository.CrudRepository;

import com.thecode.controledeestoque.controledeestoque.orm.Financeiro;

public interface FinanceiroRepository extends CrudRepository<Financeiro, Long>{
    
}
