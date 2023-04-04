package Aula06_HerancaPolimorfismo;

public class Arquiteto extends Funcionario {
    /*String nome;
    int idade;
    double salario;

    public void mostraInfo(){
        System.out.println("Nome do Arquiteto: " + nome);
        System.out.println("Idade do Arquiteto: " + idade);
        System.out.println("Salário do Arquiteto: " + salario);
    }*/
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇÔES DO ARQUITETO:");
        super.mostraInfo();
        System.out.println("Especialidade do Arquiteto---> " + especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O arquiteto(a) " + getNome() + " esta planejando um prédio!");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus()+80346;
    }
}
