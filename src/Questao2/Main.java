package Questao2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String>frutas = new ArrayList<>(5);
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Melancia");

        frutas.remove(0);

        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
    
}
