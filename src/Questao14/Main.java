package Questao14;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Banana", "Maçã", "Laranja"));
     ArrayList<String> produtos = new ArrayList<>(Arrays.asList("Leite", "Biscoito", "Celular"));
     
     if(frutas.equals(produtos)){
        System.out.println("Os dois ArrayList são iguais");
     }
     else{
        System.out.println("Não são iguais");
     }
    }
}
