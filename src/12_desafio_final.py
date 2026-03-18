def main():
    alunos = []

    for i in range(1, 4):
        print(f"\nCadastro do {i}º aluno")
        nome = input("Nome: ")
        idade = int(input("Idade: "))

        notas = []
        for j in range(1, 4):
            nota = float(input(f"Nota {j}: "))
            notas.append(nota)

        aluno = {
            "nome": nome,
            "idade": idade,
            "notas": notas,
        }
        alunos.append(aluno)

    print("\nResultado final:")
    for aluno in alunos:
        media = sum(aluno["notas"]) / len(aluno["notas"])
        print(f"{aluno['nome']} - Média: {media:.2f}")


if __name__ == "__main__":
    main()
