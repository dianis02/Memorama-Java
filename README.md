#Memorama-Java
Ramírez García Diana Isabel
Java

Para probar el programa basta ir a la carpeta de ejecutables y ejecutar
la clase MenuMain.java, los demás archivos en la carpeta son los ejecutables 

En la carpeta jugador se encuentra la clase Jugador, JugadorControl, Juego
La clase jugador es la encargada de crear los objetos de este tipo, mientras
que JugadorControl es la responsable de la serialización. La clase Juego
es la responsable del juego de memorama.

En la carpeta Proxy encontramos las clases responsables del tablero.
Tenemos la clase TableroReal la cual se encarga principalmente de llenarlo
como se necesite y de imprimir su representación.
Se crean 2 tableros uno con "?" que son las cartas volteadas y otro con los
valores. Luego tenemos la clase TableroProxy la cual se encarga de manejar
estos 2 tableros como si fuesen uno.

En la carpeta Observer se tienen las clases Observer1 y Observer2 que son 
los encargados de ir actualizando las estadísticas del jugador cada vez que se 
concluya una partida.

Finalmente se tiene la carpeta Facade con una clase del mismo nombre,
utilizamos esta para crear métodos que son sobre la comunicación entre las
clases anteriormente mencionadas y de tal forma sea más sencillo de leer
en el MenuMain. 
