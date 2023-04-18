

public class Droid extends Personagem{
    private boolean hostil;

    public Droid(String nome, int id, int poder, boolean hostil) {
        super(nome, id, poder);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if(this.hostil==true)
            System.out.println(" O DROID EH HOSTIL");
        else
            System.out.println("O DROID AINDA NAO EH HOSTIL");
    }

    public void hackearSistema()
    {
        System.out.println(this.getNome() + " hackeou o sistema da nave");
    }
}
