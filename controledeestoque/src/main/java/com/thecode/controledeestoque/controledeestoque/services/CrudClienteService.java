package com.thecode.controledeestoque.controledeestoque.services;
import java.util.Optional;
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
            System.out.println("[2] LISTAR TODOS OS CLIENTES");
            System.out.println("[3] ATUALIZAR CLIENTE POR ID");
            System.out.println("[4] REMOVER CLIENTE POR ID");
            System.out.println("[0] MENU PRINCIPAL");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                this.cadastrar(scanner);
            break;
            case 2:
                this.listaDeClientes();
            break;
            case 3:
                this.atualizar(scanner);
            break;
            case 4:
                this.remover(scanner);
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
    //[2] MOSTRAR LISTA DE CLIENTES
    public void listaDeClientes(){
        Iterable<Cliente> clientes = clienteRepository.findAll();
        for(Cliente cliente : clientes){
            
            System.out.println("============");
            System.out.println(cliente);
        }
    }
    //[3] ATUALIZAR DADOS
    public void atualizar(Scanner scanner){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ID do CLIENTE a ser atualizado: ");
        Long id = scanner.nextLong();
        Optional<Cliente> optionalCliente = this.clienteRepository.findById(id);
        if(optionalCliente.isPresent()){
            System.out.print("Digite o NOVO nome: ");
            String nome = scan.nextLine();
            System.out.print("Digite o NOVO contato: ");
            String contato = scan.nextLine();
            Cliente cliente = optionalCliente.get();
            cliente.setNome(nome);
            cliente.setContato(contato);
            clienteRepository.save(cliente);
            System.out.println("Cliente ID:" + cliente.getId() + " NOME: " + cliente.getNome() + " atualizado com sucesso");
        }else{
            System.out.println("Cliente nao encontrado!");
        }
    }
    //[4] REMOVER
    public void remover(Scanner scanner){
        System.out.println("==============================================================");
        System.out.println("*** Após confirmar com enter, não poderá mais ser desfeita ***");
        System.out.println("==============================================================");
        System.out.print("Digite o ID que deseja REMOVER: ");
        Long id = scanner.nextLong();
            this.clienteRepository.deleteById(id);
            System.out.println("Cliente removido com sucesso!");
    }
}

