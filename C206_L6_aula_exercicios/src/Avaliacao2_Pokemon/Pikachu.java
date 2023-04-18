package Avaliacao2_Pokemon;

public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{
    private float soltarRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, String t, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo, t);
        this.soltarRaios =soltarRaios;
        this.paralisiaEletrica =paralisiaEletrica;
    }

    public float getSoltarRaios() {
        return soltarRaios;
    }
    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }
    public float getParalisiaEletrica() {
        return paralisiaEletrica;
    }
    public void setParalisiaEletrica(float paralisiaEletrica) {
        this.paralisiaEletrica = paralisiaEletrica;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if(super.helditem.tipo == null){
            System.out.println(getNome()+"NÃO POSSUE HELDITEM!");
        }
        else{
            soltarRaios += 200;
            System.out.println(getNome()+" POSSUE HELDITEM! FOI ATRIBUÍDO 200 DE PODER NO ATRIBUTO SOLTAR RAIOS!!");
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
        if(soltarRaios >= 750){
            System.out.println(getNome()+" CONSEGUIU GANHAR DO OPONENTE!!");
        }
        else{
            System.out.println(getNome()+" PERDEU A BATALHA!!");
        }

    }


}
