package Avaliacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;//verificar em qual caso vai cair no switch
        boolean flag;// condição para continuar chamadas de funções
        Ninja[] ninjas = new Ninja[20];
        Aldeia a1 = new Aldeia();

        System.out.print("Nome da aldeia: ");
        a1.nome = sc.nextLine();
        System.out.print("Quantidade de moradores: ");
        a1.qtdMoradores = sc.nextInt();
        sc.nextLine();
        System.out.print("Região da aldeia: ");
        a1.regiao = sc.nextLine();
        flag = true;
        while(flag == true ){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-Cadastrar um novo ninja");
            System.out.println("2-Mostrar ninjas e suas infos");
            System.out.println("3-Mostrar nome dos ninjas ndo rankin S");
            System.out.println("4-Mostra quantidade de titulos");
            System.out.println("5-Sair da plataforma");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeDoNinja = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeNinja= sc.nextInt();
                    System.out.print("Titulo(Gennin/Chunnin/ANBU): ");
                    sc.nextLine();
                    String tituloDoNinja = sc.nextLine();
                    System.out.print("Ranking(S A B C D): ");
                    String rankinDoNinja = sc.nextLine();
                    System.out.println(rankinDoNinja);
                    Ninja ninjaAdd = new Ninja(nomeDoNinja,idadeNinja,tituloDoNinja,rankinDoNinja);
                    a1.adicionarNinja(ninjaAdd);
                    break;
                case 2:
                    a1.mostraInfo();
                    break;
                case 3:
                    a1.rankingS();
                    break;
                case 4:
                    a1.qtdTitulos();
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
