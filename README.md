# 📚 Book Management REST API

A simple CRUD (Create, Read, Update, Delete) REST API built with **Spring Boot** and **PostgreSQL** to manage a collection of books.
> 📺 This project was prepared by following this tutorial: [YouTube - Spring Boot CRUD REST API](https://www.youtube.com/watch?v=v1IFQWzuSrw)


This project serves as a learning and practice project for working with:
- Spring Boot fundamentals
- Spring Data JPA
- PostgreSQL integration
- RESTful API design

---

## 🚀 Features

- Add a new book
- Get a list of all books
- Get details of a single book by ID
- Update book information
- Delete a book

---

## 🛠 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Postman** (for testing API endpoints)

---



## 🏗️ Architecture

This application follows a basic 3-layer architecture:

1. **Controller Layer**  
   Handles incoming HTTP requests and maps them to the appropriate service methods.  
   ➤ _Exposes the RESTful endpoints._

2. **Service Layer**  
   Contains the business logic of the application.  
   ➤ _Processes requests, validates data, and orchestrates actions between layers._

3. **Repository Layer**  
   Responsible for interacting with the database using Spring Data JPA.  
   ➤ _Performs CRUD operations directly on the database._

   
## 📬 API Endpoints

| Method | Endpoint           | Description          |
|--------|--------------------|----------------------|
| GET    | `/books`           | Get all books        |
| GET    | `/books/{id}`      | Get book by ID       |
| POST   | `/books`           | Add a new book       |
| PUT    | `/books/{id}`      | Update book by ID    |
| DELETE | `/books/{id}`      | Delete book by ID    |

---