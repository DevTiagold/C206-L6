public class Bot extends Personagem implements Interacao, Loja{

    private boolean inteligente;

    public Bot(String nome, int vida, int moedas, int i, boolean inteligente) {
        super( nome, vida, moedas);
        this.inteligente=inteligente;
    }

    @Override
    void fazMissao() {
        if(this.inteligente==true)
            System.out.println("O bot inteligente completou uma missao! O aprendizado de maquina realmente funciona.");
        else
            System.out.println("O bot ainda nao eh inteligente para realizar uma missao.");

    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if (this.inteligente==true)
            System.out.println("O Bot eh inteligente");
        else
            System.out.println("O Bot ainda nao eh inteligente");
    }

    @Override
    public void interagir() {
        if(this.inteligente==true)
            System.out.println("O bot nao interage mais de forma padrao. Ele aprendeu a conversar.");
        else
            System.out.println("O bot esta interagindo de forma padrao.");
    }

    @Override
    public void gastarMoedas() {

        if(this.moedas==0)
            System.out.println("Nao tem moeda pra gastar!");
        else {
            if (this.inteligente == true)
                System.out.println("O bot aprendeu a gastar moedas");
            else
                System.out.println("O bot ainda nao consegue gastar moedas");
        }
    }

    @Override
    public void comprarMoedas(int qtdMoedas) {
        if(this.inteligente==true)
            System.out.println("O bot aprendeu a comprar moedas.Ele comprou "+qtdMoedas + " moedas.");
        else
            System.out.println("O bot ainda nao consegue comprar moedas");
    }
}
