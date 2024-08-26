# RestoRise - Restaurant and Bar Management System Web POS

## Project Overview

**RestoRise** is a comprehensive Restaurant and Bar Management System designed to streamline and optimize various operations within a restaurant or bar environment. This system provides efficient management of orders, inventory, and customer service, ensuring a smooth and productive workflow.

The project is built using Jakarta EE for the backend, with MySQL as the database, and AJAX (or fetch) for handling client-server communication. The application follows a proper layered architecture to ensure scalability, maintainability, and separation of concerns.

## Tech Stack

- **Backend:** Jakarta EE
- **Database:** MySQL (configured using JNDI)
- **Frontend:** AJAX or fetch for API communication
- **Logging:** Java Util Logging (or any other preferred logging framework)
- **Version Control:** Git, with the repository hosted on GitHub

## Project Structure

The application is designed following a layered architecture pattern, which is divided into the following layers:

1. **Presentation Layer:** Handles the UI/UX and interacts with users through HTTP requests.
2. **Service Layer:** Contains the business logic of the application.
3. **Data Access Layer (DAO):** Interacts with the MySQL database using native SQL queries.
4. **Domain Layer:** Represents the data model and contains the entity classes.

### Directory Structure

```plaintext
/src/main/java
    /com/restorise
        /controller        # Presentation Layer
        /service           # Service Layer
        /dao               # Data Access Layer
        /model             # Domain Layer
/resources
    /META-INF/persistence.xml  # JPA configurations
    /logging.properties        # Logging configuration
/webapp
    /WEB-INF/web.xml           # Web configuration
    /index.html                # Main entry point (UI)
