# Student Management System
This is a simple Spring Boot application for managing students, demonstrating CRUD (Create, Read, Update, Delete) operations using a PostgreSQL database. This application also includes setup instructions for testing with Insomnia and Swagger UI.

## Features
  Add a new student
  Retrieve all students
  Retrieve a single student by email
  Update a student's details
  Delete a student by email
## Technologies Used
  Spring Boot
  Spring Data JPA
  PostgreSQL
  Lombok
  Swagger UI
  Insomnia (for API testing)

## Testing with Insomnia
  Open Insomnia and create a new workspace.
  Create a new request for each endpoint listed above.
  Set the appropriate HTTP method (GET, POST, PUT, DELETE) and URL (http://localhost:5252/students).
  For POST and PUT requests, set the request body to JSON format.
  Send requests and verify the responses.
## Using Swagger UI
Swagger UI provides a user-friendly interface for testing and documenting your API. After starting the application, access Swagger UI at http://localhost:5252/swagger-ui.html

Access Swagger UI
URL: http://localhost:5252/swagger-ui/
Use the interface to explore and test the API endpoints.
Code Structure
controller/ - REST controllers.
service/ - Service layer.
repository/ - Repository layer for database operations.
model/ - Entity classes.
src/main/resources/ - Configuration files.
application.properties - Application configuration.
Lombok
This project uses Lombok to reduce boilerplate code. Ensure you have Lombok installed in your IDE.

Contribution
Feel free to fork this repository, make changes, and submit pull requests. Contributions are welcome!
