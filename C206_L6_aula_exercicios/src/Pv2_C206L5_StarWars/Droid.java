package Pv2_C206L5_StarWars;

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

    @Override
    public void travaBatalha() {
        System.out.println(this.getNome()+" TRAVANDO BATALHA");
    }


    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public void hackearSistema(){
        System.out.println(this.getNome() + " HACKEOU O SISTEMA DA NAVE");
    }


}
