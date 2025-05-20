# Bookstore Management

This project demonstrates the use of **Spring Data** for working with both **SQL** and **NoSQL** databases, and applies **cache abstraction** to enhance performance. **Docker** is used to provide containerized instances of PostgreSQL and MongoDB.

## Technologies

- Language: Java
- Framework: Spring Boot, Spring Data (JPA & MongoDB)
- Databases: PostgreSQL, MongoDB
- Caching: Spring Cache Abstraction
- Containerization: Docker

## Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/bookstore-management.git
    ```
2. Install and start PostgreSQL and Mongo server with Docker:
    ```bash
    docker-compose up
    ```
3. Install dependencies, build the project and start the application:
    ```bash
    cd bookstore-management
    ./gradlew bootRun
    ```


## Contributing

Contributions are welcome! Please open issues or submit pull requests.

## License

MIT