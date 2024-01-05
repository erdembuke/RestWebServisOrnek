# Java Spring Boot Project "Student Web Service"

This project contains a Spring Boot web service developed using Java 17 with Intellij IDEA Ultimate. The project is designed to manage student information and includes 4 methods.

## Project Details

- **Language Used:** Java
- **IDE Used:** Intellij IDEA Ultimate
- **Spring Boot Version:** 3.2.1
- **Java Version:** 17
- **Port:** 8081

## Web Service Methods

### 1. Get - Retrieve All Students

- **Endpoint:** `/`
- **HTTP Method:** GET
- **Description:** Retrieves all student records.

### 2. GetByNumber - Retrieve Student by Number

- **Endpoint:** `/{number}`
- **HTTP Method:** GET
- **Description:** Retrieves the student with the specified number.

### 3. Create Student

- **Endpoint:** `/`
- **HTTP Method:** POST
- **Description:** Creates a new student record.

### 4. Delete Student by Number

- **Endpoint:** `/{no}`
- **HTTP Method:** DELETE
- **Description:** Deletes the student with the specified ID.

## Running the Project

1. Download the project files to your computer (or import the project using IDE).
2. Open **Intellij IDEA Ultimate.**
3. Open the project file.
4. Run the application and test the API by going to `http://localhost:8081`.

## License

This project is licensed under the [MIT license](LICENSE). You can review the license file for detailed information.
