import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Faça um programa que receba uma quantidade X de números e
        //imprimir o menor número (suponha números diferentes) entre eles
        //Obs: use vetores para a resolução do exercício

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int vezes = sc.nextInt();

        int[] numeros = new int[vezes];

        for (int i = 0; i < vezes; i++) {
            System.out.println("Digite o número: ");
            numeros[i] = sc.nextInt();
        }

        int menor = valorMenor(numeros);

        System.out.println("O menor numero e: " + menor);

    }

    public static int valorMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }
}
