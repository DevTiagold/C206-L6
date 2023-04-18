package Pv2_C206L1_AmongUs;

public abstract class Astronauta {
    public static int cont;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome, String tipo, String nom, int cont) {
        this.cor = cor;
        this.nome = nome;
        skin = new Skin(tipo);
        pet = new Pet(nom);
        this.cont = cont;
    }

    public void mostraInfo(){
        System.out.println("COR DO ASTRONAUTA EH: "+this.cor);
        System.out.println("NOME DO ASTRONAUTA EH: "+this.nome);

        if(this.skin.getTipo()==null)
            System.out.println("O ASTRONAUTA NAO TEM SKIN");
        else
            System.out.println("SKIN DO ASTRONAUTA EH: "+this.skin.getTipo());

        if (this.pet.getNome()==null)
            System.out.println("O ASTRONAUTA NAO TEM PET");
        else
            System.out.println("PET DO ASTRONAUTA EH: "+this.pet.getNome());

    }
    public void verCameras(){
        System.out.println(this.nome + " olhou as cameras");
    }

    public abstract void reportar();


    public abstract void reparar();

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

