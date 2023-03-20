package Aulaarrays;

public class Livro {
    String nome;
    int numpags;

    public Livro(String nome, int numpags) {
        this.nome = nome;
        this.numpags = numpags;
    }
    public void mostraInfo(){
        System.out.print("Nome: " + nome);
        System.out.println(", Numero de paginas: " + numpags);
        System.out.println("--------------------------------------------------");
    }

//if(nome.equals("Vitor")
}
