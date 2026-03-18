import java.util.Scanner;

public class Ex02CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto (%): ");
        double percentual = scanner.nextDouble();

        double valorDesconto = preco * (percentual / 100);
        double novoValor = preco - valorDesconto;

        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Desconto: %.2f%%%n", percentual);
        System.out.printf("Novo valor: R$ %.2f%n", novoValor);

        scanner.close();
    }
}
