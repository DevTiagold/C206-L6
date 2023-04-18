public class Elfo extends Habitante implements Cura{

    private String tribo;
    public Elfo(int id, String nome, int idade, float energia, String nomea, boolean magic, String tribo) {
        super(id, nome, idade, energia, nomea, magic);
        this.tribo=tribo;
    }

    @Override
    public void atacar() {

        System.out.println("O Elfo esta atacando!");

    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("O Elfo pertence a tribo dos "+this.tribo);
    }

    public void viajar(){
        System.out.println("O Elfo esta em viagem!");
    }

    @Override
    public void curar() {
        System.out.println("O Elfo esta curando!");
    }
}
