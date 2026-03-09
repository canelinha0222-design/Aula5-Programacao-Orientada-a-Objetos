package Questao3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>(5);
        for(int i = 1; i <= 5; i++){        
            numeros.add(i);
        }
        if (numeros.contains(3)) {
            System.out.println("O 3 foi encontrado!");
        } else {
            System.out.println("O 3 não foi encontrado!");
        }
    }
    
}
