def main():
    produtos = {
        "arroz": 25.90,
        "feijao": 9.50,
        "macarrao": 6.20,
        "leite": 5.40,
        "cafe": 18.00,
    }

    busca = input("Digite o nome do produto: ").strip().lower()

    if busca in produtos:
        print(f"Preço de {busca}: R$ {produtos[busca]:.2f}")
    else:
        print("Não encontrado")


if __name__ == "__main__":
    main()
