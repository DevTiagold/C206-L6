package Avaliacao2_Pokemon;

public class Treinador {
    private String nome;
    public int cont = 0;
    Pokemon pokemons[] = new Pokemon[5];

    public Treinador(String nome) {
        this.nome = nome;

    }

    public void addPokemon(Pokemon p){
        for(int i = 0 ; i < pokemons.length; i++){
            if(pokemons[i] == null){
                pokemons[i] = p;
                cont++;
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("NOME DO TREINADOR: " + this.nome);
        System.out.println("POKEMONS NA POKEDEX: " + cont);
        System.out.println("------------------------------------------------");
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] != null){
                if(pokemons[i] instanceof Squirtle){
                    Squirtle s = (Squirtle) pokemons[i];
                    s.mostraInfo();
                    s.atacar();
                    s.fazerBarulho();
                    System.out.println("------------------------------------------------");

                }
                else if(pokemons[i] instanceof Bulbassaur){
                    Bulbassaur b = (Bulbassaur) pokemons[i];
                    b.mostraInfo();
                    b.atacar();
                    b.fazerBarulho();
                    b.ataqueEspecial();
                    System.out.println("------------------------------------------------");

                }
                else if(pokemons[i] instanceof Pikachu){
                    Pikachu p = (Pikachu) pokemons[i];
                    p.mostraInfo();
                    p.atacar();
                    p.fazerBarulho();
                    p.ataqueEspecial();
                    System.out.println("------------------------------------------------");

                }
            }
        }
    }


}
