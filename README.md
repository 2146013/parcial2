# Parcial segudno corte 
## Arep 15 de Octubre del 2021
Diseñe un prototipo de calculadora de microservicios que tenga un servicios de matemáticas con al menos dos funciones implementadas y desplegadas en al menos dos instancias virtuales de EC2. Además debe implementar un service proxy que recibe las solicitudes de servicios y se las delega a las dos instancias usando un algoritmo de round-robin. Asegúrese que se pueden configurar las direcciones y puertos de las instancias en el porxy usando variables de entorno del sistema operativo. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".

## Instrucciones de uso

Java versión: 1.8.0
Ejecución
En el sigiente lik de Github [https://github.com/2146013/parcial2.git]

podras encontara la aplicacion web donde posteriormente se implemento la contruccion de un container para docker dede se
configuro en nuestra maquina local, este contenedor creado sera igualmente desplegado en la maquina virtual de AWS
mvn spring-boot:run,se abrira la ventana donde puede evidenciar "hello docker"

El tablero se corre en http://ec2-18-234-65-29.compute-1.amazonaws.com:4567/sin?value=45

# Bitacora 

1. Se creo un proyecto java usando maven,crando tambien la clase principal
<img width="960" alt="maven" src="https://user-images.githubusercontent.com/60073527/137361555-b1035c16-8fee-4836-bfe6-172f30062a0d.PNG">

2. Conectamos la consola de AWS.
<img width="935" alt="aws" src="https://user-images.githubusercontent.com/60073527/137361778-36364564-19bf-4cb5-a154-846ff62635f8.PNG">

3. Se crean las intsncias correspondintes 

<img width="954" alt="instancias" src="https://user-images.githubusercontent.com/60073527/137361793-05adfb51-7776-4af4-839c-a711e1e0e795.PNG">

4. Se crea la seguridada correspondinte al puerto que se este ejecuntando 
<img width="660" alt="seguridad" src="https://user-images.githubusercontent.com/60073527/137361897-80debb99-4a50-48d7-80b3-5428ae4e261c.PNG">


5. Obtenemos las llaves y comprimimos el archivo 
<img width="727" alt="llaves xip" src="https://user-images.githubusercontent.com/60073527/137361910-e392c9c3-0bba-47e5-af68-3a089fd1835d.PNG">


6. Conectamos las instancias con ssh -i "MathServices2.pem" ec2-user@ec2-18-234-65-29.compute-1.amazonaws.com

<img width="575" alt="conexion" src="https://user-images.githubusercontent.com/60073527/137361947-fe8b861f-0c28-42b9-b5f5-23562f7d719b.PNG">

7.instalamos Java en las instancias con el comando sudo yum install java-1.8.0-openjdk-devel
<img width="431" alt="instalacion java" src="https://user-images.githubusercontent.com/60073527/137361964-4bb7820c-7bfc-4ed1-99bc-63072888f4cc.PNG">


8. Lo descomprimimos 

<img width="354" alt="descomprimir" src="https://user-images.githubusercontent.com/60073527/137361986-ca7f5a32-5a07-4382-a85f-409e674b2932.PNG">

9. Probamos el funcionamiento 
<img width="542" alt="parcialimagen1" src="https://user-images.githubusercontent.com/60073527/137362032-69144ed7-2c45-4f03-acc7-5f5ccb43e519.PNG">
<img width="514" alt="iamgen2" src="https://user-images.githubusercontent.com/60073527/137362060-13247f4d-caf0-4e81-9c36-151aa7c25268.PNG">

## Tecnologias

Maven
Java
Springboot
micro-framework de Spark java
docker
dockerhub
máquina virtual de en AWS

## Autor
Laura Daniela Pachon Cuan - Fecha: 14/10/2021

## Licencia
This project is licensed under the MIT License - see the LICENSE file for details


