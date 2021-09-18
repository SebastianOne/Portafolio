# JUAN SEBASTIAN RUEDA RODRIGUEZ - MATEMATICAS APLICADAS DIA

'''
la variable ac  contiene la configuración inicial , la variable solo se va a usar para mostrar cual es la configuración inicial
y se va a utilizar para el segundo for del metodo llenarMatrizIteraciones

la variable numeroIteraciones se utiliza para mostrar el número de iteraciones a realizar, y se
utiliza en el primer for del método llenarMatrizIteraciones


la variable MatrizIteraciones es la que va a contener la matriz final , al realizar las iteraciones. esta matriz tiene una primera fila la cual es el configuración inicial, la cual al final del metodo llenarMatrizIteraciones
se eliminara para que solo quede las iteraciones que se realizaron al aplicar la regla de transición

'''

ac = ['0','0','0','0','1','1','1','0','0','0','0']
numeroIteraciones = 4
matrizIteraciones = [['0','0','0','0','1','1','1','0','0','0','0']]


'''
el metodo llenarMatrizIteraciones en donde se llenara la variable matrizIteraciones 
en el metodo se inicializa una matriz vacía la cual se la la que tendra como valores la fila de la matrizIteraciones.
la variable respuesta y respuesta2 es donde se realiza  la regla de transición para generar cada celda de la matriz
el primer for va del numeroIteraciones  + 1 , lo cual generara las cuatro iteraciones, va hasta 5 porque en la posicion 0 no se ingresa ninguna fila a 
la variable matrizIteraciones es hasta la posición 1 que se ingresa la fila generada en la posicion 0.
dentro de ese for va un if el cual nos indica ingresara en ese if solo si la variable matriz no esta vacía, si no esta vacía entonces agregara a la matrizIteraciones la fila resultante al utilizar la regla de transición
y la variable matriz la inicializara vacía esto para que solo la variable matriz solo contenga los 11 elementos de la fila resultante al aplicar ala regla de tranción.

el segundo for va del hasta el tamaño de la variable ac la cual tiene tamaño 11, este for es el que generara las filas de la matrizIteraciones
en este for se hace un if en el caso de que j == 10 lo que quiere decir que si llega al ultimo valor de la fila  la variable respuesta tendra la regla de transición planteada de otra forma, porque cuando se llega al final de la fila 
para poder plantear la regla de tranción en este caso se debe plantear de otra forma,
y el else se usa para generar cada elemento de la fila hasta antes de que llegue al ultimo elemento de la fila.
luego de realizar la regla se mete el valor de respuesta en la variable matriz la cual contendra la fila que se va a insertar en la variable matrizIteraciones

por ultimo el primer elemento de la matrizIteraciones se elimina para que queden las 4 iteraciones.
'''


def llenarMatrizIteraciones():
    matriz = []
    respuesta = 0
    respuesta2 = 0
    for i in range(numeroIteraciones+1):
        if matriz:
            matrizIteraciones.append(matriz)
            respuesta = 0
            respuesta2 = 0
            matriz = []
        for j in range(len(ac)):
            if (j == 10):
                respuesta = int(matrizIteraciones[i][j - 1]) + int(matrizIteraciones[i][j]) + int(matrizIteraciones[i][0])
                respuesta2 = respuesta % 2
                matriz.append(str(respuesta2))
            else:
                respuesta = int(matrizIteraciones[i][j - 1]) + int(matrizIteraciones[i][j]) + int(matrizIteraciones[i][j+1])
                respuesta2 = respuesta % 2
                matriz.append(str(respuesta2))

    matrizIteraciones.pop(0)


llenarMatrizIteraciones()
print("\nla configuracion inicial es:  \n" + "AC =" + str(ac))
print("\nel numero de iteraciones a realizar son: " + str(numeroIteraciones))
print("\nal realizar la regla de evolución dada por el enunciado \nse obtiene la siguienete matriz:")
for i in matrizIteraciones:
    print(i)


''' 
BIBLIOGRAFIA:

eliminar un elemento de una matriz : https://www.it-swarm.dev/es/python/como-eliminar-elementos-especificos-de-una-matriz-usando-python/940316520/
comprobar si una matriz o lista estan vacias : https://j2logo.com/comprobar-python-lista-cadena-diccionario-vacio/
operadores aritmeticos : https://entrenamiento-python-basico.readthedocs.io/es/latest/leccion3/operadores_aritmeticos.html


'''