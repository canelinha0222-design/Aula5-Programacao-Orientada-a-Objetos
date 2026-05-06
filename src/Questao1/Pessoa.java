package Questao1;

public abstract class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    abstract void exibirDados();
}