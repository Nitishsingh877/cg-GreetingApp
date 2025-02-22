# Greeting App README

This document provides information about the Greeting App, a Spring Boot application that manages greeting messages using an H2 in-memory database.

## Overview

The Greeting App allows users to:

* **Create:** Save new greeting messages.
* **Read:** Retrieve greeting messages by ID.
* **Update:** Edit existing greeting messages.
* **Store:** Greeting messages are stored in an H2 in-memory database.

## Technologies Used

* **Java:** Programming language.
* **Spring Boot:** Framework for building Java applications.
* **Spring Data JPA:** Simplifies database access.
* **H2 Database:** In-memory database for development and testing.
* **Maven/Gradle:** Build tools.
* **REST API:** For communication.

## Prerequisites

* Java Development Kit (JDK) 17 or higher
* Maven or Gradle
* An IDE (IntelliJ IDEA, Eclipse, etc.)

## Getting Started

1.  **Clone the repository (if applicable):**
    ```bash
    git clone <repository_url>
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd <project_directory>
    ```
3.  **Build the project using Maven or Gradle:**

    * **Maven:**
        ```bash
        mvn clean install
        ```
    * **Gradle:**
        ```bash
        gradle clean build
        ```
4.  **Run the application:**

    * **Maven:**
        ```bash
        mvn spring-boot:run
        ```
    * **Gradle:**
        ```bash
        gradle bootRun
        ```
5.  **Access the H2 Console (Optional):**

    * If enabled in `application.properties` or `application.yml`, access the H2 console at `http://localhost:8080/h2-console`.
    * Use `jdbc:h2:mem:mydb` as the JDBC URL.

## API Endpoints

* **POST /greetings:** Create a new greeting message.
    * Request body:
        ```json
        {
            "message": "Your greeting message"
        }
        ```
    * Response: The saved Greeting object.
* **GET /get/{id}:** Retrieve a greeting message by ID.
    * Response: The Greeting object or 404 Not Found.
* **PUT /greeting/{id}:** Update a greeting message.
    * Request body:
        ```json
        {
            "message": "Updated greeting message"
        }
        ```
    * Response: The updated Greeting object or 404 Not Found.

## Configuration

* **`application.properties` or `application.yml`:**
    * Database configuration (H2).
    * Port configuration.
    * Other Spring Boot settings.

## Dependencies

* `
