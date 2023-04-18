public class Arma {

    private String nomeArma;
    private boolean magica;

    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public boolean getMagica() {
        return magica;
    }

    public void setMagica(boolean magica) {
        this.magica = magica;
    }
}
