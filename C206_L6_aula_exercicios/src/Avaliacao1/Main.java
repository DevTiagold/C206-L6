package Avaliacao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma p1 = new Plataforma();
        Jogo[] jogos = new Jogo[10];

        System.out.println("Vamos crias uma nova plataforma!!");
        System.out.print("Nome da plataforma: ");
        p1.nome = sc.nextLine();
        System.out.print("Nome do criador: ");
        p1.criados = sc.nextLine();

        boolean flag = true;
        int opcao;
        while(flag == true){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-Cadastrar um novo Jogo");
            System.out.println("2-Mostrar Jogos Disponiveis");
            System.out.println("3-Mostrar o jogo mais barato");
            System.out.println("4-Mostrar DLCs");
            System.out.println("5-Sair da plataforma");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do jogo: ");
                    String nomeGame = sc.nextLine();
                    System.out.print("Genero do jogo: ");
                    String genero = sc.nextLine();
                    System.out.print("Valor do jogo: ");
                    double valor = sc.nextDouble();
                    System.out.print("Dlc true/false: ");
                    sc.nextLine();
                    boolean dlc = sc.nextBoolean();
                    Jogo joguinhos = new Jogo(nomeGame,genero,valor,dlc);
                    p1.adicionarJogo(joguinhos);
                    break;
                case 2:
                    p1.mostraInfo();
                    break;
                case 3:
                    p1.mostraMaisBarato();
                    break;
                case 4:
                    p1.calculaDlc();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao não disponível, digite novamente!");
                    break;

            }
        }

    }
}
