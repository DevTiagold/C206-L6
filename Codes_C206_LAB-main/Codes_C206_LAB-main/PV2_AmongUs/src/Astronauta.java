public abstract class Astronauta {

    public static int cont;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;



    public Astronauta(String cor, String nome, String tipo,String nom) {
        this.cor = cor;
        this.nome = nome;
        skin = new Skin(tipo);
        pet = new Pet(nom);
        cont++;

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

    public void verCameras()
    {
        System.out.println(this.nome + " olhou as cameras");
    }

    public abstract void reportar();

    public abstract void reparar();



    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Astronauta.cont = cont;
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

    }

