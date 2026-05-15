package Questao1;

class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    void testeSuper(){
        System.out.println(super.idade);
    }

    void exibirDados(){
        System.out.println(this.nome + " " + this.idade + " " + this.matricula);
    }
}