import java.util.ArrayList;
import java.util.Scanner;

public class Ex11BuscaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("arroz");
        produtos.add("feijao");
        produtos.add("macarrao");
        produtos.add("leite");
        produtos.add("cafe");

        System.out.print("Digite o nome de um produto: ");
        String busca = scanner.nextLine().toLowerCase();

        if (produtos.contains(busca)) {
            System.out.println("Produto encontrado na lista.");
        } else {
            System.out.println("Produto não encontrado na lista.");
        }

        scanner.close();
    }
}
