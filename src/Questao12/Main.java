package Questao12;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Maçã", 1.99));
        lista.add(new Produto("Banana", 2.00));
        lista.add(new Produto("Laranja", 2.99));

        lista.forEach(pedidos -> System.out.println(" " + pedidos.nome + " | " + pedidos.preco));
    }
    
}
