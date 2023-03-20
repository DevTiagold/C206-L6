package Avaliacao1;

public class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Valor do game: " + preco);
        System.out.println("Possue DLC: " + dlc);
        System.out.println();
    }
}
