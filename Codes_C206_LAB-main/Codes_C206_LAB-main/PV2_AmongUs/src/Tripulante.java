public class Tripulante extends Astronauta implements Missao{

    private int qtdMissoes;

    public Tripulante(String cor, String nome, String skin, String pet, int qtdMissoes) {
        super(cor, nome, skin, pet);
        this.qtdMissoes=qtdMissoes;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Quantidade de missoes: "+qtdMissoes);

    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparo");
    }


    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missao");
    }
}
