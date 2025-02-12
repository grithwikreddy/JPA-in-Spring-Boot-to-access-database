# CRUD Application with Spring Boot and JPA

## Overview
This project is a Spring Boot-based RESTful API that performs CRUD (Create, Read, Update, Delete) operations using JPA for database access. The application allows managing person records in a relational database, ensuring efficient data persistence and retrieval.

## Features
- **RESTful API** for managing person records.
- **Spring Boot & JPA** for efficient database access.
- **Relational Database Support** using JPA.
- **CRUD operations**: Insert, Read, Update, Delete person records.

## Tech Stack
- **Backend**: Spring Boot
- **Database**: JPA (connected to a relational database like MySQL)
- **Tools**: Spring Data JPA, REST API

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- Java 17+
- A relational database (MySQL, PostgreSQL, etc.)
- Maven
- Postman

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/grithwikreddy/JPA-in-Spring-Boot-to-access-database.git
   cd JPA-in-Spring-Boot-to-access-database
   ```

2. **Configure Database**
   Update the `application.properties` file with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run the Application**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
| Method | Endpoint            | Description                     |
|--------|--------------------|---------------------------------|
| POST   | /insert            | Insert a new person record     |
| GET    | /readAll           | Fetch all person records       |
| PUT    | /update/{id}       | Update a person record         |
| DELETE | /delete/{id}       | Delete a person record         |

## Database Integration
- JPA maps the rows in the database to objects of the entity class, making it easier to interact with relational data.
- Person records are stored and retrieved using JPA.
- The application connects to a relational database (MySQL).
- Supports automatic schema updates via Hibernate.



