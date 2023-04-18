public class Nave {

    private String nome;
    public Personagem[] personagems = new Personagem[10];
    private boolean velocidadedaLuz;


    public Nave(String nome, boolean velocidadedaLuz) {
        this.nome = nome;
        this.velocidadedaLuz = velocidadedaLuz;
    }

    public void mostraInfo()
    {

        System.out.println("NOME DA NAVE: " + this.nome);
        System.out.println("A NAVE ANDA EM VELOCIDADE DA LUZ: " + this.velocidadedaLuz);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < personagems.length; i++)
        {
            if(personagems[i]!=null){
                if(personagems[i] instanceof Jedi){
                    Jedi J = (Jedi) personagems[i];
                    J.mostraInfo();
                    J.treinarPadawan();
                    J.trocarSabre("amarelo");
                    J.usarForca();
                    System.out.println("--------------------------");
                }
                else if (personagems[i] instanceof Sith) {
                    Sith s = (Sith) personagems[i];
                    s.mostraInfo();
                    s.usarForca();
                    s.trocarSabre("azul");
                    s.corromperJedi();
                    System.out.println("--------------------------");

                }
                else if (personagems[i] instanceof Droid) {
                    Droid d = (Droid) personagems[i];
                    d.mostraInfo();
                    d.hackearSistema();
                    System.out.println("--------------------------");
                }
            }

        }
    }
}

