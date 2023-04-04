package Aula06_HerancaPolimorfismo;

public class Engenheiro extends Funcionario{
    /*String nome;
    int idade;
    double salario;

    public void mostraInfo(){
        System.out.println("Nome do engenheiro: " + nome);
        System.out.println("Idade do engenheiro: " + idade);
        System.out.println("Salário do engenheiro: " + salario);
    }*/
    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÔES DO ENGENHEIRO:");
        super.mostraInfo();
        System.out.println("Ramo do engenheiro---> "+ramo);
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O engenheiro(a) " + getNome() + " está em viagem de trabalho!!");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus()+50238;
    }
}
