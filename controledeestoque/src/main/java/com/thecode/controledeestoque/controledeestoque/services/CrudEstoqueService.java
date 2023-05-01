package com.thecode.controledeestoque.controledeestoque.services;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import com.thecode.controledeestoque.controledeestoque.Repository.ClienteRepository;
import com.thecode.controledeestoque.controledeestoque.Repository.EstoqueRepository;
import com.thecode.controledeestoque.controledeestoque.Repository.ProdutosRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Estoque;
import com.thecode.controledeestoque.controledeestoque.orm.Produtos;

public class CrudEstoqueService{
    public EstoqueRepository estoqueRepository;

        public CrudEstoqueService(EstoqueRepository estoqueRepository){
            this.estoqueRepository = estoqueRepository;

        }
          //MENU
          public void menu(Scanner scanner){
            Boolean isTrue = true;
            while(isTrue){
                System.out.println("Escolha uma ação");
                System.out.println("[1] MOSTRAR ENTRADA");
                System.out.println("[2] MOSTRAR SAIDA");
                System.out.println("[3] MOSTRAR TODOS OS REGISTROS");
                System.out.println("[0] MENU PRINCIPAL");
                System.out.print("Opcao: ");
                int opcao = scanner.nextInt();
                switch(opcao){
                    case 1:
                    entrada();        
                    break;
                    case 2:
                    saida();        
                    break;
                    default:
                    isTrue = false;
                    break;
                }
            }
        }
        //REGISTRAR ENTRADA
        public void entrada(){
            
        }
        //REGISTRAR SAIDA
        public void saida(){

        }
}