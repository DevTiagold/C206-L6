package Avaliacao2_Pokemon;

public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{
    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, String t, float luminosidadeAmbiente) {
        super(nome, tipo, t);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }
    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if(super.helditem.tipo == null){
            System.out.println(getNome()+"NÃO POSSUE HELDITEM!");
        }
        else{
            luminosidadeAmbiente += 300;
            System.out.println(getNome()+" POSSUE HELDITEM! FOI ATRIBUÍDO 300 DE PODER NO ATRIBUTO LUMINOSIDADE AMBIENTE!!");
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

    @Override
    public void ataqueEspecial() {
        if(luminosidadeAmbiente >= 650){
            System.out.println(getNome()+" CONSEGUIU GANHAR DO OPONENTE!!");
        }
        else{
            System.out.println(getNome()+" PERDEU A BATALHA!!");
        }
    }
}
