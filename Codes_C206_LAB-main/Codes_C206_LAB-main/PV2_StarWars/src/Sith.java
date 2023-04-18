public class Sith extends Personagem implements Forca{
    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int id, int poder, String cor, boolean darth) {
        super(nome, id, poder);
        sabre = new Sabre(cor);
        this.darth=darth;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O sabre de luz do " +this.getNome() + " eh da cor " + sabre.getCor());
        if(this.darth==true)
            System.out.println(" O SITH EH DARTH");
        else
            System.out.println("O SITH AINDA NAO EH DARTH");
    }

    public void corromperJedi(){
        if(this.darth==true && this.getPoder()>60)
        {
            System.out.println(this.getNome()+ " levou um jedi pro lado negro da forca");
        }

        else
            System.out.println(this.getNome() + " ainda nao consegue corromper jedis");
    }


    @Override
    public void usarForca() {
        System.out.println(this.getNome()+ " usou o lado negro da forca");
        int poder = getPoder();
        poder = poder +3;
        setPoder(poder);
        System.out.println("Agora seu poder eh de " +this.getPoder());
    }

    @Override
    public void trocarSabre(String cor) {
       this.sabre.setCor(cor);
        System.out.println("Agora seu sabre eh da cor " +this.sabre.getCor());
    }
}
