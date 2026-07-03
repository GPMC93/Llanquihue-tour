# LlanquihueTourApp

Proyecto Java desarrollado para la agencia de turismo Llanquihue Tour.

## Descripción de la semana 7

En esta actividad se trabajó con una jerarquía de clases previamente creada para aplicar polimorfismo y colecciones genéricas. Se implementó el método `mostrarInformacion()` en la superclase `ServicioTuristico` y se sobrescribió en las subclases para mostrar información específica de cada tipo de servicio.

Además, se utilizó una colección polimórfica del tipo `List<ServicioTuristico>`, que permite almacenar distintos tipos de servicios turísticos en una misma lista y recorrerlos de forma dinámica.

## Paquetes utilizados

* `model`
* `data`
* `ui`

## Clases implementadas

### `model`

* `ServicioTuristico`: superclase con atributos comunes y método `mostrarInformacion()`.
* `RutaGastronomica`: subclase con atributo `numeroDeParadas`.
* `PaseoLacustre`: subclase con atributo `tipoEmbarcacion`.
* `ExcursionCultural`: subclase con atributo `lugarHistorico`.

### `data`

* `GestorServicios`: clase encargada de crear una colección `List<ServicioTuristico>` con instancias de distintas subclases.

### `ui`

* `Main`: clase principal que ejecuta el programa y recorre la colección mostrando la información de cada servicio turístico.

## Conceptos aplicados

* Herencia con `extends`
* Sobrescritura de métodos con `@Override`
* Polimorfismo
* Colecciones genéricas con `List<ServicioTuristico>`
* Recorrido con `for-each`

## Instrucciones para ejecutar el sistema

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el JDK esté configurado correctamente.
3. Ejecutar la clase `ui.Main`.
4. Revisar la salida en consola.

## Estructura del proyecto

* `src/main/java/model/ServicioTuristico.java`
* `src/main/java/model/RutaGastronomica.java`
* `src/main/java/model/PaseoLacustre.java`
* `src/main/java/model/ExcursionCultural.java`
* `src/main/java/data/GestorServicios.java`
* `src/main/java/ui/Main.java`
