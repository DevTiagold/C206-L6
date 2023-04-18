public class MainClass {

    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("joao", 12, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("anna", 78, 1000, "Eletrico");
        Professor professor = new Professor("ze", 23, 1000, "BD");
        Funcionario funcionario = new Funcionario("rebeca", 12, 1000);

        //POLIMORFISMO
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = arquiteto;
        funcionarios[1]=engenheiro;
        funcionarios[2] = professor;



        for (int i = 0; i < funcionarios.length; i++) {

            if(funcionarios[i]!=null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro f = (Engenheiro) funcionarios[i];
                    f.mostraInfo();
                    f.trabalhar();
                    f.salarioBonus();
                    f.fazAlgo();
                    System.out.println("____________________");
                    System.out.println();
                }

                 else if(funcionarios[i] instanceof Arquiteto){
                    Arquiteto a= (Arquiteto) funcionarios[i];
                    a.mostraInfo();
                    a.trabalhar();
                    a.salarioBonus();
                    a.fazAlgo();
                    System.out.println("____________________");
                    System.out.println();
                }


                else if(funcionarios[i] instanceof Professor){
                    Professor p = (Professor) funcionarios[i];
                    p.mostraInfo();
                    p.trabalhar();
                    p.salarioBonus();
                    p.fazAlgo();
                    System.out.println("____________________");
                    System.out.println();
                }

                else
                    System.out.println("Posicao nula");
            }

        }


        /* TESTANDO A HERANCA
        arquiteto.mostraInfo();
        engenheiro.mostraInfo();
        professor.mostraInfo();

        arquiteto.trabalhar();
        engenheiro.trabalhar();
        professor.trabalhar();

        engenheiro.salarioBonus();
        arquiteto.salarioBonus();
        professor.salarioBonus();

        funcionario.mostraInfo();
        funcionario.trabalhar();
        funcionario.salarioBonus();

         */
    }
}
