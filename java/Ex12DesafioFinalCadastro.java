import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    double[] notas = new double[3];

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void exibirResultado() {
        double media = calcularMedia();
        System.out.printf("Aluno: %s%n", nome);
        System.out.printf("Média final: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

public class Ex12DesafioFinalCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Idade do aluno: ");
        aluno.idade = scanner.nextInt();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            aluno.notas[i] = scanner.nextDouble();
        }

        System.out.println();
        aluno.exibirResultado();

        scanner.close();
    }
}
