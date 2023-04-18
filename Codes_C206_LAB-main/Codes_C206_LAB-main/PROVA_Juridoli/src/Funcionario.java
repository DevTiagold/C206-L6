public class Funcionario {

    public int matricula;
    Pessoa pes;

    public Funcionario(int matricula, String nomepessoa, String cpfpessoa, int idadepessoa)
    {
        this.matricula=matricula;
        this.pes=new Pessoa(nomepessoa, cpfpessoa, idadepessoa);
    }

    public void mostrainfo()
    {
        System.out.println("matricula do funcionario: " +this.matricula);
        System.out.println("nome do funcionario: " +this.pes.nome);
        System.out.println("cpf do funcionario: " +this.pes.cpf);
        System.out.println("idade do funcionario: " +this.pes.idade);
    }
}
