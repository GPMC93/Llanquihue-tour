# LlanquihueTourApp

Proyecto Java desarrollado para la agencia de turismo Llanquihue Tour, orientado a la gestión de tours mediante lectura de archivos externos, uso de colecciones dinámicas y organización modular en paquetes.

## Descripción del sistema

El sistema permite leer información de tours desde un archivo `tours.txt`, crear objetos en memoria y almacenarlos en una colección `ArrayList`.

Además, permite:

* mostrar todos los tours cargados
* filtrar tours por precio
* filtrar tours por tipo
* buscar tours por nombre
* representar la ubicación de cada tour mediante composición entre clases

## Paquetes utilizados

* `app`
* `model`
* `service`

## Clases implementadas

### `app`

* `Main`: clase principal que ejecuta el programa, carga los datos y muestra resultados por consola.

### `model`

* `Tour`: representa un tour de la agencia, con nombre, tipo, precio y ubicación. Incluye validaciones básicas.
* `Ubicacion`: representa la comuna y región donde se realiza un tour.

### `service`

* `GestorTours`: clase encargada de leer el archivo `tours.txt`, crear los objetos `Tour` y almacenarlos en una colección `ArrayList`. También permite realizar búsquedas simples por nombre.

## Archivo de datos

* `src/main/resources/tours.txt`: archivo externo que contiene los datos de los tours separados por punto y coma.

## Funcionalidades implementadas

* Lectura de archivo externo `.txt`
* Uso de `ArrayList`
* Conversión de texto a objetos
* Recorrido de colección
* Filtro por precio
* Filtro por tipo
* Búsqueda simple por nombre
* Composición entre `Tour` y `Ubicacion`
* Validaciones básicas en clases del modelo

## Instrucciones para ejecutar el programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el JDK del proyecto esté configurado.
3. Ejecutar la clase `app.Main`.
4. Revisar la salida en consola, donde se muestran:

  * lista completa de tours
  * tours con precio mayor a 60000
  * tours de tipo gastronómico
  * búsqueda por nombre

## Estructura general del proyecto

* `src/main/java/app/Main.java`
* `src/main/java/model/Tour.java`
* `src/main/java/model/Ubicacion.java`
* `src/main/java/service/GestorTours.java`
* `src/main/resources/tours.txt`
