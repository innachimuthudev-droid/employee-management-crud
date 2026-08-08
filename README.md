# Employee Management CRUD

A simple Employee Management REST API built with Spring Boot. I created
this project to practice building a backend application with a clear
separation between the controller, service, repository, and model
layers.

# What this project does

The application provides basic CRUD operations for employees:

- View all employees
- Add a new employee
- Search for an employee by ID
- Update employee details
- Delete an employee by ID

The employee data model currently contains:

- `id`
- `name`
- `role`
- `status`
- `experience`
- `salary`

## Tech Stack

- Java
- Spring Boot
- Spring Web / REST API
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com/project/employeemanagement/
    │       ├── controller/
    │       │   └── EmployeeController.java
    │       ├── model/
    │       │   └── Employee.java
    │       ├── repository/
    │       │   └── EmployeeRepository.java
    │       └── service/
    │           └── EmployeeService.java
    └── resources/
        └── application.properties
```

The project follows a simple layered structure:

**Controller → Service → Repository → Database**

- **Controller:** Handles HTTP requests and exposes the REST
  endpoints.
- **Service:** Contains the application logic and communicates with
  the repository.
- **Repository:** Uses Spring Data JPA to work with employee data.
- **Model:** Represents an employee as a JPA entity.

## API Endpoints

Method   Endpoint                  Purpose

---

GET      `/employee`               Returns a simple welcome message
GET      `/employee/view`          Returns all employees
POST     `/employee/add`           Adds a new employee
GET      `/employee/search/{id}`   Searches for an employee by ID
PUT      `/employee/update`        Updates an employee
DELETE   `/employee/delete/{id}`   Deletes an employee

## Example Employee JSON

```json
{
  "id": 1,
  "name": "John",
  "role": "Software Developer",
  "status": "Active",
  "experience": 2,
  "salary": 50000
}
```

## How the application works

A request first reaches `EmployeeController`. The controller passes the
operation to `EmployeeService`, which handles the application-level
logic. The service then uses `EmployeeRepository` to access the employee
data.

The repository extends `JpaRepository<Employee, Integer>`, so the
project can use Spring Data JPA's built-in CRUD operations instead of
writing SQL for every basic operation.

## Running the project

### 1. Clone the repository

```bash
git clone https://github.com/innachimuthudev-droid/employee-management-crud.git
cd employee-management-crud
```

### 2. Run the application

Using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

You can also run the project from your IDE as a Spring Boot application.

## Database

The project uses H2 as the database for employee data. The database
configuration is kept in `src/main/resources/application.properties`.

For a local development project, H2 is useful because it keeps the setup
simple and avoids requiring a separate database server.

## What I practiced in this project

This project helped me practice:

- Creating REST APIs with Spring Boot
- HTTP methods such as GET, POST, PUT, and DELETE
- Layered application architecture
- Dependency injection
- Spring Data JPA
- Entity mapping
- Repository-based CRUD operations
- Basic exception handling
- Working with JSON request bodies
- Using Maven to manage the project

## Current scope

This is a learning-focused CRUD project. The main goal was to understand
how the different layers of a Spring Boot backend work together.

Future improvements could include validation, better exception
responses, DTOs, global exception handling, pagination, and a frontend.

## Author

**Innacimuthu Dev**

GitHub: https\://github.com/innachimuthudev-droid