public class Conta implements Comparable<Conta> {
    String nome;
    double saldo;

    public Conta(String nome, double saldo){
        this.saldo=saldo;
        this.nome=nome;
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo, o.saldo);
    }
}
