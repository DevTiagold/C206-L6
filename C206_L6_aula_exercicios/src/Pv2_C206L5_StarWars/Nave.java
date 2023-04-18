package Pv2_C206L5_StarWars;

public class Nave {
    private String nome;
    Personagem[] personagens = new Personagem[3];
    private boolean velocidadeLuz;

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("NOME DA NAVE: " + this.nome);
        System.out.println("A NAVE ANDA EM VELOCIDADE DA LUZ: " + this.velocidadeLuz);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < personagens.length; i++)
        {
            if(personagens[i]!=null){
                if(personagens[i] instanceof Jedi){
                    Jedi J = (Jedi) personagens[i];
                    J.mostraInfo();
                    J.treinarPadawan();
                    J.trocarSabre("amarelo");
                    J.usarForca();
                    System.out.println("--------------------------");
                }
                else if (personagens[i] instanceof Sith) {
                    Sith s = (Sith) personagens[i];
                    s.mostraInfo();
                    s.usarForca();
                    s.trocarSabre("azul");
                    s.corromperJedi();
                    System.out.println("--------------------------");

                }
                else if (personagens[i] instanceof Droid) {
                    Droid d = (Droid) personagens[i];
                    d.mostraInfo();
                    d.hackearSistema();
                    System.out.println("--------------------------");
                }
            }

        }
    }
}
