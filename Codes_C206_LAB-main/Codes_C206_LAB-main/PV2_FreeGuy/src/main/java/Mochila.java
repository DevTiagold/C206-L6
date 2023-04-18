public class Mochila {

    private int qtdItens =0;
    private int capacidade=0;

    public void mostraInfo(){
        System.out.println("Quantidade de itens dentro da mochila: " +qtdItens);
        System.out.println("Capacidade de itens dentro da mochila: "+capacidade);
    }

    public Mochila(int qtdItens, int capacidade) {
        this.qtdItens = qtdItens;
        this.capacidade = capacidade;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
