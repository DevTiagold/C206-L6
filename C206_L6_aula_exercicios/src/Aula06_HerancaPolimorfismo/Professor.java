package Aula06_HerancaPolimorfismo;

import java.sql.SQLOutput;

public class Professor extends Funcionario{
    /*String nome;//nome do professor
    int idade;//idade dele
    double salario;//salario dele

    public void mostraInfo(){

        System.out.println("Nome do professor: " + nome);
        System.out.println("Idade do professor: " + idade);
        System.out.println("Salário do professor: " + salario);
    }*/
    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        System.out.println("INFORMAÇOES DO PROFESSOR:");
        super.mostraInfo();
        System.out.println("Matéria do professor---> " + materia);
    }

    public void corrigirProvas(){
        System.out.println("O professor " + getNome() + " está corrigindo provas!!!");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O professor(a) " + getNome() + " está dando aula!!");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;

    }
}
