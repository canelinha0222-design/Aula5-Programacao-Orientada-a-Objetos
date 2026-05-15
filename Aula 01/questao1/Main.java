package questao1;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    try(BufferedReader bf = new BufferedReader(new FileReader("Aula 01/questao1/dados.txt"))){
        String linha;
        while((linha = bf.readLine()) != null){
            System.out.println(linha);
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
}