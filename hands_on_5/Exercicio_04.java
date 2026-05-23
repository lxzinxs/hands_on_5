import java.util.HashMap;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HashMap<Integer, String> matriculaAluno = new HashMap<>();

        matriculaAluno.put(0, "Lucas");
        matriculaAluno.put(1, "Vitoria");
        matriculaAluno.put(2, "Luiz");
        matriculaAluno.put(3, "Fernanda");

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite oque deseja:\n[ 1 ] - Buscar pela matricula\n[ 2 ] - Remover pela matricula:\n[ 3 ] - Sair");
            int opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("\nDigite o numero da matricula que deseja buscar: ");
                int buscar = teclado.nextInt();

                System.out.println("Aluno da matricula " + buscar + " é " + matriculaAluno.get(buscar));
                continuar = true;
            } else if (opcao == 2) {
                System.out.print("\nDigite o numero da matricula que deseja remover: ");
                int remover = teclado.nextInt();

                System.out.println("Aluno da matricula " + remover + " removido é " + matriculaAluno.remove(remover));
                continuar = true;
            } else if(opcao == 3){
                System.out.println("Você saiu");
                continuar = false;
            } else{
                System.out.println("Escolha uma opção válida!");
                continuar = false;
            }
            System.out.println("\nOs alunos cadastrados são: ");
            for (int i = 0; i < matriculaAluno.size(); i++) {
                System.out.println(matriculaAluno.get(i));
            }
        }
        teclado.close();
    }
}
