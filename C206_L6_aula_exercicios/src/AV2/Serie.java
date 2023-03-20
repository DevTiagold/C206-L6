package AV2;

public class Serie {
    String nome;
    double nota;
    int temporadas;//quantidade de temporadas
    boolean finalizada;//true or false
    String nomeDiretor;
    Diretor diretores;
    //relação de composição com a classe Serie



    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomeDiretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        /*agregacao
        this.diretores = diretores;*/

        //composicao
        this.diretores = new Diretor(nomeDiretor);

    }

    public void mostraInfo(){

        System.out.println("Nome da serie: " + nome);
        System.out.println("Nota da serie: " + nota);
        System.out.println("Quantidade de temporadas: " + temporadas);
        System.out.println("Foi finalizada? " + finalizada);
        System.out.println("Nome do diretor: " + diretores.nome);
        System.out.println("----------------------------------------------------------------------");
    }



}
