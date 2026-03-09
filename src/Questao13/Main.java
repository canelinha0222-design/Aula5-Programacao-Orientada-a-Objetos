package Questao13;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Banana", "Maçã", "Laranja"));
        frutas.sort(null);
        frutas.forEach(fruta -> System.out.println(" " + fruta));
    }
    
}
