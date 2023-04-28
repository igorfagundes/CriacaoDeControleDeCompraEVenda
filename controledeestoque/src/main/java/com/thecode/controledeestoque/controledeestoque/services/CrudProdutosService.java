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
                System.out.println("[5] VISUALIZAR TODOS OS PRODUTOS");
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
                    this.mostrarProdutoPorId(scanner);
                break;
                case 5:
                this.mostrarTodos();
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
        //[2] ATUALIZAR
        public void atualizar(Scanner scanner){
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o ID do PRODUTO a ser atualizado: ");
            Long id = scanner.nextLong();
            Optional<Produtos> optionalProduto = this.produtosRepository.findById(id);
            if(optionalProduto.isPresent()){
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
                System.out.println("Produto: " + produtos.getId() + " atualizado com sucesso");
            }else{
                System.out.println("Produto nao encontrado!");
            }
        }
        //[3] REMOVER
        public void remover(Scanner scanner){
            System.out.println("==============================================================");
            System.out.println("*** Após confirmar com enter, não poderá mais ser desfeita ***");
            System.out.println("==============================================================");
            System.out.print("Digite o ID que deseja REMOVER: ");
            Long id = scanner.nextLong();
            this.produtosRepository.deleteById(id);
            System.out.println("Produto removido com sucesso!");
        }
        //[4] MOSTRAR PRODUTO POR ID
        public void mostrarProdutoPorId(Scanner scanner){
            System.out.print("Digite o ID do PRODUTO que deseja ver: ");
            Long id = scanner.nextLong();

            Optional<Produtos> optionalProd = this.produtosRepository.findById(id);
            if(optionalProd.isPresent()){
                Produtos produtos = optionalProd.get();
                System.out.println("#### PRODUTOS ####");
                System.out.println("ID: " + produtos.getId());
                System.out.println("NOME: " + produtos.getNome());
                System.out.println("CODIGO: " + produtos.getCodigo() );
                System.out.println("DESCRICAO: " + produtos.getDescricao());
                System.out.println("##################");
            }else{
                System.out.println("ID do PRODUTO inexistente");
            }
        }
        //[5] MOSTRAR TODOS
        public void mostrarTodos(){
            Iterable<Produtos> produtosIT = produtosRepository.findAll();
            for(Produtos produto : produtosIT){
                System.out.println("##############");
                System.out.println(produto);
            }
        }
}
