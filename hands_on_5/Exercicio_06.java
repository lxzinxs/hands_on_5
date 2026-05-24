import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Livro> listaLivros = new ArrayList<>();

        int opcaoMenu = -1;
        while (opcaoMenu != 0) {
            System.out.println("\n----- MENU -----");
            System.out.println("[ 1 ] - Cadastrar livro\n[ 2 ] - Listar livros\n[ 3 ] - Emprestar livro\n[ 4 ] - Devolver livro\n[ 0 ] - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = teclado.nextInt();

            if (opcaoMenu == 1) {
                Livro novoLivro = new Livro();

                System.out.print("Digite o nome do livro: ");
                teclado.nextLine();
                String nomeLivro = teclado.nextLine(); 
                
                System.out.print("Digite o codigo do livro: ");
                int codigoLivro = teclado.nextInt();
                
                System.out.print("Digite o autor do livro: ");
                teclado.nextLine();
                String nomeAutor = teclado.nextLine();

                novoLivro.titulo = nomeLivro;
                novoLivro.codigo = codigoLivro;
                novoLivro.autor = nomeAutor;
                novoLivro.disponivel = true;

                listaLivros.add(novoLivro);
                System.out.println("Livro cadastrado com sucesso!");

            } else if (opcaoMenu == 2) {
                System.out.println("\n--- Livros Cadastrados ---");
                for (int i = 0; i < listaLivros.size(); i++) {
                    Livro l = listaLivros.get(i);
                    String status = l.disponivel ? "Disponível" : "Indisponível";
                    System.out.println("Código: " + l.codigo + " | Título: " + l.titulo + " | Autor: " + l.autor + " [" + status + "]");
                }

            } else if (opcaoMenu == 3) {
                System.out.print("Digite o código do livro que deseja pegar emprestado: ");
                int codigoBusca = teclado.nextInt();
                
                boolean achou = false;
                for (int i = 0; i < listaLivros.size(); i++) {
                    Livro l = listaLivros.get(i);
                    if (l.codigo == codigoBusca) {
                        achou = true;
                        if (l.disponivel) {
                            l.disponivel = false;
                            System.out.println("Empréstimo realizado com sucesso!");
                        } else {
                            System.out.println("Desculpe, este livro já está emprestado!");
                        }
                    }
                }
                if (!achou) {
                    System.out.println("Livro não encontrado com esse código.");
                }

            } else if (opcaoMenu == 4) {
                System.out.print("Digite o código do livro que deseja devolver: ");
                int codigoBusca = teclado.nextInt();
                
                boolean achou = false;
                for (int i = 0; i < listaLivros.size(); i++) {
                    Livro l = listaLivros.get(i);
                    if (l.codigo == codigoBusca) {
                        achou = true;
                        if (!l.disponivel) {
                            l.disponivel = true;
                            System.out.println("Livro devolvido com sucesso!");
                        } else {
                            System.out.println("Este livro já consta como disponível no sistema.");
                        }
                    }
                }
                if (!achou) {
                    System.out.println("Livro não encontrado com esse código.");
                }
            }
        }
        
        System.out.println("Sistema encerrado. Até logo!");
        teclado.close();
    }
}

class Livro {
    int codigo;
    String titulo;
    String autor;
    Boolean disponivel;
}