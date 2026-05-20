import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            System.out.println("Digite a " + (1 + i) + "* nota: ");
            Double notasDigitadas = teclado.nextDouble();

            notas.add(notasDigitadas);
        }

        double soma = 0;

        for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }

        double mediaNotas = soma / notas.size(); 

        System.out.printf("\nA média final das %d notas é: %.2f\n", notas.size(), mediaNotas);

        teclado.close();
    }
}