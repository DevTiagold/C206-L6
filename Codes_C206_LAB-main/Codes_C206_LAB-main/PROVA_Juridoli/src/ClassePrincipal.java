import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        Empresa emp1 = new Empresa("Empreitera", "1271738128811", "avenida antonio paulino", 4);

        Funcionario fun1 = new Funcionario(1, "emerson", "37540-000", 23);
        emp1.adicionarFuncionario(fun1);
        Funcionario fun2 = new Funcionario(2, "julia", "4543-000", 21);
        emp1.adicionarFuncionario(fun2);


        boolean flag =true;


        System.out.println("BEM VINDO AO MENU!! Entre com a operacao que voce deseja!");
        System.out.println("1: adicionar um funcionario");
        System.out.println("2: Mostrar as informacoes da empresa e de seus funcionarios!" );
        System.out.println("3: Para sair do menu" );
        System.out.println("-------------------------------------------------------");

        Scanner in = new Scanner(System.in);
        int op;

        while(flag==true){
        op = in.nextInt();

        switch (op) {
            case 1: {
                System.out.println("Entre com a matriucula do novo funcionario: ");
                int matricula = in.nextInt();
                in.nextLine();
                System.out.println("Entre com nome do novo funcionario: ");
                String nome = in.nextLine();
                System.out.println("Entre com a cpf do novo funcionario: ");
                String cpf = in.nextLine();
                System.out.println("Entre com a idade do novo funcionario: ");
                int idade = in.nextInt();

                Funcionario fun3 = new Funcionario(matricula, nome, cpf, idade);
                emp1.adicionarFuncionario(fun3);
                break;
            }

            case 2: {
                emp1.mostrainfo();
                break;
            }

            case 3:
                {
                    flag=false;
                    break;
                }
        }}

    } }

