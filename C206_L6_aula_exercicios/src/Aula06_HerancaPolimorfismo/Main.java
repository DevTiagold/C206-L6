package Aula06_HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        Arquiteto a1 = new Arquiteto("Stefanie", 19, 20000, "Predial");
        Engenheiro e1 = new Engenheiro("Tiago", 19, 20000,"Computação");
        Professor p1 = new Professor("Chris", 32,1000, "POO");

        funcionarios[0] = a1;
        funcionarios[1] = e1;
        funcionarios[2] = p1;

        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro eV = (Engenheiro) funcionarios[i];
                    eV.mostraInfo();
                    System.out.println("--------------------------------------------------------");
                }
                else if(funcionarios[i] instanceof Professor){
                    Professor pV = (Professor) funcionarios[i];
                    pV.mostraInfo();
                    System.out.println("--------------------------------------------------------");
                }
                else if(funcionarios[i] instanceof Arquiteto){
                    Arquiteto aV = (Arquiteto) funcionarios[i];
                    aV.mostraInfo();
                    System.out.println("--------------------------------------------------------");
                }
            }
        }
       /* System.out.println("--------------------------------------------------------");
        /*a1.setNome("Stefanie");
        a1.setIdade(18);
        a1.setSalario(20000);
        a1.setEspecialidade("Predial");
        a1.mostraInfo();
        a1.executaAcao();
        System.out.println("salário bonus: " + a1.salarioBonus());
        System.out.println("--------------------------------------------------------");
        /*e1.setNome("Tiago");
        e1.setIdade(19);
        e1.setSalario(10000);
        e1.setRamo("Computação");
        e1.mostraInfo();
        e1.executaAcao();
        System.out.println("salário bonus: " + e1.salarioBonus());
        System.out.println("--------------------------------------------------------");
        /*p1.setNome("Chris");
        p1.setIdade(32);
        p1.setSalario(1000);
        p1.setMateria("POO");
        p1.mostraInfo();
        p1.corrigirProvas();
        p1.executaAcao();
        System.out.println("salário bonus: " + p1.salarioBonus());
        System.out.println("--------------------------------------------------------");
        */
    }
}
