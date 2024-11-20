import java.util.Scanner;

public class OperacoesCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorDesconto, valorDescontoDolar, valorFinalReais, precoFinal, precoFinalDolar, valorFinalDolar;

        System.out.println("Digite o valor original do produto: ");
        double precoProdutoInicial = scanner.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        double quantidade = scanner.nextDouble();

        System.out.println("Digite a porcentagem do desconto a ser oferecido: ");
        double percentualDesconto = scanner.nextDouble();

        System.out.println("Informe o valor do Dólar hoje:");
        double valorDolar = scanner.nextDouble();


        precoFinal = precoProdutoInicial * quantidade;
        precoFinalDolar = precoFinal * valorDolar;

        percentualDesconto /= 100;

        valorDesconto = precoFinal*percentualDesconto;                       //valor desconto em Reais
        valorDescontoDolar = precoFinalDolar*percentualDesconto;             //valor desconto em Dólar

        valorFinalDolar = precoFinalDolar-valorDescontoDolar;
        valorFinalReais = precoFinal-valorDesconto;


        String valorMensagem = """
                Memória de Cálculo:
                
                Preço dos Produtos em reais: %s
                Preço dos Produtos em Doláres: %2s
                
                Percentual de desconto (em porcento): %3s
                
                Valor do desconto (Em Reais): %4s
                Valor do desconto (Em Dólar): %5s
                

                Valor final do produto em Reais: %6s
                Valor final do produto em Dólar (Preço do produto - desconto): %7s

                """.formatted(precoFinal, precoFinalDolar,percentualDesconto,valorDesconto,valorDescontoDolar,valorFinalReais, valorFinalDolar);

        System.out.println(valorMensagem);
    }
}
