🚀 Task Manager API (Spring Boot Backend)
📌 Project Overview

Task Manager is a RESTful backend application built using Spring Boot.
It provides complete CRUD operations for managing tasks with validation, exception handling, and database integration.

This project demonstrates clean layered architecture and real-world backend development practices.

🛠 Tech Stack

Java 17+

Spring Boot

Spring Data JPA

Hibernate

MySQL

Spring Validation

Spring Security (Basic setup)

Maven

Postman (API Testing)

🏗 Architecture

This project follows a layered architecture:

Controller → Service → Repository → Database

Controller handles HTTP requests

Service contains business logic

Repository interacts with database

Entity maps to database table

📂 Features Implemented

✅ Create Task
✅ Get All Tasks
✅ Get Task by ID
✅ Update Task
✅ Delete Task
✅ Input Validation (NotBlank, Size, Future, NotNull)
✅ Global Exception Handling
✅ Database Integration (MySQL)
✅ Basic Security (401 Unauthorized protection)

📦 Task Entity Structure

id (Auto Generated)

title

description

dueDate (Must be future date)

status

🔐 Validation Rules

Title cannot be empty

Description cannot be empty

Due date must be in future

Status cannot be empty

🔄 API Endpoints
Method	Endpoint	Description
GET	/tasks	Get all tasks
GET	/tasks/{id}	Get task by ID
POST	/tasks	Create new task
PUT	/tasks/{id}	Update task
DELETE	/tasks/{id}	Delete task
🧪 Testing

All endpoints were tested using Postman.

200 OK → Success

201 Created → Resource Created

204 No Content → Delete Successful

400 Bad Request → Validation Failed

404 Not Found → Task does not exist

401 Unauthorized → Security enabled

💡 What This Project Demonstrates

REST API design

Layered architecture

Exception handling

Validation

Database connectivity

Secure API design

Version control with Git

Professional GitHub repository management

🚀 Future Improvements

JWT Authentication

Role-based Authorization

Pagination & Sorting

Docker Deployment

Frontend Integration (React)
