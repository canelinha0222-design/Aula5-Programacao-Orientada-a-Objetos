package Questao7;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("Pedro", "João", "Lucas"));
        alunos.forEach(aluno -> System.out.println(" " + aluno));
    }
}
