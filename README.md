# LlanquihueTourApp

Proyecto Java desarrollado para la agencia de turismo Llanquihue Tour.

## Objetivo de la semana 6

En esta actividad se implementó una jerarquía de clases con herencia simple, utilizando una superclase con atributos comunes y subclases que extienden su funcionalidad con atributos específicos.

## Clases creadas

### Paquete `model`

* `ServicioTuristico`: superclase con los atributos `nombre` y `duracionHoras`.
* `RutaGastronomica`: subclase con el atributo `numeroDeParadas`.
* `PaseoLacustre`: subclase con el atributo `tipoEmbarcacion`.
* `ExcursionCultural`: subclase con el atributo `lugarHistorico`.

### Paquete `data`

* `GestorServicios`: clase encargada de crear instancias de prueba de los servicios turísticos.

### Paquete `ui`

* `Main`: clase principal que ejecuta el programa y muestra los resultados por consola.

## Conceptos aplicados

* Herencia simple con `extends`
* Uso de `super(...)` en los constructores
* Sobrescritura de `toString()`
* Organización del proyecto por paquetes

## Instrucciones para ejecutar el programa

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el JDK del proyecto esté configurado.
3. Ejecutar la clase `ui.Main`.
4. Revisar la salida en consola, donde se muestran los servicios turísticos creados.

## Estructura del proyecto

* `src/main/java/model/ServicioTuristico.java`
* `src/main/java/model/RutaGastronomica.java`
* `src/main/java/model/PaseoLacustre.java`
* `src/main/java/model/ExcursionCultural.java`
* `src/main/java/data/GestorServicios.java`
* `src/main/java/ui/Main.java`
