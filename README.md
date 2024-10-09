# Practica7 - Documentación del Código

Este proyecto implementa un sistema de manejo de empleados y animales en Java. Se utilizan conceptos de programación orientada a objetos, como herencia, encapsulación y polimorfismo, para modelar empleados y varios tipos de animales.

## Índice

1. [Descripción General](#descripción-general)
2. [Clases](#clases)
   - [Empleado](#empleado)
   - [Gerente](#gerente)
   - [Animal](#animal)
   - [Perro](#perro)
   - [PastorAleman](#pastoralemán)
   - [Dalmata](#dálmata)
   - [Ave](#ave)
   - [Paloma](#paloma)
   - [Perico](#perico)

## Descripción General

El propósito de este proyecto es demostrar la implementación de clases con jerarquía y herencia en Java. Se modelan empleados y animales con propiedades y métodos específicos, mostrando cómo se pueden extender y especializar clases para representar diferentes tipos de entidades.

## Clases

### Empleado

La clase `Empleado` representa a un empleado con un nombre, número de empleado y sueldo.

#### Atributos

- `String nombre`: Nombre del empleado.
- `int numEmpleado`: Número único que identifica al empleado.
- `float sueldo`: Sueldo del empleado.

#### Métodos

- `Empleado(String nombre, int numEmpleado, float sueldo)`: Constructor que inicializa los atributos.
- `String getNombre()`: Devuelve el nombre del empleado.
- `void setNombre(String nombre)`: Establece el nombre del empleado.
- `int getNumEmpleado()`: Devuelve el número del empleado.
- `void setNumEmpleado(int numEmpleado)`: Establece el número del empleado.
- `float getSueldo()`: Devuelve el sueldo del empleado.
- `void setSueldo(float sueldo)`: Establece el sueldo del empleado.
- `void aumentarSueldo(int porcentajeDeAumento)`: Aumenta el sueldo en un porcentaje dado.
- `String toString()`: Devuelve una representación en cadena del empleado.

### Gerente

La clase `Gerente` hereda de `Empleado` y agrega un atributo adicional llamado `presupuesto`.

#### Atributos

- `float presupuesto`: Presupuesto asignado al gerente.

#### Métodos

- `Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo)`: Constructor que inicializa los atributos heredados y el presupuesto.
- `float getPresupuesto()`: Devuelve el presupuesto del gerente.
- `void setPresupuesto(float presupuesto)`: Establece el presupuesto del gerente.
- `String toString()`: Devuelve una representación en cadena del gerente.

### Animal

Clase base para representar un animal, con un nombre como atributo.

#### Atributos

- `String nombre`: Nombre del animal.

#### Métodos

- `Animal(String nombre)`: Constructor que inicializa el nombre del animal.
- `String getNombre()`: Devuelve el nombre del animal.
- `void setNombre(String nombre)`: Establece el nombre del animal.
- `String toString()`: Devuelve una representación en cadena del animal.

### Perro

La clase `Perro` hereda de `Animal` e incluye atributos específicos para perros.

#### Atributos

- `String sexo`: Sexo del perro.
- `int edad`: Edad del perro.
- `String color`: Color del pelaje.
- `boolean vacunado`: Indica si el perro está vacunado.
- `double peso`: Peso del perro en kilogramos.

#### Métodos

- `Perro(String nombre, String sexo, int edad, String color, boolean vacunado, double peso)`: Constructor que inicializa los atributos.
- `void ladrar()`: Imprime un mensaje indicando que el perro ladra.
- `void mostrarInformacion()`: Muestra la información detallada del perro.
- `String toString()`: Devuelve una representación en cadena del perro.

### PastorAleman

La clase `PastorAleman` extiende a `Perro` y agrega atributos adicionales.

#### Atributos

- `boolean adiestrado`: Indica si el perro está adiestrado.
- `String especialidad`: Especialidad del perro.

#### Métodos

- `PastorAleman(String nombre, int edad, String color, boolean vacunado, double peso, boolean adiestrado, String especialidad)`: Constructor que inicializa los atributos.
- `void pastorear()`: Imprime un mensaje indicando que el perro está pastoreando.
- `String toString()`: Devuelve una representación en cadena del perro pastor.

### Dalmata

La clase `Dalmata` hereda de `Perro` y añade información sobre las manchas del perro.

#### Atributos

- `boolean manchasNegras`: Indica si el dálmata tiene manchas negras.

#### Métodos

- `Dalmata(String nombre, int edad, boolean manchasNegras)`: Constructor que inicializa los atributos.
- `void correrCarreras()`: Imprime un mensaje indicando que el dálmata corre carreras.
- `String toString()`: Devuelve una representación en cadena del dálmata.

### Ave

La clase `Ave` hereda de `Animal` e incluye atributos específicos para aves.

#### Atributos

- `String sexo`: Sexo del ave.
- `String colorPlumaje`: Color del plumaje del ave.
- `double envergadura`: Envergadura del ave en centímetros.
- `boolean migratoria`: Indica si el ave es migratoria.
- `int cantidadHuevosPorNidad`: Cantidad de huevos que el ave pone por nidada.

#### Métodos

- `Ave(String nombre, String sexo, String colorPlumaje, double envergadura, boolean migratoria, int cantidadHuevosPorNidad)`: Constructor que inicializa los atributos.
- `void volar()`: Imprime un mensaje indicando que el ave está volando.
- `void mostrarInformacion()`: Muestra la información detallada del ave.
- `String toString()`: Devuelve una representación en cadena del ave.

### Paloma

La clase `Paloma` extiende a `Ave` y añade características específicas para palomas.

#### Atributos

- `boolean migratoriaLargaDistancia`: Indica si la paloma es migratoria de larga distancia.
- `boolean domesticada`: Indica si la paloma está domesticada.

#### Métodos

- `Paloma(String nombre, String colorPlumaje, double envergadura, boolean migratoriaLargaDistancia, boolean domesticada)`: Constructor que inicializa los atributos.
- `void volarEnBandada()`: Imprime un mensaje indicando que la paloma vuela en bandada.
- `String toString()`: Devuelve una representación en cadena de la paloma.

### Perico

La clase `Perico` hereda de `Ave` y añade atributos y comportamientos para pericos.

#### Atributos

- `boolean habla`: Indica si el perico puede hablar.
- `String fraseFavorita`: Frase favorita del perico.

#### Métodos

- `Perico(String nombre, String colorPlumaje, double envergadura, boolean migratoria, int cantidadHuevosPorNidad, boolean habla, String fraseFavorita)`: Constructor que inicializa los atributos.
- `void decirFrase()`: Imprime la frase favorita del perico.
- `String toString()`: Devuelve una representación en cadena del perico.
