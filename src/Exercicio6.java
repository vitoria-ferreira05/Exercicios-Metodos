import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //6. Ler uma temperatura em graus Celsius e apresentá-la convertida em
        //graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
        //a temperatura em Fahrenheit e C a temperatura em Celsius.

        Scanner sc = new Scanner(System.in);

        System.out.println("---COVERSAO DE TEMPERATURA---");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = conversaoTemperatura(celsius);

        System.out.println("O grau Cesius conertido para graus Fahrenheit e: " + fahrenheit);
    }

    public static double conversaoTemperatura(double celsius){
        return (9 * celsius + 160) / 5;
    }
}
