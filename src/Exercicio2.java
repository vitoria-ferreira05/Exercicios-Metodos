import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Faça um algoritmo que contenha uma função que receba o nome de um
        //usuário e retorne a mensagem Meu nome é <NomeDigitado>.

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Meu nome e: " + nomeUsuario(nome));

    }

    public static String nomeUsuario(String nome) {

        return nome;
    }
}

