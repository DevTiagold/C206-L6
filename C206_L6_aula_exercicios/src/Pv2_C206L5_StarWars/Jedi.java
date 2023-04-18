package Pv2_C206L5_StarWars;

public class Jedi extends Personagem implements Treinamento, Forca {
    private boolean mestre;
    Sabre sabre;

    public Jedi(String nome, int id, int poder, String cor, boolean mestre) {
        super(nome, id, poder);
        this.mestre = mestre;
        sabre = new Sabre(cor);
    }

    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(boolean mestre) {
        this.mestre = mestre;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        super.mostraInfo();
        System.out.println("O sabre de luz do " +this.getNome() + " eh da cor " + sabre.getCor());
        if(this.mestre==true)
            System.out.println(" O JEDI EH MESTRE");
        else
            System.out.println("O JEDI AINDA NAO EH MESTRE");
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou a forca para o bem");
        int poder=getPoder();
        poder = poder+5;
        setPoder(poder);
        System.out.println("Agora seu poder eh de " +this.getPoder());
    }

    @Override
    public void trocarSabre(String cor) {
        this.sabre.setCor(cor);
        System.out.println("Agora seu sabre eh da cor " +this.sabre.getCor());
    }

    @Override
    public void travaBatalha() {
        System.out.println(this.getNome()+" TRAVANDO BATALHA");
    }

    @Override
    public void treinarPadawan() {
        if (mestre == true || this.getPoder() > 70) {
            System.out.println(this.getNome()+ " treinou um padawan");
        }

        else{
            System.out.println(this.getNome()+ " ainda nao consegue treinar padawans");
        }
    }
}
