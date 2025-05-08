# TaskManagement API

API RESTful construida con Spring Boot 3.4.x y Java 17 para la gestión de tareas. Incluye autenticación JWT, documentación OpenAPI y base de datos H2.

## 🚀 Tecnologías

- Java 17
- Spring Boot 3.4.x
- Spring Security
- JWT (JSON Web Token)
- H2 Database
- Swagger / OpenAPI
- Maven

## ⚙️ Ejecución del proyecto

### 1. Requisitos

- JDK 17
- Maven 3.x

### 2. Clonar y ejecutar

```bash
mvn spring-boot:run
```

### 3. Acceso

- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - JDBC URL: `jdbc:h2:mem:taskdb`
  - Usuario: `sa`

## 🔐 Login de prueba

```json
POST /api/auth/login
{
  "username": "admin",
  "password": "admin123"
}
```

## 📋 Endpoints protegidos

- `GET /api/tareas`
- `POST /api/tareas`

Usar el token JWT retornado al hacer login.

## 📁 Documentación API First

- Archivo: `src/main/resources/openapi.yml`
- Plugin OpenAPI incluido en `pom.xml`

## 🧪 Colección Postman

Incluida en el archivo `taskmanagementapi_postman_collection.json`

## 🙋 Autora

**Francisca Martínez**  
Cargo postulado: Desarrolladora de Software Java  
Correo: francisca.c.martinez.miranda@gmail.com
