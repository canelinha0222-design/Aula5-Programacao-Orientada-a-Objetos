package Questao1;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer>lista = new ArrayList<>(10);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        for(int i : lista){
            System.out.println(i);
        }
    }
}