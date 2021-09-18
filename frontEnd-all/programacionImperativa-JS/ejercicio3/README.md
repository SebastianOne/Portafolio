enunciado:
Fecha y Hora

En este ejercicio deberás crear una Función que, al invocarla, devuelva un string con la fecha y hora hardcodeada. Para eso, seguí este paso a paso:
1. Declará una Función que se llame fechaYHora. El bloque de código que deberá
ejecutar es un mensaje por consola que muestre la fecha y hora de este momento.
Por ahora, escribilo manualmente.
2. Invocá tu Función varias veces y visualiza la consola.
Como viste en el ejercicio, al invocar la Función, el resultado siempre es el mismo. Es decir, el código ejecutado muestra el string declarado manualmente. Esta solución, no sería escalable en este caso ya que la fecha y hora se debería actualizar automáticamente. Para eso, existe un Objeto de JS llamado Date() que nos la devolverá actualizada al momento de llamarlo:

Date()

Importante: JavaScript es un lenguaje case-sensitive, osea, que las mayúsculas importan.

Para verlo en acción, modificá tu console.log para que, en vez de escribir la fecha y hora manualmente, concatene un mensaje con el resultado de llamar al objeto Date().
