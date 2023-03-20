package Aulaarrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //int[] arrayInt = {10,20,30,40,50,60,70,80,90,100};
        //System.out.println(arrayInt[2]);
        Scanner entrada = new Scanner(System.in);
        Livro[] livros = new Livro[10];

        Livro l1  = new Livro("Diario de um banana", 200);
        livros[0]=l1;
        livros[1] = new Livro("Percy Jackson", 360);

        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilic Pinto";

        boolean flag = true;
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao menu da biblioteca: "+b1.nome);
        while(flag == true){
            System.out.println("1-Cadastrar novo livro");
            System.out.println("2-Mostrar informaçoes dos livros");
            System.out.println("3-Para sair da bibliioteca");

            int opcao;
            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Cadastre um novo livro: ");
                    entrada.nextLine();

                    System.out.print("Nome do livro: ");
                    String nome = entrada.nextLine();
                    System.out.print("Paginas do livro: ");
                    int pags = entrada.nextInt();
                    Livro book = new Livro(nome, pags);
                    b1.addLivro(book);
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Numero errado!");
                    break;

            }
        }

        /*for(int i = 0; i < livros.length; i++){
            if(livros[i] != null){
               livros[i].mostraInfo();
            }

        }*/

    }
}
