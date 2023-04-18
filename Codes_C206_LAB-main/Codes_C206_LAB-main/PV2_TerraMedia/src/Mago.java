public class Mago extends Habitante implements Cura, Feitico{

    private String cor;

    public Mago(int id, String nome, int idade, float energia, String nomea, boolean magic, String cor) {
        super(id, nome, idade, energia, nomea, magic);
        this.cor=cor;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor do Mago eh: " +this.cor);
    }

    @Override
    public void atacar() {
        System.out.println("O Mago esta atacando!");
    }


    @Override
    public void curar() {
        System.out.println("O Mago esta curando!");
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O Mago esta lancando feitico!");
    }
}
