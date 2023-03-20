package AV2;

import Avaliacao1.Jogo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma p1 = new Plataforma();
        Serie[] series = new Serie[10];


        System.out.print("Nome da plataforma: ");
        p1.nome = sc.nextLine();
        boolean flag = true;
        int opcao;
        while(flag == true){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-Cadastrar uma nova Serie");
            System.out.println("2-Mostrar Series Disponiveis");
            System.out.println("3-Mostrar Serie mais longa completa");
            System.out.println("4-Mostrar Porcentagem e media aritmedica de series com mais de 3 temporadas");
            System.out.println("5-Sair da plataforma");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    sc.nextLine();
                    System.out.print("Nome da serie: ");
                    String nomeDaSerie = sc.nextLine();
                    System.out.print("Avalicao da serie: ");
                    double nota = sc.nextDouble();
                    System.out.print("Quantidade de temporadas: ");
                    int qtd = sc.nextInt();
                    System.out.print("A serie já está completa(true/false): ");
                    sc.nextLine();
                    boolean finalizada = sc.nextBoolean();
                    System.out.print("Diretor responsável: ");
                    sc.nextLine();
                    String nomeDoDiretor = sc.nextLine();
                    Serie seriesAdd = new Serie(nomeDaSerie,nota,qtd,finalizada, nomeDoDiretor);
                    p1.addSerie(seriesAdd);
                    break;
                case 2:
                    p1.mostrandoInfo();
                    break;
                case 3:
                    String recebe = p1.serieMaisLongaFinalizada();
                    System.out.println("Nome da mais longa finalizada: " + recebe);
                    break;
                case 4:
                    p1.mediaPorcentagem();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite novamente...");
                    break;
            }
        }

    }

}
