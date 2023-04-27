package com.thecode.controledeestoque.controledeestoque.services;

import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import com.thecode.controledeestoque.controledeestoque.Repository.ClienteRepository;
import com.thecode.controledeestoque.controledeestoque.Repository.EnderecoRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;
import com.thecode.controledeestoque.controledeestoque.orm.Endereco;

@Service
public class CrudEnderecoService{

    public EnderecoRepository enderecoRepository;

    public CrudEnderecoService(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public void menu(Scanner scanner){
        Boolean isTrue = true;
        while(isTrue){
            System.out.println("Escolha uma ação");
            System.out.println("[1] CADASTRAR");
            System.out.println("[2] ATUALIZAR ENDERECO POR ID");
            System.out.println("[3] REMOVER ENDERECO POR ID");
            System.out.println("[4] VISUALIZAR ENDERECO POR ID");
            System.out.println("[0] MENU PRINCIPAL");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                this.cadastrar(scanner);
            break;
            case 2:
                this.atualizar(scanner);
            break;
            case 3:
                this.remover(scanner);
            break;
            case 4:
                this.mostrarEnderecoPorId(scanner);
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
        System.out.print("Digite a RUA: ");
        String rua = scan.nextLine();
        System.out.print("Digite o NUMERO: ");
        Integer numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o BAIRRO: ");
        String bairro = scan.nextLine();
        System.out.print("Digite a CIDADE: ");
        String cidade = scan.nextLine();
        System.out.print("Digite a ESTADO: ");
        String estado = scan.nextLine();
        System.out.print("Digite CEP: ");
        Integer cep = scan.nextInt();
        
        
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);

        this.enderecoRepository.save(endereco);
        System.out.println("Novo ENDERECO criado com sucesso!");
    }
    //[2] ATUALIZAR DADOS
    public void atualizar(Scanner scanner){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ID do ENDERECO a ser atualizado: ");
        Long id = scanner.nextLong();
        Optional<Endereco> optionalEndereco = this.enderecoRepository.findById(id);
        if(optionalEndereco.isPresent()){
            
            System.out.print("Digite a RUA: ");
            String rua = scan.nextLine();
            System.out.print("Digite o NUMERO: ");
            Integer numero = scan.nextInt();
            System.out.print("Digite o BAIRRO: ");
            String bairro = scan.nextLine();
            System.out.print("Digite a CIDADE: ");
            String cidade = scan.nextLine();
            System.out.print("Digite a ESTADO: ");
            String estado = scan.nextLine();
            System.out.print("Digite CEP: ");
            Integer cep = scan.nextInt();

            Endereco endereco = optionalEndereco.get();
            endereco.setRua(rua);
            endereco.setNumero(numero);
            endereco.setBairro(bairro);
            endereco.setCidade(cidade);
            endereco.setEstado(estado);
            endereco.setCep(cep);
            this.enderecoRepository.save(endereco);

            System.out.println("Endereco: " + endereco.getId() + " atualizado com sucesso");
        }else{
            System.out.println("Endereco nao encontrado!");
        }
    }
    //[3] REMOVER
    public void remover(Scanner scanner){
        System.out.println("==============================================================");
        System.out.println("*** Após confirmar com enter, não poderá mais ser desfeita ***");
        System.out.println("==============================================================");
        System.out.print("Digite o ID que deseja REMOVER: ");
        Long id = scanner.nextLong();
            this.enderecoRepository.deleteById(id);
            System.out.println("Endereco removido com sucesso!");
    }
    //[4] MOSTRAR ENDERECO POR ID
    public void mostrarEnderecoPorId(Scanner scanner){
        System.out.print("Digite o ID do endereco que deseja ver: ");
            Long id = scanner.nextLong();

            Optional<Endereco> optionalEnd = this.enderecoRepository.findById(id);
            if(optionalEnd.isPresent()){
                Endereco endereco = optionalEnd.get();
                System.out.println("#### ENDERECO ####");
                System.out.println("RUA: " + endereco.getRua());
                System.out.println("NUMERO: " + endereco.getNumero());
                System.out.println("BAIRRO: " + endereco.getBairro());
                System.out.println("CIDADE: " + endereco.getCidade());
                System.out.println("ESTADO: " + endereco.getEstado());
                System.out.println("CEP: " + endereco.getCep());
                System.out.println("##################");
            }else{
                System.out.println("ID de endereco inexistente");
            }
        }
    }

