public class MainClass {
    public static void main(String[] args) {

        Tripulante tripulante1 = new Tripulante("Vermelho", "Anna", "Gatinho", "gato", 10);
        Impostor impostor1 = new Impostor("verde", " Joao", null, null, 0);

        Astronauta[] astronautas = new Astronauta[4];

        astronautas[0] = tripulante1;
        astronautas[1] = impostor1;

        for (int i = 0; i < astronautas.length; i++)
        {
            if(astronautas[i]!=null){
                if(astronautas[i] instanceof Impostor){
                    Impostor imp = (Impostor) astronautas[i];
                    imp.mostraInfo();
                    imp.usarVentoinha();
                    imp.trancarPortas("Sala de cameras");
                    imp.reportar();
                    imp.reparar();
                    imp.fazerMissao();
                    imp.sabotarLuz();
                    imp.sabotarOxigenio();
                    imp.sabotarReator();
                    imp.sabotarComunicacao();
                    imp.executar();
                    System.out.println("--------------------------");
                }
                else if (astronautas[i] instanceof Tripulante) {
                    Tripulante t = (Tripulante) astronautas[i];
                    t.mostraInfo();
                    t.reportar();
                    t.reparar();
                    t.fazerMissao();
                    System.out.println("--------------------------");

                }
            }

        }
    }
}
