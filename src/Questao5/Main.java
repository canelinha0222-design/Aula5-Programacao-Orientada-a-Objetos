package Questao5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    double numero = 0;
    Scanner scanner = new Scanner(System.in);
    numero = scanner.nextDouble();
    for(int i = 1; i <= 5; i++){
        System.out.println("Digite um valor para dividir por");
        double numero2 = scanner.nextDouble();
        try {
            numero = numero / numero2;
        if(Double.isNaN(numero) || Double.isInfinite(numero)){
            throw new ArithmeticException("Erro");
        }
    }catch(ArithmeticException e){
        System.out.println("Divisão por zero " + e);
    }
        System.out.println("O resultado é " + numero);
    }

    }
}
