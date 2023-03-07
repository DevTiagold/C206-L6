public class Nave {
    String nome;
    int velocidade;
    boolean velocidadeDaluz;
    Arma arma;
    public Nave(String nome, int velocidade, boolean velocidadeDaluz, String tipodaArma, int forca) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaluz = velocidadeDaluz;

        //this.arma = new Arma(tipodaArma, forca); --> diciona arma automticamente
        this.arma = arma;
    }

    public void mostraInfo(){
        System.out.println("Nome da nave + "+ this.nome);
        System.out.println("Velocidade da nava  "+ this.velocidade);
        //System.out.println("Está na velocidade da luz+ "+ this.velocidadeDaluz);
        if(this.arma == null){
            System.out.println("Nao tem arma adicionada!");
        }
       else{
            System.out.println("Tipo da arma: "+ this.arma.tipo);
            System.out.println("Força da arma: "+ this.arma.forca);
        }

    }
    public void viajarVelocidadeDaLuz(){
        if(this.velocidadeDaluz==true){
            System.out.println("Está na velocidade da luz!");
        }
        else{
            System.out.println("Não viaja a velocidade da luz!");
        }
    }
    public void addArma(Arma arma){
        System.out.println("Arma foi adicionada");
        this.arma = arma;
    }
}
