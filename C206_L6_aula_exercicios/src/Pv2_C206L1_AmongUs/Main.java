package Pv2_C206L1_AmongUs;

import jdk.jshell.ImportSnippet;

public class Main {
    public static void main(String[] args) {
           Tripulante t1 = new Tripulante("vermelha", "Tiago", "Gatinho", "gato", 10);
           Impostor i1 = new Impostor("preta", "joao", null, null, 0);

           Astronauta[] astronautas = new Astronauta[4];
           astronautas[0] = t1;
           astronautas[1] = i1;

           for(int i = 0; i < astronautas.length; i++){
               if(astronautas[i] != null){
                   if(astronautas[i] instanceof Impostor){
                       Impostor imp = (Impostor) astronautas[i];
                       imp.mostraInfo();
                       imp.usarVentoinhas();
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
