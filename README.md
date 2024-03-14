# Calculadora RMI

## Descripción

Este proyecto implementa una calculadora sencilla utilizando el protocolo de invocación de métodos remotos (RMI) de Java. RMI permite que un objeto invocado en un espacio de memoria virtual de una máquina JVM pueda ser invocado desde otra JVM potencialmente en una máquina diferente. Esto se logra mediante la creación de un objeto remoto en el servidor que implementa una interfaz remota, la cual es conocida tanto por el servidor como por el cliente.

La calculadora soporta las siguientes operaciones:

- Suma de tres valores
- Resta de dos valores
- Multiplicación de tres valores
- División de dos valores
- Raíz cuadrada de un número

## Contenido

El repositorio contiene los siguientes archivos principales:

- `Interfaz.java`: Define la interfaz remota con los métodos que puede invocar el cliente.
- `Servidor.java`: Implementa la interfaz remota y registra el objeto remoto en el registro RMI.
- `Cliente.java`: Busca el objeto remoto en el registro RMI y realiza llamadas a los métodos.

## Ejecución

Para ejecutar la calculadora RMI, sigue estos pasos:

1. Compilar los archivos de código fuente:

   ```shell
   javac Interfaz.java
   javac Servidor.java
   javac Cliente.java

Estos comandos compilan la interfaz remota, el servidor y el cliente respectivamente.

2. Iniciar el servidor RMI:

   ```shell 
   java Servidor

Este comando inicia el servidor RMI, registrando el objeto remoto para que pueda ser invocado por los clientes.

3. Iniciar el cliente RMI:

   ```shell
   java Cliente

Al ejecutar el cliente, este buscará el objeto remoto en el registro RMI y realizará llamadas a los métodos definidos en la interfaz remota.