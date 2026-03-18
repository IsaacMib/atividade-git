def calcular_estatisticas(numeros):
    maior = max(numeros)
    menor = min(numeros)
    soma_total = sum(numeros)
    return maior, menor, soma_total


numeros = []

for i in range(1, 6):
    numero = float(input(f"Digite o {i}º número: "))
    numeros.append(numero)

maior, menor, soma_total = calcular_estatisticas(numeros)

print(f"Maior valor: {maior}")
print(f"Menor valor: {menor}")
print(f"Soma total: {soma_total}")
