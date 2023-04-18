import javax.swing.*;
import java.sql.SQLOutput;

public class Empresa {

    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    Funcionario[] funcionarios = new Funcionario[100];

    public Empresa (String nome, String cnpj, String endereco, int funcionariosDisponiveis)
    {
        this.nome=nome;
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.funcionariosDisponiveis=funcionariosDisponiveis;
    }

    public void mostrainfo()
    {
        System.out.println("Nome da empresa: "+this.nome);
        System.out.println("CNPJ da empresa: "+this.cnpj);
        System.out.println("Endereco da empresa: "+this.endereco);
        System.out.println("Quantidade de funcionarios da empresa: "+this.funcionarios);
        System.out.println("Informacoes dos funcionarios das empresas: ");
        System.out.println("----------------------------");

        for (int i = 0; i < funcionarios.length; i++)
        {
            if(funcionarios[i]!=null)
            funcionarios[i].mostrainfo();
        }
    }

   public void adicionarFuncionario(Funcionario f1)
   {
       for (int i = 0; i < funcionarios.length; i++) {
           if(funcionarios[i]==null){
           funcionarios[i]=f1;
               System.out.println("Funcionario adicionado!");
               break;
           }

       }

   }

   public void alocarFuncionario(int index)
   {
       index = index--;
       System.out.println("Terao ");
   }






}
