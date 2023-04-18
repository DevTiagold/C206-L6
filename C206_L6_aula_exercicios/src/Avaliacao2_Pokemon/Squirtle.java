package Avaliacao2_Pokemon;

public class Squirtle extends Pokemon implements FazerBarulho{
    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo, String t, float multiplicadorAgua) {
        super(nome, tipo, t);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    public float getMultiplicadorAgua() {
        return multiplicadorAgua;
    }
    public void setMultiplicadorAgua(float multiplicadorAgua) {
        this.multiplicadorAgua = multiplicadorAgua;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if(super.helditem.tipo == null){
            System.out.println(getNome()+" NÃO POSSUE HELDITEM!");
        }
        else{
            System.out.println(getNome()+" POSSUE HELDITEM!");
        }
    }

    @Override
    public void atacar() {
        System.out.println(this.getNome() + " ESTÁ ATACANDO!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(this.getNome() + " ESTÁ FAZENDO BARULHO!");
    }
}
