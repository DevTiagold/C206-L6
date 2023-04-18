import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Serie {

    public String nomeserie;
    public double nota;
    public int temporadas;
    public boolean finalizada;
    Diretor dono;

    public Serie(String nomeserie, double nota, int temporadas, boolean finalizada, String nomediret)
    {
        this.temporadas = temporadas;
        this.nota = nota;
        this.finalizada = finalizada;
        this.nomeserie = nomeserie;

        this.dono = new Diretor(nomediret);
    }

    public void mostraInfo()
    {
        System.out.println("Nome da Serie: "+ this.nomeserie);
        System.out.println("Nota da Serie: "+ this.nota);
        System.out.println("Temporadas da Serie: "+ this.temporadas);
        System.out.println("Nome da Serie: "+ this.dono.nome);
        if(this.finalizada == true)
            System.out.println("A serie foi finalizada");
        else
            System.out.println("A serie nao foi finalizada");

    }
}
