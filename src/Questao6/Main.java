package Questao6;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(" " + numeros.get(i));
        }
    }
}
