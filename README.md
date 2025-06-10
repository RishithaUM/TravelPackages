# TravelPackages
A Tour Packages system displays various travel packages with details like destinations, duration, price, and itinerary. It allows users to browse, filter, and select tours based on their preferences.
# Travel Packages Management System

A Spring Boot-based web application for managing and browsing travel packages. This project provides REST APIs for user and package management and is built using Java, Spring Boot, and Maven.

## 📂 Project Structure

TravelPackages-main/
├── LICENSE
├── README.md
├── .vscode/
├── tourpackages/
│ ├── src/
│ ├── pom.xml
│ ├── mvnw / mvnw.cmd
│ ├── User.http
│ └── request.http

## 🚀 Features

- Add and manage travel packages
- User management
- REST API endpoints for CRUD operations
- Easy integration and testing using HTTP request files

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Spring Data JPA**
- **H2/MySQL** (based on configuration)
- **Lombok**

## ▶️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- IDE (IntelliJ, VS Code, Eclipse)

### Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/TravelPackages.git
   cd TravelPackages/tourpackages
2.Build and run the app:
./mvnw spring-boot:run

3.Access the application:
http://localhost:8087/           (8080 or any that is specified)
 
#API Usage
Sample API requests are available in:
User.http
request.http
Use these files with REST clients like Postman or the VS Code REST Client extension.

Author - Rishitha UM
This project is licensed under the terms of the MIT License.
