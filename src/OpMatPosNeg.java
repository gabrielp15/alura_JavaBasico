import java.util.Scanner;

public class OpMatPosNeg {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        System.out.println("Digite um número para verificar se ele é positivo ou negativo: ");
        numero = entrada.nextDouble();

        if (numero < 0) {
            System.out.println("O número digitado é Negativo!");
        } else if (numero > 0) {
            System.out.println("O número digitado é Positivo!");
        } else if (numero == 0) {
            System.out.println("O número digitado é zero");
        } else {
            System.out.println("Digite um número válido");
        }

    }
}
