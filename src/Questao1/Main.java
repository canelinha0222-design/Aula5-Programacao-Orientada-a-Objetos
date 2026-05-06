package Questao1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o primeiro valor");
        double valor1 = scanner.nextDouble();
        System.out.println("\nDigite o segundo valor");
        double valor2 = scanner.nextDouble();
        double resultado = 0;
        try{
        resultado = valor1 / valor2;
        if(Double.isNaN(resultado)){
            throw new ArithmeticException("Divisão por zero");
        }
        System.out.println("\nO resultado é : " + resultado + "\n");
     } catch(ArithmeticException divisaoZero){
            System.err.println("\nErro " + divisaoZero + "\n");
        } 
    }
}