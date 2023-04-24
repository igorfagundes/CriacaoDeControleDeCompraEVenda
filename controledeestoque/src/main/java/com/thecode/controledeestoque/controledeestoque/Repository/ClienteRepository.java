package com.thecode.controledeestoque.controledeestoque.Repository;

import org.springframework.data.repository.CrudRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
