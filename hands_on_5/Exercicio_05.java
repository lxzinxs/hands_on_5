import java.util.LinkedList;
import java.util.Queue;

public class Exercicio_05 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Lucas");
        fila.add("Vitoria");
        fila.add("Luiz");
        fila.add("Fernanda");
        fila.add("Victor");

        System.out.println("Pessoas na fila; " + fila);

        String proximo = fila.peek();
        System.out.println("Proximo da fila: " + proximo);

        int contador = 1;

        while (!fila.isEmpty()) {
            String clienteAtendido = fila.poll();
            System.out.println("Chamei o " + contador + "* cliente: " + clienteAtendido);
            contador++;

            if (contador == 3) {
                System.out.println(" 2 clientes já foram atendidos\n");
            }
        }
        System.out.println("Todos foram atendidos!");
    }
}

