import java.util.Scanner;

public class Ex03AnalisadorNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Quantidade de caracteres: " + nomeCompleto.length());
        System.out.println("Nome em maiúsculas: " + nomeCompleto.toUpperCase());

        scanner.close();
    }
}
