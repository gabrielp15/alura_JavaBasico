import java.util.Scanner;

public class OpMatFatorial {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);

        long numero1,resultado;

        System.out.println("Digite o valor desejado para o cálculo do fatorial: ");
        numero1 = entrada1.nextLong();
        resultado = 1;

        while (numero1 > 0) {
            resultado *= numero1;
            numero1--;
        }
        System.out.println("O valor do fatorial para o número digitado é " + resultado);
    }
}
