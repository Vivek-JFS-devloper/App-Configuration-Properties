# Spring Boot Application Configuration Properties

This project demonstrates how to use `application.yml` and custom `@ConfigurationProperties` classes in a Spring Boot application to externalize configuration.

## 🔧 Tech Stack

- Java 8+
- Spring Boot
- Spring Web
- YAML Configuration
- Maven

## 📁 Project Structure

- `application.yml`: Contains application-specific configuration like greeting and welcome messages.
- `AppProperties.java`: Loads configuration from the `application.yml` file using `@ConfigurationProperties`.
- `AppConstants.java`: Holds the constants used in the controller for keys.
- `MyController.java`: Exposes REST endpoints to get greeting and welcome messages.

## 🚀 How to Run

```bash
mvn clean install
mvn spring-boot:run
Access endpoints:

http://localhost:8080/greet

http://localhost:8080/welcome

📬 API Response Example

"Greeting Message": "Good Morning"
"Welcome Message": "Welcome to My Site"

🧑‍💻 Author
Ramesh Paswan
Java Full Stack Developer
LinkedIn Profile (https://linkedin.com/in/ramesh-paswan-223742227)
