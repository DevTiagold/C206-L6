package Avaliacao2_Pokemon;

public class Main {
    public static void main(String[] args) {
        Treinador t1 = new Treinador("Ash");

        Squirtle p1 = new Squirtle("Squirtle", "Água", null, 170);
        Bulbassaur p2 = new Bulbassaur("Bulbassaur", "Folha", "Pedra da Evolução", 600);
        Pikachu p3 = new Pikachu("Pikachau", "Elétrico", "Pedra da Evolução", 300, 200);

        t1.pokemons[0] = p1;
        t1.addPokemon(p1);
        t1.pokemons[1] = p2;
        t1.addPokemon(p2);
        t1.pokemons[2] = p3;
        t1.addPokemon(p3);

        t1.mostraInfo();


    }

}
