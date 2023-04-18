package Pv2_C206L1_AmongUs;

public class Tripulante extends Astronauta implements Missao{
    private int qtdMissoes;

    public Tripulante(String cor, String nome, String tipo, String nom, int cont) {
        super(cor, nome, tipo, nom, cont);
    }


    public int getQtdMissoes() {
        return qtdMissoes;
    }

    public void setQtdMissoes(int qtdMissoes) {
        this.qtdMissoes = qtdMissoes;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Quantidade de missoes: "+qtdMissoes);
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missao");
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparo");
    }

}
