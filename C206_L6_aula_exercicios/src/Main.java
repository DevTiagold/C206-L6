
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Bem vindo ao alamoxerifado!");
        System.out.println("RESITOR|CAPACITOR|TRANSISTOR");
        System.out.println("Faca sua requisicao:");

        // SISTEMA DE ALMOXERIFADO
        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente){
            case "RESISTOR":
                System.out.println("Requisitou um resistor");
                break;
            case "CAPACITOR":
                System.out.println("Requisitou um capacitor");
                break;
            case "transistor":
                System.out.println("Requisitou um transistor");
                break;

            default:
                System.out.println("Invalido");
                break;
        }
    }
}
