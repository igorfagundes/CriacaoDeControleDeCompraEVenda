package com.thecode.controledeestoque.controledeestoque.services;
import java.util.Scanner;

import org.springframework.stereotype.Service;
import com.thecode.controledeestoque.controledeestoque.Repository.ClienteRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;

@Service
public class CrudClienteService {
    public ClienteRepository clienteRepository;


    public CrudClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void menu(Scanner scanner){
        Boolean isTrue = true;
        while(isTrue){
            System.out.println("Escolha uma ação");
            System.out.println("[1] CADASTRAR");
            System.out.println("[0] MENU PRINCIPAL");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                this.cadastrar(scanner);
            break;
            default:
                isTrue = false;
            break;

        }
        }
    }
    //[1] CADASTRAR
    public void cadastrar(Scanner scanner){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o NOME do cliente: ");
        String nome = scan.nextLine();
        System.out.print("Digite o TELEFONE de contato: ");
        String contato = scan.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setContato(contato);
        this.clienteRepository.save(cliente);
        System.out.println("Novo Cliente criado com sucesso!");
    }
}

