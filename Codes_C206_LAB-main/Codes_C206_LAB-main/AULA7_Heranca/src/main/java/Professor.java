public class Professor extends Funcionario{

    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {

        super(nome, idade, salario);
        this.materia=materia;
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia:" + this.materia);
    }

    public void fazAlgo(){
        System.out.println("o professor(a) "+this.getNome()+ " fazendo algo");
    }

    public void trabalhar()
    {
        System.out.println("o professor(a) "+this.getNome()+ " está trabalhando");
    }

    public void salarioBonus(){
        System.out.println("Sslario novo do professor " +(this.getSalario() *1.50));
    }
}


