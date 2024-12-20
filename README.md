# Proyecto de Gestión de Libros literAlura 

Este proyecto es una aplicación de gestión de libros desarrollada en Java utilizando Spring Boot y Hibernate. Permite buscar libros por título, listar libros registrados, listar autores, listar autores vivos en un determinado año, y listar libros por idioma, a través de una API REST.

## Características

- **Spring Boot** para la configuración y gestión eficiente del proyecto.
- **Hibernate** para el mapeo objeto-relacional (ORM).
- **REST API** para la interacción con libros y autores.
- Integración con la API de Gutendex para buscar libros por título.

## Requisitos Previos

- Java 17 o superior
- Maven 3.6.0 o superior
- PostgreSQL (o cualquier otra base de datos relacional compatible)

## Configuración del Proyecto

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/redcaler/literAlura.git
   cd literAlura
2. **Configurar la base de datos:**
   Asegúrate de tener PostgreSQL instalado y crea una base de datos para el proyecto:
   CREATE DATABASE gestion_libros_db;
   Actualiza application.properties con las credenciales de tu base de datos:
    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/gestion_libros_db
    spring.datasource.username=tu-usuario
    spring.datasource.password=tu-contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```
3. **Construir el proyecto:**
    Se recomienda usar para su prueba IntelliJ IDEA

    o en su defecto usar
    ```
    mvn clean install
    ```
4. **Ejecución de la aplicación**
    ```
    mvn spring-boot:run
    ```

5. **Configuración de Dependencias (pom.xml)**
  ```
  <dependencies>
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
  
      <dependency>
          <groupId>org.postgresql</groupId>
          <artifactId>postgresql</artifactId>
          <scope>runtime</scope>
      </dependency>
  
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-test</artifactId>
          <scope>test</scope>
      </dependency>
  
      <dependency>
          <groupId>com.fasterxml.jackson.core</groupId>
          <artifactId>jackson-databind</artifactId>
          <version>2.16.0</version>
      </dependency>
  </dependencies>
  
  ```

## Uso de la Aplicación
La aplicación presenta un menú interactivo en la consola con las siguientes opciones:

    1. Buscar libro por título
    2. Listar libros registrados
    3. Listar autores registrados
    4. Listar autores vivos en un determinado año
    5. Listar libros por idioma
    0. Salir

