# Spring Boot Study Projects

A collection of small, focused backend projects built with **Java Spring Boot** and **PostgreSQL**, developed during my computer science degree to study and consolidate backend development practices.

Each project lives in its own folder, is self-contained, and has its own README with setup instructions and technical notes.

## Projects

| Project                                             | Description                                               | Stack                                         |
| --------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------- |
| [`auth-system`]() | User registration and login with JWT-based authentication | Spring Boot, Spring Security, PostgreSQL, JWT |


## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot (Spring Web, Spring Security, Spring Data JPA)
- **Database:** PostgreSQL
- **Build tool:** Maven
- **Testing/API tools:** Postman

## Structure

```
spring-boot-playground/
├── auth-system/
│   ├── src/
│   └── README.md
├── crud-system/
│   ├── src/
│   └── README.md
└── README.md   <- you are here
```

Each subfolder is an independent Spring Boot application — clone the repository, `cd` into the project you want to run, and follow its README.

## About

This repository is part of my ongoing study of backend development, focused on writing clean, RESTful, and well-documented Java applications. New modules are added as I explore new concepts (pagination, file uploads, testing, caching, etc.).