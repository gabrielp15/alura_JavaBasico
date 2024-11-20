import java.util.Scanner;

public class OpMatComp {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        Double numero1, numero2;

        System.out.println("Digite o primeiro número para a comparação: ");
            numero1 = entrada1.nextDouble();
        System.out.println("Digite o segundo número para a comparação: ");
            numero2 = entrada2.nextDouble();

        if (numero1 > numero2) {
            System.out.println("Os valores digitado são diferentes, e o primeiro valor digitado é maior que o segundo!");
        } else if (numero1 < numero2) {
            System.out.println("Os valores digitado são diferentes, e o segundo valor digitado é maior que o primeiro!");
        } else if (numero1.equals(numero2)) {
            System.out.println("Os valores digitados são iguais!");
        }
    }
}
