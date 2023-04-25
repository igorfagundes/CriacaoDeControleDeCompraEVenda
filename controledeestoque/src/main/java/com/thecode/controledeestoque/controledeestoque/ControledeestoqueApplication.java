package com.thecode.controledeestoque.controledeestoque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.thecode.controledeestoque.controledeestoque.orm.Admnistrador;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;
import com.thecode.controledeestoque.controledeestoque.orm.Estoque;
import com.thecode.controledeestoque.controledeestoque.orm.Produtos;
import com.thecode.controledeestoque.controledeestoque.services.CrudClienteService;
import com.thecode.controledeestoque.controledeestoque.orm.Financeiro;
import java.util.Scanner;
@SpringBootApplication
public class ControledeestoqueApplication implements CommandLineRunner{
	public CrudClienteService clienteService;

//CONTRUTOR
	public ControledeestoqueApplication(CrudClienteService clienteService){
		this.clienteService = clienteService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ControledeestoqueApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Boolean isTrue = true;
		while(isTrue){
			System.out.println("Escolha uma OPCAO");
			System.out.println("[1] CLIENTE");
			System.out.println("[0] SAIR");
			System.out.print("Opcao: ");
			int opcao = scanner.nextInt();
		
		switch(opcao){
			case 1:
				this.clienteService.menu(scanner);
			break;
			default:
				isTrue = false;
			break;
		}
	}
	}

}
