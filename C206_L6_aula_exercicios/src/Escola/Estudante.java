package Escola;

public class Estudante {
    String nome;
    int idade;
    String ano;

    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grau esscolar: " + ano);
        System.out.println("--------------------------------------------------");
    }
}
