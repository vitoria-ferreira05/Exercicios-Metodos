import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        ////Faça um algoritmo que contenha uma função que calcule o IMC de um
        //    //usuário a partir da inserção do seu peso e de sua altura. Exiba a
        //    //classificação do usuário após a verificação do seu IMC.

        Scanner sc = new Scanner(System.in);


        System.out.println("---- CALCULO DE IMC ----");

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = calculoDoImc(peso, altura);

        System.out.println("---- CLASSIFICAÇÃO E GRAU DE OBESIDADE ---");

        if (imc < 18.5){
            System.out.println("MAGREZA - GRAU 0");
        } else if (imc >= 18.5 && imc <= 24.9)  {
            System.out.println("NORMAL - GRAU 0");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("SOBREPESO - GRAU I");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("OBESIDADE - GRAU II");
        }else {
            System.out.println("OBESIDADE GRAVE - GRAU III");
        }

    }

    public static double calculoDoImc(double peso, double altura) {
        return peso / (altura * altura);
    }
}



