package Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Tiago", 500);
        Funcionario f2 = new Funcionario("Stef", 1000);
        Funcionario f3 = new Funcionario("Paulo", 2000);

        f1.mostraInfos();
        f2.mostraInfos();
        f3.mostraInfos();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Quantidade de funcionários: " + Funcionario.getCont());//get para mostrar quantidade
        Funcionario.setCont(4);//set mudar quantidade
        System.out.println("Quantidade de funcionários: " + Funcionario.getCont());
        //mostrando salarios
        System.out.println("-------------------------------------------------------------------");
        System.out.println(f1.nomeFuncionario + " recebe: R$"+f1.getSalario());
        System.out.println(f2.nomeFuncionario + " recebe: R$"+f2.getSalario());
        System.out.println(f3.nomeFuncionario + " recebe: R$"+f3.getSalario());
        System.out.println("-------------------------------------------------------------------");
        //aumentando os slarios
        f1.setSalario(600);
        f2.setSalario(1200);
        f3.setSalario(2200);
        System.out.println(f1.nomeFuncionario + ", recebe: R$"+f1.getSalario());
        System.out.println(f2.nomeFuncionario + ", recebe: R$"+f2.getSalario());
        System.out.println(f3.nomeFuncionario + ", recebe: R$"+f3.getSalario());
        System.out.println("-------------------------------------------------------------------");

    }
}
