public class MainClass {

    public static void main(String[] args) {


    Mundo mundo1=new Mundo("Free City");
    int quantidade = 0;

    Jogador jogador1=new Jogador("Anna", 35, 0, 10, null, null, 0, 0);
    Bot bot1=new Bot("Joao", 50, 10, 5, false);

    mundo1.personagems[0]=jogador1;
    mundo1.personagems[1]=bot1;

        System.out.println("O nome do mundo chama: " + mundo1.getNome());
        System.out.println("-------------------------------------------");

        Skin skin1=new Skin("Unicornio", "Extremamente raro");
        Mochila mochila1 = new Mochila(10, 15);

        for (int i = 0; i < mundo1.personagems.length; i++) {
            if (mundo1.personagems[i] != null) {
                if (mundo1.personagems[i] instanceof Bot) {
                    Bot b = (Bot) mundo1.personagems[i];
                    b.mostraInfo();
                    b.fazMissao();
                    b.interagir();
                    b.gastarMoedas();
                    b.comprarMoedas(5);
                    System.out.println("--------------------------");
                    quantidade++;
                }
                else if (mundo1.personagems[i] instanceof Jogador) {
                    Jogador j = (Jogador) mundo1.personagems[i];
                    j.mostraInfo();
                    j.fazMissao();
                    j.adicionaSkin(skin1);
                    j.adicionaMochila(mochila1);
                    j.recuperarVida();
                    j.gastarMoedas();
                    j.comprarMoedas(10);

                    System.out.println("--------------------------");
                    quantidade++;

                }
            }
        }

        System.out.println("FORAM CRIADOS UM TOTAL DE " +quantidade+" PERSONAGENS." );


        }}
