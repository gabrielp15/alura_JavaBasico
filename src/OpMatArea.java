import java.util.Scanner;

public class OpMatArea {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        double numero1, numero2;
        double pi = 3.1415;

        System.out.println("Digite o valor do lado do quadrado: ");
            numero1 = entrada1.nextDouble();
            numero1 = numero1 * numero1;
        System.out.println("O valor da área para o quadrado informado é " + numero1 + " metros quadrados.");
        System.out.println("Digite o valor do raio do Círculo: ");
        numero2 = entrada2.nextDouble();
        numero2 = (numero2*numero2)*pi;
        System.out.println("O valor da área para o círculo informado é: " + numero2 + " metros quadrados.");
        System.out.println("Programa finalizado com sucesso.");
        }
    }