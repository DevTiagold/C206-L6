package Av3;

import AV2.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipe e1 = new Equipe();
        Heroi[] herois = new Heroi[10];

        boolean flag = true;
        int opcao;
        System.out.print("Nome do capitao: ");
        e1.capitao = sc.nextLine();
        while (flag == true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-Cadastrar uma novo heroi");
            System.out.println("2-Mostrar Equipe");
            System.out.println("3-Mostrar mais forte");
            System.out.println("4-Mostrar Porcentagem dos herois que podem voar na equipe");
            System.out.println("5-Sair da equipe");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do heroi: ");
                    String nomeheroi = sc.nextLine();
                    System.out.print("Poder: ");
                    float poder = sc.nextFloat();
                    System.out.print("Pode voar: ");
                    sc.nextLine();
                    boolean podeVoar = sc.nextBoolean();
                    Heroi heroiAdd = new Heroi(nomeheroi, poder, podeVoar);
                    e1.adicionaHeroi(heroiAdd);
                    break;
                case 2:
                    e1.mostrandoInfo();
                    break;
                case 3:
                    e1.mostraMaisForte();
                    break;
                case 4:
                    int valor = e1.calculaVoadores();
                    System.out.println("Porcentagem dos que voam é de " + valor + "%");
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
