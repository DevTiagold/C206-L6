package Avaliacao;

public class Ninja {
    String nome;// nome do ninja
    int idade;//idade do ninja
    String titulo;// Gennin, Chunnin e ANBU
    String rankingS;// classificados como S

    public Ninja(String nome, int idade, String titulo, String rankingS) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.rankingS = rankingS;
    }

    public void mostraInfo(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Titulo de ninja: " + titulo);
        System.out.println("Ranking do ninja: " + rankingS);
        System.out.println("----------------------------------------------------------------------");
    }
}
