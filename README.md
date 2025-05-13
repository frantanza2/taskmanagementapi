# Task Management API

Esta es una API RESTful para la gestión de tareas. Permite realizar operaciones CRUD sobre tareas, autenticar usuarios con JWT, documentar con Swagger y usar una base de datos en memoria (H2). Incluye pruebas unitarias con JUnit y Mockito.

## Tecnologías

- Java 17
- Spring Boot 3.4.x
- Spring Security con JWT
- H2 Database (en memoria)
- Swagger / OpenAPI
- JUnit 5, Mockito
- Postman Collection

## Funcionalidades

- Login de usuario y generación de token JWT (`/api/auth/login`)
- Listar, crear, actualizar y eliminar tareas (`/api/tasks`)
- Control de acceso a rutas mediante token JWT
- Datos precargados en H2 (usuarios y estados de tarea)
- Documentación Swagger (`/swagger-ui.html`)

## Autenticación

1. Realiza un `POST` a `/api/auth/login` con el siguiente body:

```json
{
  "username": "admin",
  "password": "admin123"
}
```

2. Recibirás un token JWT como respuesta. Úsalo en los siguientes requests como header:

```
Authorization: Bearer <token>
```

## Base de Datos H2

URL: `http://localhost:8080/h2-console`  
JDBC URL: `jdbc:h2:mem:testdb`  
Usuario: `sa`  
Password: *(vacío)*

## Documentación Swagger

Disponible en: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Collection Postman

Se incluye el archivo `TaskManagementCRUD.postman_collection.json` con variables y scripts para autenticación automática.

## Ejecutar el proyecto

```bash
mvn clean spring-boot:run
```
## Documentación API First

- Archivo: `src/main/resources/openapi.yml`
- Plugin OpenAPI incluido en `pom.xml`

## Colección Postman

Incluida en el archivo `taskmanagementapi_postman_collection.json`

## Autora

**Francisca Martínez**  
Cargo postulado: Desarrolladora de Software Java  
Correo: francisca.c.martinez.miranda@gmail.com