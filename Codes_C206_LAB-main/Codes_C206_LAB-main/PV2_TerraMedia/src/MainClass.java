import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        TerraMedia tm = new TerraMedia();
        Anao anao1 = new Anao(10, "Joao", 23, 173, "Faca", false, 1, "Anoezitos");
        Mago mago1 = new Mago(12, "Marta", 34, 23, "pulso radiante", true, "azul");
        Elfo elfo1 = new Elfo(23, "Elfinho", 10, 13, "Pistola", true, "Elfinhos em acao");


        tm.addHabitante(anao1);
        tm.addHabitante(mago1);
        tm.addHabitante(elfo1);

        tm.listarHabitantes();


    }
    }









