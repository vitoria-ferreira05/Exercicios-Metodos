import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Faça um algoritmo que contenha um método que receba um número do
        //usuário e realize a somatório de todos os números no intervalo de 1 até o
        //número digitado pelo usuário. Exiba o resultado final da somatória.

        Scanner scanner = new Scanner(System.in);

       // while (true) {
            System.out.println("Digite um número: ou 0 para sair: ");
            int numero = scanner.nextInt();
          //  if (numero == 0) {
              //  break;
          //  }

            int soma = soma(numero);

            System.out.println("A somatória de 1 até " + numero + " é: " + soma);
        }
  //  }

    public static int soma(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}




