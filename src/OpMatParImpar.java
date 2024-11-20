import java.util.Scanner;

public class OpMatParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");
        numero = entrada.nextDouble();

        if (numero % 2 == 0 && numero != 0) {
            System.out.println("O número digitado é Par!");
        } else if (numero % 2 == 1) {
            System.out.println("O número digitado é Ímpar!");
        } else if (numero == 0) {
            System.out.println("O número digitado é zero");
        }

    }
}
