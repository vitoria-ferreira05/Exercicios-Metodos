import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //8. Faça um programa que receba o preço de custo de um produto e
        //mostre o valor de venda. Sabe-se que o preço de custo receberá um
        //acréscimo de acordo com um percentual informado pelo usuário.

        Scanner sc = new Scanner(System.in);

        System.out.println("---PREÇO DE CUSTO---");

        System.out.print("Digite o preço de custo do produto: R$ ");
        double precoDeCusto = sc.nextDouble();

        System.out.print("Digite o preço de venda do produto: R$ ");
        double precoDeVenda = sc.nextDouble();

        System.out.print("Digite percentual desejado para acrescimo: ");
        double percentual = sc.nextDouble();

        double acrescimo = valorComAcrescimo(precoDeCusto, percentual);

        System.out.println("O preço de custo do produto com o acrescimo do percentual e: R$ " + acrescimo);
        double valorTotal = precoDeCusto + acrescimo;
        System.out.println("Valor total: " + valorTotal);
    }

    public static double valorComAcrescimo(double precoDecusto, double percentual){
        return precoDecusto * (percentual / 100);
    }
}
