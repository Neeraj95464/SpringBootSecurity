Spring Boot Security Project

This project demonstrates various concepts of Spring Boot Security, including user authentication, authorization, and password security. It also includes features for securing APIs and preventing reverse engineering of passwords.

Features

User Authentication: Users can log in with their username and password.
Authorization: Different roles (e.g., admin, user) have different access permissions to various parts of the application.
Password Security: Passwords are securely hashed using bcrypt to prevent reverse engineering.
API Security: APIs are protected to ensure that only authorized users can access them.
Error Handling: Custom error pages are provided for common HTTP error codes (404, 403).
Session Management: Session handling ensures that user sessions are secure and managed effectively.
Redirect After Login: Users are redirected to different pages based on their roles after successful login.

Technologies Used

- Spring Boot
- Spring Security
- Thymeleaf (for server-side templating)
- HTML/CSS (for front-end)
- Java (for back-end logic)

How to Run

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
3. Build and run the application.
4. Access the application in your web browser at [http://localhost:8080](http://localhost:8080).

Usage

- Navigate to the login page and enter your credentials.
- Explore different parts of the application based on your role (admin or user).
- Access the APIs with proper authentication.

Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.
