public class Engenheiro extends Funcionario{

    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        //super = funcionario
        this.ramo=ramo;
    }

    public void  mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade :" +this.ramo);
    }

    public void trabalhar()
    {
        System.out.println("o engenheiro(a) "+this.getNome()+ " está trabalhando");
    }

    public void fazAlgo(){
        System.out.println("o engenheiro(a) "+this.getNome()+ " fazendo algo");
    }

    public void salarioBonus(){
        System.out.println("Sslario novo do engenherio " +(this.getSalario() *3.0));
    }
    //classe funcionario serve como base
    //extends funcionario = encaixar engenheiro como funcionario
    //funcionario se encaixa como superclasse
    //engenheiro, arquitetp e professor =classes filhos


}
