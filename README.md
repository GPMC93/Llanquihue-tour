# LlanquihueTourApp

Aplicación Java desarrollada para gestionar distintas entidades de la agencia de turismo Llanquihue Tour.

## Descripción

El sistema permite registrar y visualizar guías turísticos, vehículos y colaboradores externos mediante una interfaz gráfica creada con JOptionPane.

Las distintas entidades comparten un comportamiento común mediante la interfaz Registrable y se almacenan en una colección ArrayList<Registrable>.

El programa utiliza polimorfismo e instanceof para identificar cada tipo de entidad y ejecutar comportamientos específicos.

## Estructura del proyecto

### Paquete model

- Registrable: interfaz que define el método mostrarResumen().
- RecursoAgencia: superclase abstracta con los atributos código y nombre.
- GuiaTuristico: representa a los guías y agrega una especialidad.
- Vehiculo: representa los vehículos y agrega patente y tipo.
- ColaboradorExterno: representa colaboradores y agrega un rol.

### Paquete data

- GestorEntidades: administra una colección ArrayList<Registrable>, permite agregar entidades, recorrerlas y diferenciarlas mediante instanceof.

### Paquete ui

- Main: clase principal que ejecuta la interfaz gráfica con JOptionPane.

## Conceptos aplicados

- Interfaces
- Herencia
- Encapsulamiento
- Polimorfismo
- Sobrescritura de métodos
- Colecciones genéricas
- Uso de instanceof
- Manejo de excepciones
- Interfaz gráfica con JOptionPane

## Funcionalidades

- Registrar un guía turístico.
- Registrar un vehículo.
- Registrar un colaborador externo.
- Mostrar todas las entidades registradas.
- Ejecutar acciones específicas según el tipo de entidad.

## Instrucciones de ejecución

1. Abrir el proyecto LlanquihueTourApp en IntelliJ IDEA.
2. Verificar que el JDK esté configurado.
3. Abrir la clase `ui.Main`.
4. Ejecutar el método `main`.
5. Utilizar el menú gráfico para registrar o visualizar entidades.

## Autor

Giovanni Mena