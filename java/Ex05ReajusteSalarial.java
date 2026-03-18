import java.util.Scanner;

public class Ex05ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salarioAntigo = scanner.nextDouble();

        double salarioNovo = salarioAntigo * 1.15;

        System.out.printf("Salário antigo: R$ %.2f%n", salarioAntigo);
        System.out.printf("Salário com reajuste de 15%%: R$ %.2f%n", salarioNovo);

        scanner.close();
    }
}
