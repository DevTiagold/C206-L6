public class Plataforma {

    public String nomeplat;
    public Serie[] series = new Serie[100];

    public Plataforma(String nomeplat)
    {
      this.nomeplat = nomeplat;
    }

    public void mostraInfo()
    {
        System.out.println("Nome da plataforma: " +this.nomeplat);
        System.out.println("Informacoes das series: ");
        for (int i = 0; i < series.length; i++)
        {
            if(series[i]!=null){
            series[i].mostraInfo();
            break;
            }
        }
        System.out.println("a plataforma contem " +series.length + "series");
    }

    public void addSerie(Serie serie)
    {
        for (int i = 0; i < series.length ; i++) {
            if(series[i]==null) {
                series[i] = serie;
                System.out.println("Serie adicionada!");
                break;
            }
        }
    }

    public String serieMaisLongaFinalizada()
    {
        int maislong=0;
        int qual=0;

        for (int i = 0; i < series.length; i++)
        {
            if(series[i]!=null)
            {
                if (series[i].finalizada == true && series[i].temporadas > maislong)
                {
                    maislong = series[i].temporadas;
                    qual = i;
                }
            }
        }
        return series[qual].nomeserie;
    }

    public void mediaPorcentagem()
    {
        double soma=0;
        int quant=0;
        double media=0;

        for (int i = 0; i < series.length; i++) {
            if(series[i].temporadas>=3)
            {
                soma=soma+series[i].nota;
                quant++;
            }

        }

        media=soma/quant;

        System.out.println("Media das Porcentagens " +media);
    }
}
