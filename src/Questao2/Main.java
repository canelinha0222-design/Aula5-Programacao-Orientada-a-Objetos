package Questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um número inteiro: ");
        String valor = scanner.nextLine();
        try{
            Integer.parseInt(valor);
        }catch(NumberFormatException e){
            System.out.println("\nErro na conversão: " + "valor " + valor + "\n");
        }
    }

}
