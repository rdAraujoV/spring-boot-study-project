# Auth System

A basic authentication system built with **Java Spring Boot** and **PostgreSQL**, developed as part of my backend study repository.

The system covers user **Registration** and **Login**, using the following fields: Display Name, Email, and Password.

## Tech Stack

- Java / Spring Boot
- Spring Security
- PostgreSQL
- JWT (JSON Web Tokens)
- Maven

## How it works

- Authentication is handled via **JSON Web Tokens (JWT)**.
- Passwords are hashed before being persisted (never stored in plain text).
- The API follows REST good practices: **DTOs are used for all data traveling in and out of the API — the entity is never exposed directly.**

## Endpoints

| Method | Endpoint         | Description                  |
|--------|------------------|-------------------------------|
| POST   | `/auth/register` | Creates a new user account    |
| POST   | `/auth/login`    | Authenticates and returns a JWT |

> Adjust the table above to match your actual controller mappings.

## Running locally

1. Create a PostgreSQL database for the project.
2. Set your database credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Test the endpoints with Postman or curl.

## ⚠️ Security note

This is a **study project**, not a production-ready system. Notably:

- The JWT secret key is **hardcoded** in this repository for simplicity.
- In a real deployment, it must come from an **environment variable** (or a secrets manager), never committed to version control.

## To-do

This section tracks possible vulnerabilities and further improvements identified while studying this case.

- [ ] Request rate limiting
- [ ] Refresh token flow
- [ ] Email verification on registration