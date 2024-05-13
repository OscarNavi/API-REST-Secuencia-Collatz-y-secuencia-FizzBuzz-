# Proyecto de API REST para Secuencias

Este proyecto es una API REST desarrollada con Spring Boot que proporciona dos endpoints para calcular y devolver secuencias numéricas. Los dos tipos de secuencias son:

1. **Secuencia de Collatz:** Esta secuencia se calcula siguiendo las reglas del problema matemático conocido como Conjetura de Collatz. La secuencia comienza con un número entero positivo y, en cada paso, se aplica una regla específica para obtener el siguiente número en la secuencia.

2. **Secuencia FizzBuzz:** Esta secuencia es una secuencia de números en la que los múltiplos de 3 se reemplazan por "Fizz", los múltiplos de 5 se reemplazan por "Buzz" y los múltiplos de ambos se reemplazan por "FizzBuzz".

Los números de entrada deben ser enteros positivos.


## Instalación y uso

Para ejecutar la API en tu entorno local, sigue estos pasos:

1. Clona el repositorio desde GitHub: [https://github.com/OscarNavi/API-REST-Secuencia-Collatz-y-secuencia-FizzBuzz-].
2. Importa el proyecto en tu IDE preferido.
3. Ejecuta la aplicación como una aplicación Spring Boot.
4. Accede a la API utilizando los endpoints.

La API tiene dos endpoints para acceder a las secuencias:

1. `/collatz/{number}`: Calcula y devuelve la secuencia de Collatz para el número de entrada especificado.
2. `/fizzbuzz/{number}`: Calcula y devuelve la secuencia FizzBuzz para el número de entrada especificado.

La API estará disponible en `http://localhost:8081`.


## Ejemplo de Uso

Para calcular la secuencia de Collatz para el número 10, realiza una solicitud GET a la siguiente URL:
`http://localhost:8081/collatz/10`

Para generar la secuencia FizzBuzz para el número 15, realiza una solicitud GET a la siguiente URL:
`http://localhost:8081/fizzbuzz/15`

## Contacto

Si tienes alguna pregunta o sugerencia sobre este proyecto, no dudes en ponerte en contacto:

- Correo electrónico: [oskrnavy@gmail.com]