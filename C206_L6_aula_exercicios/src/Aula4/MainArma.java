package Aula4;

public class MainArma {
    public static void main(String[] args) {

        Arma a1 = new Arma("Longo Alcance", 10000);
        Nave n1 = new Nave("Milennion falcon", 500, false, "LongoAlcance", 1000);
        n1.addArma(a1);
        n1.mostraInfo();

    }
}
