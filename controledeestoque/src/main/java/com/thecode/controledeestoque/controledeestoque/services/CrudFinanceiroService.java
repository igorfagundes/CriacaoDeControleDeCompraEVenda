package com.thecode.controledeestoque.controledeestoque.services;
import java.util.Scanner;
import com.thecode.controledeestoque.controledeestoque.Repository.FinanceiroRepository;

public class CrudFinanceiroService {
    Scanner scanner = new Scanner(System.in);
    public FinanceiroRepository financeiroRepository;

    public CrudFinanceiroService(FinanceiroRepository financeiroRepository){
        this.financeiroRepository = financeiroRepository;
    }
    //MENU
    public void menu(Scanner scanner){
        Boolean isTrue = true;
        while(isTrue){
            System.out.println("Escolha uma ação");
            System.out.println("[1] MOSTRAR VENDAS POR ID");
            System.out.println("[2] MOSTRAR TODAS VENDAS");
            System.out.println("[3] MOSTRAR DEVOLUCOES");
            
            System.out.println("[0] MENU PRINCIPAL");
            System.out.print("Opcao: ");
            int opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    vendas();
                break;
                case 2:
                    vendasTot();
                break;
                case 3:
                    devolucao();
                break;
                default:
                    isTrue = false;
                break;
            }
        }
    }
    public void vendas(){

    }
    public void vendasTot(){

    }
    public void devolucao(){

    }
}
