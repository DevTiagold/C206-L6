public class Anao extends Habitante implements Mineracao{

    private float altura;
    private String reino;

    public Anao(int id, String nome, int idade, float energia, String nomea, boolean magic, float altura, String reino) {
        super(id, nome, idade, energia, nomea, magic);
        this.altura=altura;
        this.reino=reino;
    }

    @Override
    public void atacar() {
        System.out.println("O Anao esta atacando!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Altura do Anao: " +this.altura);
        System.out.println("Reino do Anao: " +this.reino);
    }


    @Override
    public void minerar() {
        System.out.println("O Anao esta minerando!");
    }
}
