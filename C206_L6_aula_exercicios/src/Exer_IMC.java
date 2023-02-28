import java.util.Scanner;
public class Exer_IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("Entre com seu nome:");
        String nome = entrada.nextLine();//entando com nome
        System.out.println(nome + ",Entre com o peso:");
        float peso = entrada.nextFloat();//entrando com peso
        System.out.println(nome +",Entre com altura");
        float altura = entrada.nextFloat();//enrando com altura

        float imc;
        imc = (float) (peso/Math.pow(altura,2));//calculadno o imc

        //Mostrando os resultados respeitando as condições

        System.out.println("Resultado: ");
        if(imc < 18.5){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está abaixo do peso");
        }
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está com peso normal");
        }
        if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está com sobre peso");
        }
        if(imc >= 30 && imc <= 34.9){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está com Obesidade Grau I");
        }
        if(imc >= 35 && imc <= 39.9){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está com Obesidade Grau II");
        }
        if(imc >= 40){
            System.out.println("Seu IMC: " + imc);
            System.out.println(nome + ", você está com Obesidade Grau III ou mórbida");
        }
    }
}
