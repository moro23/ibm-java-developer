# IBM Java Developer Professional Certificate

[![Coursera](https://img.shields.io/badge/Coursera-IBM%20Java%20Developer-blue?style=for-the-badge&logo=coursera)](https://www.coursera.org/professional-certificates/java-developer)
[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

My coursework, exercises, labs, and projects from the **[IBM Java Developer Professional Certificate](https://www.coursera.org/professional-certificates/java-developer)** on Coursera.

This program covers Java programming fundamentals, object-oriented design, web development, Spring framework, database integration, cloud-native development, and modern deployment practices with hands-on labs and real-world projects.

---

## About the Program

| Detail          | Info                                                  |
| --------------- | ----------------------------------------------------- |
| **Provider**    | IBM via Coursera                                      |
| **Level**       | Beginner → Intermediate                               |
| **Duration**    | 4–5 months (at ~10 hrs/week)                          |
| **Courses**     | 14-course series                                      |
| **Key Skills**  | Java, Spring Boot, REST APIs, SQL, Docker, Git, CI/CD |
| **Certificate** | IBM Professional Certificate (shareable on LinkedIn)  |

---

## Course Series & Progress

| #   | Course                                                                                                                                                | Key Topics                                                      | Status          |
| --- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------- | --------------- |
| 01  | [Introduction to Software Engineering](https://www.coursera.org/learn/introduction-to-software-engineering)                                           | SDLC, Agile, Scrum, IDEs, software architecture                 | Not Started     |
| 02  | [Java Programming for Beginners](https://www.coursera.org/learn/java-programming-for-beginners-course)                                                | Variables, data types, control flow, methods, arrays            | **In Progress** |
| 03  | [Object Oriented Programming in Java](https://www.coursera.org/learn/object-oriented-programming-in-java-course)                                      | Classes, inheritance, polymorphism, interfaces, design patterns | Not Started     |
| 04  | Java App Development Project: Fundamentals, OOP & File I/O                                                                                            | Applied Java fundamentals, OOP, file handling                   | Not Started     |
| 05  | [Introduction to HTML, CSS, & JavaScript](https://www.coursera.org/learn/introduction-html-css-javascript)                                            | Web fundamentals, DOM, responsive design, front-end basics      | Not Started     |
| 06  | [Getting Started with Git and GitHub](https://www.coursera.org/learn/getting-started-with-git-and-github)                                             | Version control, branches, PRs, merge, collaboration            | Not Started     |
| 07  | [Spring Framework for Java Development](https://www.coursera.org/learn/spring-framework-for-java-development)                                         | Spring Boot, REST APIs, Spring Security, dependency injection   | Not Started     |
| 08  | [Java Development with Databases](https://www.coursera.org/learn/java-development-with-databases)                                                     | JDBC, Hibernate ORM, SQL/NoSQL, Spring Data JPA                 | Not Started     |
| 09  | [Cloud Native, Microservices, Containers, DevOps and Agile](https://www.coursera.org/learn/cloud-native-microservices-devops-agile)                   | Cloud computing, Docker, Kubernetes, CI/CD pipelines            | Not Started     |
| 10  | Java, Design Patterns, Testing, and Deployment                                                                                                        | Design patterns, unit testing, deployment strategies            | Not Started     |
| 11  | [Java Development Capstone Project](https://www.coursera.org/learn/java-development-capstone-project)                                                 | Smart Clinic Management System (full-stack project)             | Not Started     |
| 12  | [Generative AI: Elevate your Software Development Career](https://www.coursera.org/learn/generative-ai-elevate-your-software-development-career)      | AI-assisted coding, prompt engineering, LLMs for developers     | Not Started     |
| 13  | Generative AI for Java and Spring Development                                                                                                         | AI tools for Java/Spring workflows                              | Not Started     |
| 14  | [Software Developer Career Guide and Interview Preparation](https://www.coursera.org/learn/software-developer-career-guide-and-interview-preparation) | Resume building, portfolios, interview strategies               | Not Started     |

> **Note:** Some courses may be recent additions to the series. Links will be added as they become available on Coursera.

**Progress:** `1 / 14 courses in progress`

```
[██░░░░░░░░░░░░░░░░░░] 7% Complete
```

---

## Repository Structure

```
ibm-java-developer/
│
├── README.md
├── .gitignore
├── LICENSE
│
├── 01-intro-to-software-engineering/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 02-java-programming-for-beginners/      ← Currently here
│   ├── src/
│   │   ├── DataTypes.java
│   │   └── ...
│   ├── classes/                             ← Compiled output (gitignored)
│   ├── notes.md
│   └── labs/
│
├── 03-oop-in-java/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 04-java-app-development-project/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 05-intro-html-css-javascript/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 06-getting-started-git-github/
│   ├── notes.md
│   └── labs/
│
├── 07-spring-framework/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 08-java-databases/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 09-cloud-native-microservices/
│   ├── notes.md
│   └── labs/
│
├── 10-design-patterns-testing-deployment/
│   ├── src/
│   ├── notes.md
│   └── labs/
│
├── 11-capstone-project/
│   ├── src/
│   ├── docs/
│   └── README.md
│
├── 12-generative-ai-for-developers/
│   └── notes.md
│
├── 13-generative-ai-java-spring/
│   └── notes.md
│
└── 14-career-guide-interview-prep/
    └── notes.md
```

---

## How to Use This Repo

### Compiling and Running Java Files

```bash
# Navigate to a course folder
cd 02-java-programming-for-beginners

# Compile a Java file
javac -d classes src/DataTypes.java

# Run the compiled class
java -cp classes DataTypes
```

### Prerequisites

- **Java 21+** — [Download OpenJDK](https://openjdk.org/)
- **Git** — [Install Git](https://git-scm.com/)
- **IDE** (optional) — IntelliJ IDEA or VS Code with Java extensions

---

## Skills Being Developed

### Programming & Development

- Java fundamentals (variables, data types, operators, control flow)
- Object-Oriented Programming (classes, inheritance, polymorphism, interfaces)
- Design patterns, testing, and deployment practices
- Spring Boot & Spring Framework (REST APIs, dependency injection, security)
- HTML, CSS, JavaScript (front-end integration)

### Data & Databases

- SQL and relational database design
- JDBC and Hibernate ORM
- NoSQL database concepts
- Spring Data JPA

### DevOps & Cloud

- Git & GitHub (version control, collaboration)
- Docker (containerization)
- Kubernetes (orchestration basics)
- CI/CD pipelines
- Cloud-native application design

### Professional Skills

- Software development lifecycle (SDLC)
- Agile & Scrum methodologies
- Technical interview preparation
- AI-assisted development with generative AI tools

---

## Tools & Technologies

| Category            | Tools                                    |
| ------------------- | ---------------------------------------- |
| **Language**        | Java 21                                  |
| **Framework**       | Spring Boot, Spring MVC, Spring Security |
| **ORM**             | Hibernate, Spring Data JPA               |
| **Databases**       | PostgreSQL, MySQL, NoSQL                 |
| **Version Control** | Git, GitHub                              |
| **Containers**      | Docker, Kubernetes                       |
| **Build Tools**     | Maven                                    |
| **IDE**             | IntelliJ IDEA / Eclipse                  |
| **CI/CD**           | GitHub Actions                           |
| **API**             | RESTful APIs, Swagger/OpenAPI            |

---

## Related Projects

As I progress through this certificate, I'm also building portfolio projects to apply what I learn:

| Project                                                               | Description                             | Tech Stack                      |
| --------------------------------------------------------------------- | --------------------------------------- | ------------------------------- |
| [Task Manager API](https://github.com/YOUR_USERNAME/task-manager-api) | Production-grade REST API with JWT auth | Spring Boot, PostgreSQL, Docker |
| _More coming soon..._                                                 |                                         |                                 |

---

## Acknowledgments

- [IBM Skills Network](https://skills.network/) for creating the course content
- [Coursera](https://www.coursera.org/) for hosting the program
- Course instructors: IBM Skills Network Team, Michelle Saltoun, Muhammad Yahya, and others

---

## License

This repository contains my personal coursework and notes. Feel free to use it as a reference for your own learning.

[MIT License](LICENSE)
