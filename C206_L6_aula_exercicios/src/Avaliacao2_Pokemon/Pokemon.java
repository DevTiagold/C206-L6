package Avaliacao2_Pokemon;

public abstract class Pokemon {
    public static int qtdPokemon;
    private String nome;
    private String tipo;
    HeldItem helditem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pokemon(String nome, String tipo, String t) {
        this.nome = nome;
        this.tipo = tipo;
        helditem = new HeldItem(t);
        qtdPokemon++;
    }

    public void mostraInfo(){
        System.out.println("NOME DO POKEMON: " + this.nome);
        System.out.println("TIPO DO POKEMON: " + this.tipo);
    }

    public abstract void atacar();
}
