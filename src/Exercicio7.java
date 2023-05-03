import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //7. Elaborar um programa que efetue a apresentação do valor da
        //conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
        //deverá solicitar o valor da cotação do dólar e também a quantidade
        //de dólares disponíveis com o usuário.

        //conversao: multiplicar o valor total em dolares pela cotacao
        //cotacao 5,05 real brasileiro

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor em dolar: US$ ");
        double dolar = sc.nextDouble();

        System.out.print("Qual o valor da cotacao em real: R$ ");
        double cotacaoEmReal = sc.nextDouble();

        System.out.print("Usuario, quantos dolares possui disponivel?: ");
        int usuarioPossui = sc.nextInt();

        double conversao = conversaoDolarReal(dolar, cotacaoEmReal);

        System.out.println("O valor em real e: R$ " + conversao);
    }

    public static double conversaoDolarReal(double dolar, double cotacaoEmReal){

        return dolar * cotacaoEmReal;
    }
}
