import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class OpMatTabuada {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        int contador = 0;
        int contador2 = 1;
        int num2;
        List tabuada;

        tabuada = new ArrayList();

        System.out.println("Tabuada. Informe o número da tabuada desejada:");
        int num1 = numero1.nextInt();
        while (contador <= 10) {
            num2 = num1*contador;
            tabuada.add(num2);
            contador++;
        }
        while (contador2 <= 10){
            System.out.println( num1 + " * " + contador2 + " = " + tabuada.get(contador2));
            contador2++;
        }
    }
}