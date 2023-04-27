package com.thecode.controledeestoque.controledeestoque.services;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import com.thecode.controledeestoque.controledeestoque.Repository.ClienteRepository;
import com.thecode.controledeestoque.controledeestoque.Repository.ProdutosRepository;
import com.thecode.controledeestoque.controledeestoque.orm.Cliente;
import com.thecode.controledeestoque.controledeestoque.orm.Produtos;

@Service
public class CrudProdutosService {
    public ProdutosRepository produtosRepository;

       
        public CrudProdutosService(ProdutosRepository produtosRepository){
            this.produtosRepository = produtosRepository;
        }
        //MENU
        public void menu(Scanner scanner){
            Boolean isTrue = true;
            while(isTrue){
                System.out.println("Escolha uma ação");
                System.out.println("[1] CADASTRAR");
                System.out.println("[2] ATUALIZAR PRODUTO POR ID");
                System.out.println("[3] REMOVER PRODUTO POR ID");
                System.out.println("[4] VISUALIZAR PRODUTO POR ID");
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
            System.out.print("Digite o NOME: ");
            String nome = scan.nextLine();
            System.out.print("Digite o CODIGO: ");
            String codigo = scan.nextLine();
            scan.nextLine();
            System.out.print("Digite a DESCRICAO: ");
            String descricao = scan.nextLine();
            
            Produtos produtos = new Produtos();
            produtos.setNome(nome);
            produtos.setCodigo(codigo);
            produtos.setDescricao(descricao);
    
            this.produtosRepository.save(produtos);
            System.out.println("Novo PRODUTO criado com sucesso!");
        }
}
