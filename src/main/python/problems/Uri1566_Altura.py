cidades = int(input())
for cidade in range(0, cidades):
    pessoasCidades = int(input())

    alturas = [0 for i in range(231)]
    inputAlturas = input().split()
    for pessoa in range(len(inputAlturas)):
        altura = int(inputAlturas[pessoa])
        alturas[altura] += 1

    first = True
    for indice in range(len(alturas)):
        for numero in range(alturas[indice]):
            if first:
                print(indice, end="")
                first = False
            else:
                print(" " + str(indice), end="")

    print("\n")
