package com.thecode.controledeestoque.controledeestoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.thecode.controledeestoque.controledeestoque.orm.Admnistrador;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;
import com.thecode.controledeestoque.controledeestoque.orm.Estoque;
import com.thecode.controledeestoque.controledeestoque.orm.Produtos;
import com.thecode.controledeestoque.controledeestoque.orm.Financeiro;

@SpringBootApplication
public class ControledeestoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControledeestoqueApplication.class, args);
	}

}
