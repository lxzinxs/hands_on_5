import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        int opcaoMenu = -1;
        while (opcaoMenu != 0) {
            System.out.println("\n----- MENU LANCHONETE -----");
            System.out.println("[ 1 ] - Cadastrar pedido\n[ 2 ] - Listar pedidos\n[ 3 ] - Atualizar status\n[ 4 ] - Buscar pedido\n[ 5 ] - Mostrar valor total\n[ 0 ] - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = teclado.nextInt();

            if (opcaoMenu == 1) {
                Pedido novoPedido = new Pedido();

                System.out.print("Digite o numero do pedido: ");
                int numero = teclado.nextInt();
                
                System.out.print("Digite o nome do cliente: ");
                teclado.nextLine();
                String cliente = teclado.nextLine();
                
                System.out.print("Digite o item pedido: ");
                String item = teclado.nextLine();
                
                System.out.print("Digite o valor do pedido: ");
                double valor = teclado.nextDouble();

                novoPedido.numeroPedido = numero;
                novoPedido.nomeCliente = cliente;
                novoPedido.itemPedido = item;
                novoPedido.valor = valor;
                novoPedido.status = "PENDENTE";

                listaPedidos.add(novoPedido);
                System.out.println("Pedido cadastrado com sucesso!");

            } else if (opcaoMenu == 2) {
                System.out.println("\n--- Pedidos Cadastrados ---");
                for (int i = 0; i < listaPedidos.size(); i++) {
                    Pedido p = listaPedidos.get(i);
                    System.out.println("Nº: " + p.numeroPedido + " | Cliente: " + p.nomeCliente + " | Item: " + p.itemPedido + " | Valor: R$" + p.valor + " | Status: " + p.status);
                }

            } else if (opcaoMenu == 3) {
                System.out.print("Digite o número do pedido para atualizar: ");
                int numBusca = teclado.nextInt();
                
                boolean achou = false;
                for (int i = 0; i < listaPedidos.size(); i++) {
                    Pedido p = listaPedidos.get(i);
                    if (p.numeroPedido == numBusca) {
                        achou = true;
                        System.out.println("Status atual: " + p.status);
                        System.out.println("Escolha o novo status:\n[ 1 ] - PREPARANDO\n[ 2 ] - FINALIZADO");
                        int escolhaStatus = teclado.nextInt();
                        
                        if (escolhaStatus == 1) {
                            p.status = "PREPARANDO";
                            System.out.println("Status atualizado!");
                        } else if (escolhaStatus == 2) {
                            p.status = "FINALIZADO";
                            System.out.println("Status atualizado!");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                }
                if (!achou) {
                    System.out.println("Pedido não encontrado.");
                }

            } else if (opcaoMenu == 4) {
                System.out.print("Digite o número do pedido que deseja buscar: ");
                int numBusca = teclado.nextInt();
                
                boolean achou = false;
                for (int i = 0; i < listaPedidos.size(); i++) {
                    Pedido p = listaPedidos.get(i);
                    if (p.numeroPedido == numBusca) {
                        achou = true;
                        System.out.println("\nPedido Encontrado:");
                        System.out.println("Nº: " + p.numeroPedido + "\nCliente: " + p.nomeCliente + "\nItem: " + p.itemPedido + "\nValor: R$" + p.valor + "\nStatus: " + p.status);
                    }
                }
                if (!achou) {
                    System.out.println("Pedido não encontrado.");
                }

            } else if (opcaoMenu == 5) {
                double totalfaturamento = 0;
                for (int i = 0; i < listaPedidos.size(); i++) {
                    Pedido p = listaPedidos.get(i);
                    totalfaturamento += p.valor;
                }
                System.out.printf("\nValor total de todos os pedidos: R$ %.2f\n", totalfaturamento);
            }
        }

        System.out.println("Sistema encerrado.");
        teclado.close();
    }
}

class Pedido {
    int numeroPedido;
    String nomeCliente;
    String itemPedido;
    double valor;
    String status;
}