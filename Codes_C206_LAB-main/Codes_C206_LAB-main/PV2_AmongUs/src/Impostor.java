public class Impostor extends Astronauta implements Missao,Sabotar,Executar
{

private int qtdMortes=0;

    public Impostor(String cor, String nome, String skin, String pet, int qtdMortes) {
        super(cor, nome, skin, pet);
        this.qtdMortes=qtdMortes;
    }

    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilacao");
    }

    public void trancarPortas(String local)
    {
        System.out.println("O impostor trancou as portas do(a) " + local );
    }

    @Override
    public void reportar() {
        System.out.println( this.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fingiu que fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma tarefa falsa");
    }


    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a Luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o Oxigenio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o Reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a Comunicacao");
    }

    @Override
    public void executar() {
        System.out.println(this.getNome() + " matou um tripulante");
        qtdMortes++;
    }
}
