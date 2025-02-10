class Alpha:
    @staticmethod
    def devolve_alph(num, alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ"):
        part_alf = list()

        if num > 26:
            print("Número maior que largura do alfabeto")
            return

        for c in range(num):
            part_alf.append(alfabeto[c])
        return part_alf


n = int(input("Digite um número: "))
objeto = Alpha()

print(objeto.devolve_alph(n))
