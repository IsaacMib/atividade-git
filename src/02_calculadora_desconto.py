def main():
    preco = float(input("Digite o preço do produto: R$ "))
    desconto_percentual = float(input("Digite o percentual de desconto (%): "))

    valor_desconto = preco * (desconto_percentual / 100)
    novo_valor = preco - valor_desconto

    print(f"Valor original: R$ {preco:.2f}")
    print(f"Desconto: {desconto_percentual:.1f}%")
    print(f"Novo valor: R$ {novo_valor:.2f}")


if __name__ == "__main__":
    main()
