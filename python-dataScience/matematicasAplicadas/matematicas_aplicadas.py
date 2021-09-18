# JUAN SEBASTIAN RUEDA RODRIGUEZ - MATEMATICAS APLICADAS DIA
import math
from random import randint, uniform, random

"""inicialización de variables """

diccionario = {'#': 0, 'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6, 'g': 7, 'h': 8, 'i': 9, 'j': 10, 'k': 11,
               'l': 12, 'm': 13, 'n': 14, 'ñ': 15, 'o': 16, 'p': 17, 'q': 18, 'r': 19, 's': 20,
               't': 21, 'u': 22, 'v': 23, 'w': 24, 'x': 25, 'y': 26, 'z': 27, '1': 28, '2': 29, '3': 30, '4': 31}



texto2 = ""
texto5 = ""
texto4 = " "
respuesta = ""
respuesta2 = ""
clave2 = ""
aux = ""
aux1 = ""
resfinaal = ""
respuestaFinal = ""
numero8 = ""
numero9 = ""
texto7 = ""
matriz3 = ""
aux4 = 0
x = True
y = True
lista = []

""" en esta parte del codigo se encuentran los metodos a utilizar  mas adelante """

def conversion(numero):
    binario = ''
    texto3 = ""
    while numero // 2 != 0:
        binario = str(numero % 2) + binario
        numero = numero // 2
        texto3 = str(numero) + binario
    return texto3

def relleno(texto):
    numero2 = 0
    lista = list(texto)
    while numero2 == 0:
        if (len(lista) < 5):
            lista.insert(0, '0')
        if (len(lista) == 5):
            texto5 = "".join(lista)
            numero2 = 1
    return texto5

def relleno2(texto):
    numero2 = 0
    lista = list(texto)
    while numero2 == 0:
        if (len(lista) < 8):
            lista.insert(0, '0')
        if (len(lista) == 8):
            texto5 = "".join(lista)
            numero2 = 1
    return texto5

def relleno3(texto,texto7):
    numero2 = 0
    lista = list(texto)
    while numero2 == 0:
        if (len(lista) < len(texto7)):
            lista.insert(0, '0')
        if (len(lista) == len(texto7)):
            texto5 = "".join(lista)
            numero2 = 1
    return texto5


def llenarMatriz1(y,binarioR):
    posiciones = ""
    respuesta8 = []
    reglasFinal = reglas(binarioR)
    for i in range(len(listaRespuesta2)):

        if (i == len(listaRespuesta2) - 1):
            valorIteracion = matriz3[y][(i - 1)] + matriz3[y][i] + matriz3[y][0]
        else:
            valorIteracion = matriz3[y][(i - 1)] + matriz3[y][i] + matriz3[y][i + 1]
        for x in reglasFinal:

            if (valorIteracion == x):
                posiciones += reglasFinal.get(x)
    respuesta8 = list(posiciones)
    return respuesta8


def llenarMatriz2(ma,binarioR):
    for i in range(iteraciones):
        ma.append(llenarMatriz1(i,binarioR))
    return ma

def reglas(binarioReglass):
    relleno2(binarioReglass)
    lista4 = list(binarioReglass)

    posicion0 = lista4.__getitem__(0)
    posicion1 = lista4.__getitem__(1)
    posicion2 = lista4.__getitem__(2)
    posicion3 = lista4.__getitem__(3)
    posicion4 = lista4.__getitem__(4)
    posicion5 = lista4.__getitem__(5)
    posicion6 = lista4.__getitem__(6)
    posicion7 = lista4.__getitem__(7)


    reglass = {'111': posicion0, '110': posicion1, '101': posicion2, '100': posicion3, '011': posicion4,
               '010': posicion5, '001': posicion6, '000': posicion7}

    return reglass

def devolverC(x):
    res = ""
    for i in diccionario:
        if (x == diccionario[i]):
            res = i
    return res

def operacionXOR(respuestaBinaria, columna):
    xor = {'00': 0, '01': 1, '10': 1, '11': 0}
    listaR = list(respuestaBinaria)
    listaC = list(columna)
    union = ""
    respuestaXor = ""
    for i in range(len(columna)):
        union = listaR.__getitem__(i) + listaC.__getitem__(i)
        for x in xor:
            if (union == x):
                respuestaXor += str(xor.get(x))


    return respuestaXor

def conversion2(numero):
    aux2 = 0
    valor = 0
    for i in range(len(numero) - 1, -1, -1):
        valor += (2 ** aux2) * int(numero[i])
        aux2 += 1
    return valor

while x == True:
    print("\n")
    print("Por favor ingrese de cinco a diez caracteres.\n"
          "Los caracteres validos son : \n"
          "#,a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,t,u,v,w,x,y,z,1,2,3,4 ")
    texto = input()
    texto1 = texto.lower()
    contador = 0

    for i in texto1:
        for x in diccionario:
            if (i == x):
                contador += 1


    if (len(texto1) < 5):
        print("Ingreso menos de cinco carácteres")
        print("\n")
        x = True

    if (len(texto1) > 10):
        print("Ingreso mas de diez carácteres ")
        print("\n")
        x = True

    if (contador != len(texto1)):
        print("Alguno de los carácteres ingresados no son validos")
        print("\n")
        x = True

    if ((len(texto1) >= 5 and len(texto1) <= 10) and contador == len(texto1)):
        x = False

while y == True:
    print("por favor ingrese de cinco a diez carácteres que  desea para la clave \n"
          "los caracteres validos son : \n"
          "#,a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,t,u,v,w,x,y,z,1,2,3,4 ")
    clave = input()
    clave1 = clave.lower()
    contador2 = 0

    for i in clave1:
        for x in diccionario:
            if (i == x):
                contador2 += 1


    if(len(clave1) < len(texto1)):
        print("la clave no puede tener menos caracteres que la palabra a cifrar")
        print("\n")
        y = True


    if (len(clave1) < 5):
        print("Ingreso menos de cinco c arácteres")
        print("\n")
        y = True

    if (len(clave1) > 10):
        print("Ingreso mas de diez carácteres ")
        print("\n")
        y = True

    if (contador2 != len(clave1)):
        print("Alguno de los carácteres ingresados no son validos")
        print("\n")
        y = True


    if ((len(clave1) >= 5 and len(clave1) <= 10) and contador2 == len(clave1) and len(clave1)>= len(texto1)):
        y = False





for i in texto1:
    for x in diccionario:
        if (i == x):
            numero = diccionario.get(x)
            texto2 = str(conversion(numero))
            respuesta += relleno(texto2)


for i in clave1:
    for x in diccionario:
        if (i == x):
            numero9 = diccionario.get(x)
            texto7 = str(conversion(numero9))
            respuesta2 += relleno(texto2)


""" en esta parte del codigo se encuentra las impresiones y los datos a mostrar por consola"""
print("\n")
print("La conversión del texto ingresado a binario es : \n" + respuesta)
print("\n\n")

print("La conversion de la clave ingresado a binario es : \n" + respuesta2)
print("\n\n")


numeroAleatorio = randint(1, (len(clave1) * 5))
print("Numero aletario del cual se va a tomar la columna  de la matriz creada es: \n" + str(numeroAleatorio))
print("\n\n")

regla = randint(15, 255)
print("La regla a utilizar es : \n" + str(regla))
print("\n\n")

binarioR = conversion(regla)
binarioR = relleno2(binarioR)
print("La regla a utilizar en binario es : \n" + str(binarioR))
print("\n\n")

iteraciones = (len(texto1) * 5) + 2
print("El número a iteraciones a utilizar son : \n" + str(iteraciones))
print("\n\n")

listaRespuesta2 = list(respuesta2)
matriz3 = [listaRespuesta2]
llenarMatriz2(matriz3,binarioR)
print("La matriz resultante al aplicar la regla es :")
for i in matriz3:
    print(i)

print("\n\n")

print("\n\n")


for i in range(len(respuesta)):
    numero8 = numeroAleatorio - 1
    respuestaFinal += matriz3[i + 1][numero8]
print("La columna seleccionada de la matriz resultante es:")
print(numeroAleatorio)
print(numero8)
print(respuestaFinal)
print("\n\n")


print("El cifrado de la palabra en binario es:")
aux = operacionXOR(respuesta, respuestaFinal)
print(aux)
print("\n\n")

for i in range(0, len(aux) - 1, 5):
    aux1 = aux[int(i):int(i) + 5]
    aux4 = conversion2(aux1)
    resfinaal = resfinaal + (devolverC(aux4))

print("La palabra final cifrada, es: ")
print(resfinaal)








