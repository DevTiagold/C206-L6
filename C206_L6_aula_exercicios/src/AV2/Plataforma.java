package AV2;

public class Plataforma {
    String nome;//nome da plataforma Ex:netflix
    Serie[] series = new Serie[10];
    int quantidade;
    int quantida_series, series_grandes, quantidadeDetemporadas;
    float media;
    float porcentagem;
    String nomeDaMaisLonga;

    public void mostrandoInfo(){
        System.out.println("Series Cadastradas: ");
        for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                series[i].mostraInfo();
            }
        }
    }
    public void addSerie(Serie serie ){
        for(int i = 0; i < series.length; i++){
            if(series[i] == null){
                series[i] = serie;
                System.out.println("Serie Adicionada!!");
                quantida_series++;
                if(series[i].temporadas >= 3){
                    quantidadeDetemporadas += series[i].nota;
                    series_grandes++;
                }
                break;
            }
        }
    }
    public String serieMaisLongaFinalizada(){
        quantidade = series[0].temporadas;
        nomeDaMaisLonga = series[0].nome;
        for(int i = 0; i < series.length; i++){
            if(series[i] != null && series[i].finalizada == true && series[i].temporadas > quantidade){
                  nomeDaMaisLonga = series[i].nome;
            }
        }
        return nomeDaMaisLonga;

    }
    public void mediaPorcentagem(){
        //series_grandes = 0;
        //quantidadeDetemporadas = 0 ;
        //quantida_series = 0;
        /*for(int i = 0; i < series.length;i++){
            if(series[i] != null && series[i].temporadas >= 3){
                quantidadeDetemporadas += series[i].nota;
                series_grandes++;
            }
        }*/
        /*for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                quantida_series++;
            }
        }*/

        //aritmetica
        media = (float)quantidadeDetemporadas/series_grandes;
        System.out.println("Media das notas das series grandes: " + media);

        //porcentagem
        porcentagem = (float)series_grandes*100/quantida_series;
        System.out.println("Porcentagem das series com mais temporadas: " + porcentagem + "%");
    }
}
