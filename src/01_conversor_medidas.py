def main():
    metros = float(input("Digite uma distância em metros: "))
    centimetros = metros * 100
    milimetros = metros * 1000

    print(f"{metros} m = {centimetros} cm")
    print(f"{metros} m = {milimetros} mm")


if __name__ == "__main__":
    main()
