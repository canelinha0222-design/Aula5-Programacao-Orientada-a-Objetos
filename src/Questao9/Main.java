package Questao9;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>(Arrays.asList("Brasil", "Alemanha", "Itália"));
        paises.clear();
        System.out.println("O arrayList possui " + paises.size() + " elementos");   
    }
}
