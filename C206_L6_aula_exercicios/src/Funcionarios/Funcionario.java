package Funcionarios;

public class Funcionario {

    String nomeFuncionario;
    int id;
    private static int cont = 0;
    private int salario;
    public Funcionario(String nomeFuncionario, int salario) {
        cont++;
        this.nomeFuncionario = nomeFuncionario;
        this.id = cont;
        this.salario = salario;
    }

    public void mostraInfos(){
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Id: " + id);

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public static int getCont() {
        return cont;
    }
    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }
}
