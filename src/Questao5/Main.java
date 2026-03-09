package Questao5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> animais = new ArrayList<>();

        animais.add("Coelho");
        animais.add("Lobo");
        animais.add("Corvo");

        animais.set(1, "Gato");
        for (String animal : animais) {
            System.out.println(" " + animal);
        }
    }
}
