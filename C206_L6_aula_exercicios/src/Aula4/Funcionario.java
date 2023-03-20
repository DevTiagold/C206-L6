package Aula4;

public class Funcionario {
    String nome;
    int idade;
    int cpf;
    float salario;


    public Funcionario(String nome, int idade, int cpf, float salario) {
        System.out.println("Criou um funcionario!!");
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void Tiraferias(String mes, int qtddias){
        System.out.println("O funcionario " + nome + " tirou ferias de " + qtddias + " dias !");
    }

    public float salarioAnual(float decimoterceiro){
        float salaAnual = salario *12;
        return salaAnual + decimoterceiro;
    }

}
