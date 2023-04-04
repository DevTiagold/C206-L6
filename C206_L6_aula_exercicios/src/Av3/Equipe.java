package Av3;

import java.sql.SQLOutput;

public class Equipe {
    String capitao;
    Heroi[] herois = new Heroi[10];
    float maisForte;
    int quantidadeVoam;
    String nomeMaisForte;
    int porcentagem;
    int heroisCadastrados;

    public void adicionaHeroi(Heroi heroiAdd){
        //maisForte = herois[0].poder;
       // nomeMaisForte = herois[0].nome;
        for(int i = 0; i < herois.length; i++){
            if(herois[i] == null){
                herois[i] = heroiAdd;
                /*if(herois[i].poder > maisForte){
                    maisForte = herois[i].poder;
                    nomeMaisForte = herois[i].nome;
                }*/
                /*if(herois[i].podeVoar == true){
                    quantidadeVoam++;
                }*/
                System.out.println("Heroi Adicionado!!");
                heroisCadastrados++;
                break;

            }
        }
    }
    public void mostrandoInfo(){
        System.out.println("Capitao: " + capitao);
        for(int i = 0; i < herois.length; i++){
            if(herois[i] != null){
                System.out.println("Heroi: " + herois[i].nome);
                System.out.println("Poder: " + herois[i].poder);
                System.out.println("Voa? " + herois[i].podeVoar);
                System.out.println();
            }
        }
    }

    public void mostraMaisForte(){
        System.out.println("O heroi mais forte: ");
        System.out.println("-Nome: " + nomeMaisForte);
        System.out.println("-Poder: " + maisForte);
    }

    public int calculaVoadores(){
        porcentagem = quantidadeVoam*100/heroisCadastrados;
        return porcentagem;
    }
}
