package Avaliacao;

import java.sql.SQLOutput;

public class Aldeia {
    String nome;// nome da aldeia
    int qtdMoradores;// quantidade de moradores da aldeia
    String regiao;//regiao da aldeia
    Ninja[] ninjas = new Ninja[20];
    int contaGennin;
    int contaChunnin;
    int contaANBU;

    public void adicionarNinja(Ninja ninja){
        for(int i = 0 ; i < ninjas.length; i++){
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                System.out.println("Ninja Adicionado com Sucesso!");
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Informações dos ninjas da aldeia: ");
        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] != null){
               ninjas[i].mostraInfo();
            }
        }
    }
    public void rankingS(){
        System.out.println("Ninjas Qualiicados: ");
        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] != null){
                if(ninjas[i].rankingS.equals("S")){
                    System.out.println("-" + ninjas[i].nome);
                }
            }
        }
    }
    public void qtdTitulos(){

        contaGennin = 0;
        contaChunnin = 0;
        contaANBU = 0;

        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] != null){
                if(ninjas[i].titulo.equals("Gennin"))
                    contaGennin++;
                if(ninjas[i].titulo.equals("Chunnin"))
                    contaChunnin++;
                if(ninjas[i].titulo.equals("ANBU"))
                    contaANBU++;
            }
        }
        System.out.println("Quantidade de Gennin: " + contaGennin);
        System.out.println("Quantidade de Chunnin: " + contaChunnin);
        System.out.println("Quantidade de ANBU: " + contaANBU);
    }

}
