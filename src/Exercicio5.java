import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5. Escrever um programa que leia o nome de um vendedor, o seu
        //salário fixo e o total de vendas efetuadas por ele no mês (em
        //dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
        //suas vendas efetuadas, informar o seu nome, o salário fixo e salário
        //no final do mês

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = sc.next();

        System.out.print("Digite o salário do " + nomeVendedor + ": " + "R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Total de vendas feito por " + nomeVendedor + ": " + "R$ ");
        double totalDeVendas = sc.nextDouble();

        System.out.println("Valor da comissao: R$ " + calcularComissao(totalDeVendas));

        double salarioFinal = salarioFixo + calcularComissao(totalDeVendas);
        System.out.println("O salario final de "  +  nomeVendedor + " e: R$ "  + salarioFinal);

    }

    public static double calcularComissao(double totalDeVendas) {

        return totalDeVendas * 0.15;
    }
}
