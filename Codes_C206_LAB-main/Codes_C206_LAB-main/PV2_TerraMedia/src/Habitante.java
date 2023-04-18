public abstract class Habitante {

    public static int contador=0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    public Arma arma;

    public Habitante(int id, String nome, int idade, float energia,String nomea, boolean magic) {
        contador++;
        this.id=contador;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        arma = new Arma(nomea, magic);
    }

    public abstract void atacar();


    public void mostraInfo(){
        System.out.println("ID DO HABITANTE: " +this.id);
        System.out.println("NOME DO HABITANTE: " + this.nome);
        System.out.println("IDADE DO HABITANTE: " +this.idade);
        System.out.println("ENERGIA DO HABITANTE: " +this.energia);
        System.out.println("ARMA DO HABITANTE EH UM(A): "+this.arma.getNomeArma());

        if (this.arma.getMagica()==true)
            System.out.println("A ARMA DO HABITANTE EH MAGICA");
        else
            System.out.println("A ARMA DO HABITANTE NAO EH MAGICA");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
