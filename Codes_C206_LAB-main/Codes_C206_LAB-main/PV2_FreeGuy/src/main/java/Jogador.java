public class Jogador extends Personagem implements Suplemento, Loja{

    private int nivel;
    Skin skins;
    Mochila mochila;

    public Jogador( String nome, int vida, int moedas, int nivel, String nomes, String raridad, int qtdi, int capac) {
        super( nome, vida, moedas);
        this.nivel=nivel;
        skins = new Skin(nomes, raridad);
        mochila = new Mochila(qtdi, capac);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();

        if(this.skins.getNome()==null)
            System.out.println("O Jogador nao tem Skin");
        else
            this.skins.mostraInfo();

        if (this.mochila.getCapacidade()==0)
            System.out.println("O Jogador nao tem mochila");
        else
            this.mochila.mostraInfo();
    }


    @Override
    void fazMissao() {
        System.out.println(this.nome + "completou uma missao!Siga seu progresso.");
        int novonivel =this.nivel+1;
        System.out.println("Seu novo nivel eh de " +novonivel);

    }

    public void adicionaSkin(Skin skin)
    {
        this.skins.setNome(skin.getNome());
        this.skins.setRaridade(skin.getRaridade());

        System.out.println("Uma skin de " +this.skins.getNome() + " de raridade " + this.skins.getRaridade() + " foi adicionada");
    }

    public void adicionaMochila(Mochila mochila1){
        this.mochila.setCapacidade(mochila1.getCapacidade());
        this.mochila.setQtdItens(mochila1.getQtdItens());

        System.out.println("Uma mochila de capacidade " +this.mochila.getCapacidade() + " com um total de itens " +this.mochila.getQtdItens() +
        " foi adicionada.");
    }

    @Override
    public void recuperarVida() {
        if (this.vida<100)
        this.vida= this.vida+5;

        else
            this.vida=100;

        System.out.println("A nova vida do jogador eh "+ this.vida);
    }


    @Override
    public void gastarMoedas() {

        if(this.moedas==0)
            System.out.println("Nao tem moedas pra gastar.");
        else{
        if(this.mochila.getQtdItens()<this.mochila.getCapacidade()) {
            System.out.println(this.nome + " gastou moedas na loja");
            int qtdn=this.mochila.getQtdItens();
            qtdn=qtdn+1;
            this.mochila.setQtdItens(qtdn);
        }

        else
            System.out.println("Nao foi possivel comprar algum intem, pois a mochila esta cheia.");
        }
    }

    @Override
    public void comprarMoedas(int qtdMoedas) {
        System.out.println(this.nome + " comprou moedas na loja! Ele comprou " +qtdMoedas + " moedas.");

    }
}
