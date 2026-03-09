package Questao15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numeros.contains(numero)){
            System.out.println("O número está no ArrayList numeros");
        }
        else{
            System.out.println("O número não está no ArrayList numero");
        }

        scanner.close();
    }
    
}
