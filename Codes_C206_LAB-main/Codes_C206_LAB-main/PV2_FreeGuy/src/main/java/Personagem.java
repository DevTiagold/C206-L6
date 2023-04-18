public abstract class Personagem {
    public static int cont=0;
    protected int id;
    protected String nome;
    protected int vida;
    protected int moedas;

    public Personagem( String nome, int vida, int moedas) {
        cont++;
        this.id=cont;
        this.nome = nome;
        this.vida = vida;
        this.moedas = moedas;
    }

    public void mostraInfo()
    {
        System.out.println("ID DO PERSONAGEM: "+this.id);
        System.out.println("NOME DO PERSONAGEM: "+this.nome);
        System.out.println("VIDA DO PERSONAGEM: "+this.vida);
        System.out.println("MOEDAS DO PERSONAGEM: "+this.moedas);
    }

    abstract void fazMissao();
}
