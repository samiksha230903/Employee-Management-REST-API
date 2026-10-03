# Employee Management REST API

A simple **Employee Management REST API** developed using **Java and Spring Boot**. This project demonstrates how to build RESTful APIs for managing employees and their qualifications using Spring Boot, Spring Data JPA, and MySQL.

## 🚀 Features

* Create a new employee
* Retrieve all employees
* Update employee details
* Delete an employee
* Create employee qualification
* Delete employee qualification
* RESTful API development
* Database integration using MySQL
* JPA-based data access
* Exception/response handling
* Lombok for reducing boilerplate code

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **Lombok**
* **Eclipse / Spring Tool Suite (STS)**

## 📌 API Endpoints

### Employee APIs

| HTTP Method | Endpoint | Description           |
| ----------- | -------- | --------------------- |
| GET         | `/`      | Get all employees     |
| POST        | `/`      | Create a new employee |
| PUT         | `/{id}`  | Update employee by ID |
| DELETE      | `/{id}`  | Delete employee by ID |
| GET         | `/yo`    | Test endpoint         |

### Qualification APIs

| HTTP Method | Endpoint       | Description                |
| ----------- | -------------- | -------------------------- |
| POST        | `/qualif`      | Create a qualification     |
| DELETE      | `/qualif/{id}` | Delete qualification by ID |

## 📥 Example Request

### Create Employee

**POST**

```text
http://localhost:8080/
```

Example request body:

```json
{
    "name": "Rahul",
    "email": "rahul@gmail.com"
}
```

> The request body should be adjusted according to the fields available in the `Employee` entity.

## ⚙️ Database Configuration

The application uses **MySQL** for database connectivity.

Database credentials are configured using environment variables:

```properties
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD:}
```

Before running the application, configure:

```text
DB_USERNAME=root
DB_PASSWORD=your_password
```

If your MySQL root user does not have a password, `DB_PASSWORD` can remain empty.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/samiksha230903/Employee-Management-REST-API.git
```

### 2. Open the project

Open the project in:

* Eclipse
* Spring Tool Suite (STS)
* IntelliJ IDEA

### 3. Configure MySQL

Create the required MySQL database and configure the database connection.

### 4. Set environment variables

Configure:

```text
DB_USERNAME
DB_PASSWORD
```

### 5. Run the application

Run the Spring Boot application from the main application class.

The application will start on:

```text
http://localhost:8080
```

## 📁 Project Structure

```text
src
└── main
    ├── java
    │   └── com.example.demo1
    │       ├── controller
    │       ├── service
    │       ├── entity
    │       ├── dto
    │       └── repository
    │
    └── resources
        └── application.properties

pom.xml
.gitignore
README.md
```

## 🎯 Learning Objectives

This project was developed to practice:

* Spring Boot fundamentals
* REST API development
* HTTP methods such as GET, POST, PUT and DELETE
* Controller and Service layers
* Spring Data JPA
* MySQL database integration
* Request body and path variables
* Entity and DTO usage
* Basic CRUD operations

## 👩‍💻 Author

**Samiksha Vairagade**

Java Developer | Java Full Stack Developer

GitHub:
https://github.com/samiksha230903
