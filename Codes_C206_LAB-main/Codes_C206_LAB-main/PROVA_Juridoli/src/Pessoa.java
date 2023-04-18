public class Pessoa {

    public String nome;
    public String cpf;
    public int idade;

    public Pessoa(String nome, String cpf, int idade)
    {
        this.nome = nome;
        this.cpf=cpf;
        this.idade=idade;
    }

     public void mostraInfo()
    {
        System.out.println("Nome da pessoas: " +this.nome);
        System.out.println("Cpf da pessoa: " +this.cpf);
        System.out.println("Idade da pessoa: "+this.idade);
    }
}
