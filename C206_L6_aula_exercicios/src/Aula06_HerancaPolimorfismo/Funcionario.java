package Aula06_HerancaPolimorfismo;

public  class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public  void mostraInfo(){
        System.out.println("Nome do Funcionario: " + nome);
        System.out.println("Idade do Funcionario: " + idade);
        System.out.println("Salário do Funcionario: " + salario);
    }

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void executaAcao(){

    }
    public double salarioBonus(){
        return salario;
    }
}

