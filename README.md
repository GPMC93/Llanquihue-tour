# LlanquihueTourApp

Proyecto Java para gestionar tours de la agencia Llanquihue Tour a partir de un archivo externo `.txt`.

## Descripción
Este proyecto lee datos desde un archivo `tours.txt`, crea objetos de tipo `Tour`, los almacena en una colección `ArrayList` y luego permite recorrerlos y filtrarlos.

## Estructura de carpetas
- `src/main/java/model`
    - `Tour.java`
- `src/main/java/data`
    - `GestorDatos.java`
- `src/main/java/ui`
    - `Main.java`
- `src/main/resources`
    - `tours.txt`

## Funcionalidades
- Lectura de archivo externo `.txt`
- Separación de datos con `split(";")`
- Creación de objetos `Tour`
- Almacenamiento en `ArrayList`
- Recorrido de la colección
- Filtrado por condición

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `ui.Main`.
3. Revisar la salida en consola.