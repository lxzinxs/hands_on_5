import java.util.HashSet;

public class Exercicio_03 {
    public static void main(String[] args) {
        HashSet<String> nomesAlunos = new HashSet<>();

        nomesAlunos.add("Lucas");
        nomesAlunos.add("Vitoria");
        nomesAlunos.add("Vitoria");
        nomesAlunos.add("Lucas");
        nomesAlunos.add("Felipe");
        nomesAlunos.add("Luiz");
        nomesAlunos.add("Fernanda");

        System.out.println("Alunos cadastrados: " + nomesAlunos + "numero de alunos cadastrados: " + nomesAlunos.size());
    }
}
