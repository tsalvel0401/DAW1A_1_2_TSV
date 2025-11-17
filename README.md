# `2️⃣` DAW1A_1_2_TSV. Herramientas para generar programa

### Información:

### Fecha: 17/11/2025
### Nombre: Tonny
### Curso y Grupo: 1º DAW
### Relación UD 1, Práctica 2

## `📄` Descripción

Para dos de los siguientes lenguajes de programación:   
   
a. Grupo 1: Elige uno de los nombrados en el ejercicio 1.1 (Excepto Java ,Kotlin, .Net)    
b. Grupo 2: Elige uno entre Java ,Kotlin, .Net.  

Escribe un programa básico, que pregunte el nombre del usuario y muestre un mensaje "Hola `usuario`. Este programa esta hecho en el lenguaje de programación: `lenguaje`".  

#### Lenguajes seleccionados:
+ a. Python
+ b. Java

## `📌` Responde a las siguientes preguntas:   

1. ¿Qué herramientas has utilizado durante todo el proceso de creación y hasta la ejecución del programa (Sistema Operativo, Editor, compilador/intérprete, enlazador, para ejecutarlo)?   
    a. Para el lenguaje del (a) grupo 1 y (b) grupo 2.   

    - Python: *Windows 10 Pro Version 22H2 (19045.6466)*, Notepadd++, Ejecución (Shell - py), Intérprete (**CPython**)
    - Java: *Windows 10 Pro Version 22H2 (19045.6466)*, Notepadd++, Ejecución (Shell - JVM), Compilador (**javac**)
2. Diferencia entre el código fuente, código objeto y el ejecutable que has generado. Describe el proceso y el nombre que han tomado los distintos archivos, si existen en ese lenguaje.   
    a. Para el lenguaje del (a) grupo 1 y (b) grupo 2.   

    - Python: Las diferencias en el código fuente con respecto al otro lenguaje sería la sintaxis, Python no ha generado código objeto ni ejecutable, en este caso hemos utilizado el intérprete. Fichero `hello_world.py`
    - Java: Diferencias en la sintaxis con respecto al lenguaje `a`, en este caso existe código objeto que sería nuestro **bytecode**, que se genero en la carpeta `output/HolaUsuario.class`. En este caso primero con nuestro fichero java, hemos utilizado el compilador `javac`, para que se genere nuestro código objeto. Por último,  hemos ejecutado ese código objeto en la JVM (*Máquina Virtual de Java*)
4. En lo que respecta al dispositivo en el que se ejecuta el programa, ¿Qué componentes del dispositivo se han visto involucrados y cómo, en el proceso de ejecución del ejecutable?    

    - CPU, Memoria, Sistema Operativo, Dispositivos de Entrada/Salida (E/S).
5. Finaliza con una **conclusion** sobre las diferencias que has encontrado entre los lenguajes del grupo 1 y grupo 2. (Pista: Virtual Machine)   

    - Diferencias, en este caso Python al ser interpretado (mediante CPython), no necesita compilación. Por su parte Java si necesita ser compilado y posteriormente ejecutado por la JVM. La sintaxis es diferente en cada lenguaje, la manera en la importación de librerias también.

#### Código Fuente:

+ Almacenados en la carpeta `src/`

#### Capturas de pantalla:

+ Almacenadas en la carpeta `screenshots/`

#### Incluir en la entrega   

Ademas de las respuestas a las preguntas anteriores, introduce en la entrega:   

* El codigo fuente del lenguaje del grupo 1 y grupo 2.   
* Captura de pantalla de la ejecucion del grupo 1 y grupo 2.  
* Documento respondiendo a las preguntas descritas más arriba. 

### Condiciones de entrega

El trabajo tiene las siguientes condiciones de entrega:

* Es un trabajo individual.
* Se realiza en un documento de google drive.
* El trabajo tiene que estar correctamente identificado:
    * Fecha
    * Tu nombre
    * Identificación del curso y grupo.
    * Identificación del módulo, unidad y ejercicio.
* Si no tiene nombre asignado, el trabajo tendrá por nombre `DAW1A_id_iniciales` donde:
    * `id`: es el identificador de la actividad, por ejemplo 1_1
    * `iniciales`: son tus iniciales por ejemplo `EFO` las mías.