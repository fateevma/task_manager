# Task Manager

Небольшое веб-приложение для управления списком задач: добавление, просмотр и удаление задач через веб-интерфейс, без перезагрузки страницы.
A small web application for managing a to-do list: add, view and delete tasks through a web UI, without page reloads.

**[English](#english) | [Русский](#русский)**

---

## English

Learning project built to try out Spring Boot + JTE + HTMX together. Still a work in progress.

### Tech stack

- **Java 23**
- **Spring Boot 3.3.4** — web server and request handling
- **JTE** (Java Template Engine) — server-side HTML rendering
- **HTMX** — dynamic page updates without writing JavaScript
- **Maven** — build and dependency management

### Features

- View the task list
- Add a new task
- Delete a task
- Page updates without a full reload (thanks to HTMX)
- Tasks persist in a file-based H2 database (`./data/taskdb`) — they survive app restarts

Sample tasks are seeded once, only if the database is empty, so restarting won't wipe your own tasks. Browse the raw data at [http://localhost:8080/h2-console](http://localhost:8080/h2-console) (JDBC URL `jdbc:h2:file:./data/taskdb`, user `sa`, empty password).

### Requirements

- Java 23 or newer
- No separate Maven install needed — the project includes the Maven Wrapper (`mvnw` / `mvnw.cmd`)

### Running the project

Clone the repository:

```bash
git clone https://github.com/fateevma/task_manager.git
cd task_manager
```

Build and run (Windows):

```bash
mvnw.cmd spring-boot:run
```

Build and run (Linux/macOS):

```bash
./mvnw spring-boot:run
```

Once started, the app is available at [http://localhost:8080](http://localhost:8080).

### Tests

```bash
mvnw.cmd test
```

### Project structure

```
src/main/java/dev/danvega/tasks/
    Application.java      — Spring Boot entry point
    Task.java              — task model
    TaskController.java    — HTTP request handling
    TaskRepository.java    — in-memory task storage
src/main/jte/               — HTML templates (JTE)
src/test/java/...           — tests
```

### Roadmap

- [x] Persist tasks in a database
- [ ] Mark a task as done (status)
- [ ] Edit an existing task
- [ ] Validate input on the "add task" form

---

## Русский

Учебный проект — сделан для знакомства со связкой Spring Boot + JTE + HTMX. Пока в разработке.

### Технологии

- **Java 23**
- **Spring Boot 3.3.4** — веб-сервер и обработка запросов
- **JTE** (Java Template Engine) — рендеринг HTML на сервере
- **HTMX** — динамическое обновление страницы без написания JavaScript
- **Maven** — сборка проекта и управление зависимостями

### Возможности

- Просмотр списка задач
- Добавление новой задачи
- Удаление задачи
- Обновление списка на странице без полной перезагрузки (за счёт HTMX)
- Задачи сохраняются в файловой базе H2 (`./data/taskdb`) — переживают перезапуск приложения

Тестовые задачи создаются один раз, только если база пуста, поэтому перезапуск не затирает ваши собственные задачи. Посмотреть содержимое базы можно на [http://localhost:8080/h2-console](http://localhost:8080/h2-console) (JDBC URL `jdbc:h2:file:./data/taskdb`, пользователь `sa`, пароль пустой).

### Требования

- Java 23 или новее
- Maven не нужен отдельно — в проекте есть Maven Wrapper (`mvnw` / `mvnw.cmd`)

### Запуск проекта

Клонировать репозиторий:

```bash
git clone https://github.com/fateevma/task_manager.git
cd task_manager
```

Собрать и запустить (Windows):

```bash
mvnw.cmd spring-boot:run
```

Собрать и запустить (Linux/macOS):

```bash
./mvnw spring-boot:run
```

После запуска приложение доступно по адресу [http://localhost:8080](http://localhost:8080).

### Тесты

```bash
mvnw.cmd test
```

### Структура проекта

```
src/main/java/dev/danvega/tasks/
    Application.java      — точка входа Spring Boot
    Task.java              — модель задачи
    TaskController.java    — обработка HTTP-запросов
    TaskRepository.java    — хранилище задач (в памяти)
src/main/jte/               — HTML-шаблоны (JTE)
src/test/java/...           — тесты
```

### Что планируется доработать

- [x] Сохранение задач в базу данных
- [ ] Отметка задачи как выполненной (статус)
- [ ] Редактирование существующей задачи
- [ ] Валидация ввода на форме добавления задачи
