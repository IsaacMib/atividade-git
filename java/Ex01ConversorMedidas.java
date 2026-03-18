import java.util.Scanner;

public class Ex01ConversorMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Centímetros: " + centimetros + " cm");
        System.out.println("Milímetros: " + milimetros + " mm");

        scanner.close();
    }
}
