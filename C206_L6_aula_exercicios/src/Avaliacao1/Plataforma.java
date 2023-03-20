package Avaliacao1;

import java.util.Scanner;

public class Plataforma {

    String nome; //nome da plataforma de jogos
    String criados;//nome do criador
    String[] nomeDeJogos = new String[10];
    Jogo[] jogos = new Jogo[10];// vetor de 10 jogos e suas informaçoes adicionais
    String nomeMaisCaro;

    public void mostraInfo(){//Mostra informações
        System.out.println("A " + nome + " possue os seguintes jogos: ");
        for(int i = 0; i < jogos.length; i++){
            if(jogos[i] != null){
                jogos[i].mostraInfo();
            }
        }
    }
    public void adicionarJogo(Jogo j1){//adiciona jogo
        for(int i = 0; i <  jogos.length; i++) {
            if(jogos[i] == null){
                jogos[i] = j1;
                System.out.println("Adicionado na plataforma!");
                if(jogos[i].dlc == true){
                    nomeDeJogos[i] = jogos[i].nome;
                }
                break;
            }
        }

    }
    public void mostraMaisCaro(){//mostra mais caro
        double maisCaro = jogos[0].preco;
        nomeMaisCaro = jogos[0].nome;
        for(int i = 0; i < jogos.length; i++){
            if(jogos[i] != null) {
                if (jogos[i].preco > maisCaro) {
                    maisCaro = jogos[i].preco;
                    nomeMaisCaro = jogos[i].nome;
                }
            }
        }
        System.out.println("O jogo mais caro disponivel é: " );
        System.out.println("-" + nomeMaisCaro + " que custa R$"+ maisCaro);
    }
    public void calculaDlc(){//mostra quantos e quais jogos possuem DLC
        System.out.println("Possuem DLC: ");
        for(int i = 0; i <  jogos.length; i++) {
            if(jogos[i] != null){
                if(jogos[i].dlc == true){
                    System.out.println("-" + jogos[i].nome);
                }

            }
        }
    }

}
