package com.thecode.controledeestoque.controledeestoque.Repository;
import org.springframework.data.repository.CrudRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Estoque;

public interface EstoqueRepository extends CrudRepository<Estoque, Long>{
    
}
