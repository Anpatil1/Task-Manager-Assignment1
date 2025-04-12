# 🗂️ Task Manager Assignment

This is a simple Task Manager application built using **Java Spring Boot**. The project allows users to manage tasks — including creating, retrieving, updating, and deleting them.

---

## 🚀 Features

- Add new tasks
- View list of tasks
- Update existing tasks
- Delete tasks
- Exception handling (e.g., for tasks not found)
- RESTful API with Spring Boot

---

## 🛠️ Tech Stack

- Java 8+
- Spring Boot
- Maven
- Git & GitHub

---

## 📁 Project Structure

```
task-manager/
├── src/
│   ├── main/
│   │   ├── java/com/taskmanager/
│   │   │   ├── controller/         # TaskController.java
│   │   │   ├── exception/          # TaskNotFoundException.java
│   │   │   ├── model/              # Task.java
│   │   │   ├── service/            # TaskService.java
│   │   │   └── TaskManagerApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/taskmanager/TaskManagerApplicationTests.java
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🔧 How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Anpatil1/Task-Manager-Assignment.git
   cd Task-Manager-Assignment
   ```

2. **Build the project**  
   ```bash
   mvn clean install
   ```

3. **Run the application**  
   ```bash
   mvn spring-boot:run
   ```

4. **Access the APIs**
   - Base URL: `http://localhost:8080/api/tasks`

---

## 📌 Sample Endpoints

- `GET /api/tasks` - Get all tasks
- `GET /api/tasks/{id}` - Get task by ID
- `POST /api/tasks` - Create a new task
- `PUT /api/tasks/{id}` - Update task by ID
- `DELETE /api/tasks/{id}` - Delete task by ID

---

## 💬 Exception Handling

- Custom `TaskNotFoundException` is thrown when a task with the given ID doesn't exist.

---

## 🙌 Contributing

Feel free to fork this repository and submit a pull request if you find any improvements!

---

## 🧑 Author

👤 **Anpatil1**  
🔗 [GitHub Profile](https://github.com/Anpatil1)

---

## 📄 License

This project is licensed under the MIT License.