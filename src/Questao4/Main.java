package Questao4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String>cidades = new ArrayList<>();
        cidades.add("Rio de Janeiro");
        cidades.add("Brasília");
        cidades.add("Fortaleza");
        cidades.add("Belo Horizonte");
        cidades.add("Manaus");

        System.out.println("O Rio de Janeiro está no índice: " + cidades.indexOf("Rio de Janeiro"));
    }
    
}
