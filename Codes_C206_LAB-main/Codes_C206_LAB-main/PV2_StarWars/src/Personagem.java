public abstract class Personagem {

    public static int cont;
    private String nome;
    private int id;
    private int poder;

    public Personagem(String nome, int id, int poder) {
        this.nome = nome;
        this.id = id;
        this.poder = poder;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("NOME DO PERSONAGEM: "+this.nome);
        System.out.println("ID DO PERSONAGEM: "+this.id);
        System.out.println("PODER DO PERSONAGEM: "+this.poder);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
