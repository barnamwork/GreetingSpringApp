# Greeting App - Spring Boot

## 📌 Description

This project is a RESTful Greeting Application built using Spring Boot.
It demonstrates CRUD operations using Controller, Service, and Repository layers along with GitFlow.

---

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* GitFlow

---

## 📁 Project Structure

* controller → Handles HTTP requests
* service → Business logic
* repository → Database operations
* model → Entity class

---

## ✅ Use Cases Implemented

### UC1

GreetingController returns JSON for GET, POST, PUT, DELETE methods

### UC2

Added Service Layer to return "Hello World"

### UC3

Dynamic greeting using firstName and lastName parameters

### UC4

Save greeting message in database

### UC5

Fetch greeting message by ID

### UC6

Retrieve all greeting messages

### UC7

Update greeting message

### UC8

Delete greeting message

---

## 🧪 API Endpoints

### Create

POST /greeting?message=Hello

### Get by ID

GET /greeting/{id}

### Get All

GET /greeting/all

### Update

PUT /greeting/{id}?message=Updated

### Delete

DELETE /greeting/{id}

---

## ⚙️ How to Run

1. Clone the repository
2. Open project in IDE
3. Run:
   mvn spring-boot:run
4. Server runs on:
   http://localhost:8080

---

## 🧪 Testing

Use curl:

curl.exe -X POST "http://localhost:8080/greeting?message=Hello"
curl.exe http://localhost:8080/greeting/1
curl.exe http://localhost:8080/greeting/all
curl.exe -X PUT "http://localhost:8080/greeting/1?message=Updated"
curl.exe -X DELETE http://localhost:8080/greeting/1

---

## 🧠 Notes

* H2 database is in-memory (data resets on restart)
* Followed proper GitFlow with feature branches for each UC

---

## 👤 Author

Barnam
