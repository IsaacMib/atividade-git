import java.util.Scanner;

public class Ex09ValidadorSenhaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha;

        while (true) {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals("Java2026")) {
                System.out.println("Acesso Garantido");
                break;
            } else {
                System.out.println("Senha Incorreta");
            }
        }

        scanner.close();
    }
}
