package Questao10;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Pedro", "Gabriel", "Fernando", "Felipe", "João"));
        nomes.set(1, "Maria");
        for(String nome : nomes){
            System.out.println(" " + nome);
        }
    }
    
}
