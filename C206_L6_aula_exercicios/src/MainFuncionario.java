import java.sql.SQLOutput;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
       //eentradas
        Scanner entrada = new Scanner(System.in);
        String mes;
        int opcao;
        int dias;
        float decimoTerceiro = 2200;
        //criando funcionario
        Funcionario f1 = new Funcionario("Tiago", 19, 11111, 2300);//instancia f1

        //interações com funcionario.tiraferias
        System.out.print("Qual mes quer entrar em férias? ");
        mes = entrada.nextLine();
        System.out.print("Quantos dias apartir desse mes? ");
        dias = entrada.nextInt();
        f1.Tiraferias(mes,dias);

        //interações com salarioAnual
        System.out.println("Deseja ver seu salario anual mais o decimo terceiro? 1-Sim 2-Nao");
        opcao = entrada.nextInt();
        if(opcao == 1){
            System.out.println("Seu salario anual é: R$" + f1.salarioAnual(decimoTerceiro));
        }



    }
}
