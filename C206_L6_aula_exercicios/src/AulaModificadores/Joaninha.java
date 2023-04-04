package AulaModificadores;

public class Joaninha {

    public static int qtdJoaninha;//membros estaticos , atributo somente da classe
    int idade;
    String cor;

    public Joaninha(int idade, String cor) {
        qtdJoaninha++;
        this.idade = idade;
        this.cor = cor;
        System.out.println(qtdJoaninha);
    }
}
