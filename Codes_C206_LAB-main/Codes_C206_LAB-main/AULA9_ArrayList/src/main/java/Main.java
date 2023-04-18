import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) {

        //TRABALHANDO COM UMA LISTA HETEROGENEA
        /*
        ArrayList lista = new ArrayList(); //lista heterogenea, nao precisa de mesmos tipos de objetos


        Conta c = new Conta("Maria", 150);
        lista.add(10);
        lista.add("Joao");
        lista.add(150.0);
        lista.add(c);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); //array lista opcao um
        }

         */

        //TRABALHANDO COM UMA LISTA HOMOGENEA

        /*
        ArrayList<Integer> inteiros = new ArrayList<>(); //arraylist de inteiros

        inteiros.add(10);
        inteiros.add(100);
        inteiros.add(50);
        inteiros.add(7);
        inteiros.add(2);

        System.out.println("Antes da ordenacao: ");
        System.out.println(inteiros);

        Collections.sort(inteiros);//ordenar os numeros em forma crescente
        Collections.reverse(inteiros);//inverter, de forma decrescente

        System.out.println("Depois da ordenacao: ");
        System.out.println(inteiros);


         */

        ArrayList<Conta> contas = new ArrayList<>();

                Conta c1 = new Conta("joana", 1500.0);
                Conta c2 = new Conta("pedro", 500.0);
                Conta c3= new Conta("joao", 15.0);
                Conta c4 = new Conta("ana", 100.0);

                contas.add(c1);
                contas.add(c2);
                contas.add(c3);
                contas.add(c4);

        Collections.sort(contas);
        Collections.reverse(contas);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome: "+contas.get(i).nome);
            System.out.println("Saldo: "+contas.get(i).saldo);
        }

        contas.forEach(conta -> );

        //indexOf mostra a posicao que esta no array




        }
    }

