enunciado

Una empresa inmobiliaria dedicada a la renta / alquiler de departamentos
necesita crear un pequeño sistema que le permita facilitar parte de su
operatoria diaria.
El listado de los departamentos lo obtendremos de un archivo con formato JSON
que contendrá un array de objetos literales que representarán los
departamentos.
De cada departamento podremos saber:
● Él id de departamento, será un identificador.
● La cantidad de habitaciones
● La cantidad máxima de personas
● Si está o no disponible para el alquiler,
● Si se aceptan o no las mascotas,
● El valor del alquiler
● Los comentarios que tiene el departamento

Consignas
1. Obtener el listado de los departamentos.
Tomando como base el siguiente archivo JSON, deberán:
● Descargar el archivo y colocarlo en la raíz del proyecto
● Leer los contenidos del archivo y parsearlos
● En base a lo anterior, guardar el resultado en una variable
Resultado esperado: variable conteniendo un array con todos los
departamentos. Recuerden que pueden verificar el contenido de la variable
haciendo un console.log().
2. Crear un objeto literal que represente la inmobiliaria
Este objeto contendrá, una propiedad con el listado de departamentos obtenido
en el punto anterior y las funcionalidades que nos solicitan a continuación:
A. Agregar una propiedad llamada departamentos que contenga los
departamentos.
B. Agregar un método departamentosDisponibles que permita consultar
disponibilidad, es decir, que devuelva una lista de los departamentos
disponibles.
C. Agregar un método listarDepartamentos que reciba como parámetro un
array de departamentos y los imprima por consola.
Este método deberá imprimir por cada elemento:

○El id.
○ El precio.
○ disponible (en caso de ser true mostrar “Disponible” caso contrario
“Alquilado”)
D. Agregar un método buscarPorId que permita buscar él departamento en
función de su identificador.
○ Este método debe devolver un departamento en caso de encontrar
el identificador.
E. Agregar un método buscarPorPrecio que permita filtrar los
departamentos disponibles, siempre y cuando el precio sea menor o igual
al precio enviado como argumento.
○ Este método debe usar departamentosDiponibles.
○ Este método debe devolver una lista de departamentos.
F. Agregar un método que permita ordenar por precio de menor a mayor
según él precioAlquiler y devolverlo.
G. Agregar un método precioConImpuesto que permita realizar un
incremento del precioAlquiler a todos los departamentos, tanto
disponibles como no disponibles, según un porcentaje que se envía como
argumento al momento de la invocación del método.
ejemplo : PrecioConImpuesto(10), deberá incrementar el precioAlquiler de
Todos los departamentos un 10%
Resultado esperado: un array con los precios con el impuesto sumado;

H. Agregar un método que permita alquilar un departamento.
○ Este método recibe por parámetro el id del departamento y
actualiza la propiedad del departamento en false.
Resultado esperado: que quede actualizada la propiedad departamentos
de la inmobiliaria, donde el departamento que alquilo no está disponible.
I. Agregar un método que permita calcular el ingreso en el flujo de caja
que tendría la empresa cuando se pague el alquiler de los
departamentos.
Resultado esperado: suma del alquiler de todos los departamentos que
estén alquilados.
