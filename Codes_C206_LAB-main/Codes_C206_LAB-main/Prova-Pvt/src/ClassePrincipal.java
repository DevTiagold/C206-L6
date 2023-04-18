import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args)
    {
        Plataforma plataforma1 = new Plataforma("Netflix");

        Serie[] series = new Serie[100];

        Serie serie1 = new Serie("PLL", 9.9 , 4 , true , "Jackson");
        plataforma1.addSerie(serie1);
        Serie serie2 = new Serie("GOT", 4.6 , 7 , false , "Camila");
        plataforma1.addSerie(serie2);

        Scanner cin = new Scanner(System.in);
        int op=0;
        boolean flag=true;

        System.out.println("BEM VINDO AO MENU NETFLIX, Selecione a opcao desejada!");
        System.out.println("1:Mostrar as informacoes da plataforma");
        System.out.println("2: Adicionar uma serie nova");
        System.out.println("3: Verificar qual eh a serie mais longa ja finalizada");
        System.out.println("4: fazer a media das notas das series");


        while(flag)
        {
            op = cin.nextInt();
            switch (op)
            {
                case 1:
                    plataforma1.mostraInfo();

                case 2:
                    System.out.println("Entre com o nome da serie");
                    String nomeser = cin.nextLine();
                    System.out.println("Entre com a nota da serie");
                    int notaser = cin.nextInt();
                    System.out.println("Entre com a quantidade de temporadas da serie");
                    int quanttemp = cin.nextInt();
                    System.out.println("A serie foi finalizada?");
                    boolean fina = cin.hasNextBoolean();
                    System.out.println("Entre com o diretor da serie");
                    String nomediret = cin.nextLine();

                    Serie s = new Serie(nomeser, notaser, quanttemp, fina, nomediret);
                    plataforma1.addSerie(s);
                    break;
            }
        }
    }
}
