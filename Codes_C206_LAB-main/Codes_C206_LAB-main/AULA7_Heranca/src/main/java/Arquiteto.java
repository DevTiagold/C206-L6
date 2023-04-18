public class Arquiteto extends Funcionario{

    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade=especialidade;

    }
    public void  mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade :" +this.especialidade);
    }


    public void fazAlgo(){
        System.out.println("o arquiteto(a) "+this.getNome()+ " fazendo algo");
    }

    public void trabalhar()
    {
        System.out.println("o arquiteto(a) "+this.getNome()+ " está trabalhando");
    }

    public void salarioBonus(){
        System.out.println("Sslario novo do arquiteto " +(this.getSalario() *1.10));
    }
}
