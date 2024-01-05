# School Java Spring Boot Student Web Service

This project contains a Spring Boot web service developed using ![Java Logo](https://img.icons8.com/color/20/000000/java-coffee-cup-logo.png) Java 17 with Intellij IDEA Ultimate. The project is designed to manage student information and includes 4 methods within a web service class.

## Project Details

- **Language Used:** ![Java Logo](https://img.icons8.com/color/20/000000/java-coffee-cup-logo.png) Java
- **IDE Used:** ![IntelliJ IDEA Ultimate Logo](https://img.icons8.com/color/20/000000/intellij-idea.png) Intellij IDEA Ultimate
- **Spring Boot Version:** ![Spring Boot Logo](https://img.icons8.com/color/20/000000/spring-logo.png) Latest
- **Java Version:** 17
- **Port:** 8081

## Web Service Methods

### 1. Get - Retrieve All Students

- **Endpoint:** `/students`
- **HTTP Method:** GET
- **Description:** Retrieves all student records.

### 2. GetByNumber - Retrieve Student by Number

- **Endpoint:** `/student/{number}`
- **HTTP Method:** GET
- **Description:** Retrieves the student with the specified number.

### 3. Create Student

- **Endpoint:** `/student`
- **HTTP Method:** POST
- **Description:** Creates a new student record.

### 4. Delete Student by ID

- **Endpoint:** `/student/{id}`
- **HTTP Method:** DELETE
- **Description:** Deletes the student with the specified ID.

## Running the Project

1. Download the project files to your computer. ![Download Icon](https://img.icons8.com/ios/20/000000/download--v1.png)
2. ![Intellij IDEA Ultimate Logo](https://img.icons8.com/color/20/000000/intellij-idea.png) **Open Intellij IDEA Ultimate.**
3. Open the project file.
4. Run the application and test the API by going to `http://localhost:8081`.

## License

This project is licensed under the [MIT license](LICENSE). You can review the license file for detailed information.
