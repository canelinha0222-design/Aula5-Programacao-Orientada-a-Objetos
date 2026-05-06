package Questao3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            array.add(i);
        }
        System.out.println("\nDigite um índice para acessar um valor do array array[5]: ");
        int indice = scanner.nextInt();
        try {
        System.out.println(array.get(indice));
    }
        catch(IndexOutOfBoundsException e){
            System.out.println("\níndice de array inválido " + e);
        }
    }
}
    
