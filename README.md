# RestoRise JakartaEE Backend

## Introduction
Welcome to the RestoRise JakartaEE Backend project. This project represents the backend implementation of a Point of Sale (POS) system designed for a restaurant and bar management scenario. The frontend of this system has already been developed, and this backend is built to serve as the API that powers the application's core functionalities.

## Project Structure

The backend project is organized in a layered architecture to maintain a clean separation of concerns. The major components include:

- **Business Layer (BO):** Contains the business logic of the application. It is responsible for processing the data sent from the controllers and preparing it for the data access layer.
  - **Custom Implementations:** Includes classes like `CustomerBOImpl`, `ItemBOImpl`, `OrderBOImpl`, etc., which implement specific business logic.
  - **Interfaces:** `CustomerBO`, `ItemBO`, `OrderBO`, etc., define the contracts that the business logic must fulfill.
  - **Factory:** `BOFactory` is used to instantiate business objects as needed.

- **Data Access Layer (DAO):** This layer is responsible for interacting with the database.
  - **Custom Implementations:** Includes classes like `CustomerDAOImpl`, `ItemDAOImpl`, `OrderDAOImpl`, etc., which implement the data persistence logic.
  - **Interfaces:** `CustomerDAO`, `ItemDAO`, `OrderDAO`, etc., define the contracts for data access.
  - **Utility:** `SQLUtil` provides utility functions for executing SQL queries.

- **Controller Layer:** This layer contains the REST controllers that expose the API endpoints.
  - Includes classes like `CustomerController`, `ItemController`, `OrderController`, etc.

- **Entity Layer:** Contains the entity classes that represent the database tables.
  - Includes classes like `Customer`, `Item`, `Order`, `OrderDetails`, `Staff`, etc.

- **DTO Layer:** Contains Data Transfer Objects (DTOs) which are used to transfer data between the layers.
  - Includes classes like `CustomerDTO`, `ItemDTO`, `OrderDTO`, etc.

- **Filter:** Contains filter classes like `CORSFilter` to handle cross-origin requests.

- **Resources:** Contains database schemas, configurations, and other resources.
  - Includes `mysql-db`, `schema.sql`, `WEB-INF/web.xml`, etc.

## Technologies Used

- **Jakarta EE:** The enterprise edition of Java used to build scalable, large-scale applications.
- **MySQL:** The database management system used for data persistence.
- **AJAX/Fetch:** Used in the frontend to communicate with this backend API.
- **JNDI:** Used for database configuration.
- **Maven:** Build automation tool for managing project dependencies and builds.

## Features

- **CRUD Operations:** The backend supports full CRUD (Create, Read, Update, Delete) operations for managing customers, items, orders, and staff.
- **Layered Architecture:** The project follows a layered architecture, ensuring a clean separation of concerns.
- **Logging:** The application includes proper logging to monitor various events and potential issues.

## Getting Started

### Prerequisites

- Java 21 (or later)
- Jakarta EE compatible application server (e.g., WildFly, Payara)
- MySQL Database Server
- Maven

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/RestoRise-JakartaEE-Backend.git
    cd RestoRise-JakartaEE-Backend
    ```

2. **Set up the MySQL Database:**
  - Execute the `schema.sql` file located in the `resources/mysql-db` directory.

3. **Configure the database connection:**
  - Update the `context.xml` file in the `WEB-INF` directory with your database credentials.

4. **Build the Project Using Maven:**
    ```bash
    mvn clean install
    ```

5. **Deploy the Application:**
  - Deploy the application on a Jakarta EE compatible server.

## Running the Application

Once deployed, the application will be available at [http://localhost:8080/RestoRise-JakartaEE-Backend](http://localhost:8080/RestoRise-JakartaEE-Backend).

### API Endpoints

| Endpoint                     | Method | Description                          |
|------------------------------|--------|--------------------------------------|
| `/api/customers`              | GET    | Retrieve all customers               |
| `/api/customers`              | POST   | Create a new customer                |
| `/api/customers/{id}`         | GET    | Retrieve a specific customer by ID   |
| `/api/customers/{id}`         | PUT    | Update an existing customer by ID    |
| `/api/customers/{id}`         | DELETE | Delete a customer by ID              |
| `/api/items`                  | GET    | Retrieve all items                   |
| `/api/items`                  | POST   | Create a new item                    |
| `/api/orders`                 | POST   | Create a new order                   |
| `/api/orders/{id}`            | GET    | Retrieve a specific order by ID      |
| `/api/orders/{id}`            | DELETE | Delete an order by ID                |

### Logging
The application uses SLF4J with Logback as the logging framework. Log files are stored in the `logs` directory. Ensure proper logging levels (`INFO`, `DEBUG`, `ERROR`) are configured in the `logback.xml` file.

### Best Practices

- **Layered Architecture:** Ensure that each layer only handles its own responsibility.
- **Code Conventions:** Follow standard Java naming conventions and coding practices.
- **Exception Handling:** Properly handle exceptions and ensure they are logged.
- **API Documentation:** Use Swagger/OpenAPI to document the API endpoints.

### Contributing

If you want to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Create a new Pull Request.

### License

This project is licensed under the MIT License. See the `LICENSE` file for details.

### Contact

For any inquiries, please contact [kavishkaprabashara@gmail.com](mailto:kavishkaprabashara@gmail.com).
