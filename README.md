# JobTracker App 🚀

A simple job tracking application built with Spring Boot and PostgreSQL, containerized using Docker and orchestrated with Docker Compose.

## 📦 Features
- REST API to manage job applications
- PostgreSQL integration
- Fully containerized with Docker
- Easily deployable on any machine

---

## 🐳 Requirements
- Docker
- Docker Compose

---

## ⚙️ How to Run

1. **Clone the repository:**

```bash
git clone https://github.com/your-username/jobtracker.git
cd jobtracker
```
2. Build the Spring Boot App (if needed):
```bash
./mvnw clean package
```
This creates a .jar file in the target/ folder.

3. Build the Docker image
```bash
docker build -t jobtracker-app:latest .
```

4.Start the app and PostgreSQL using Docker Compose:
```bash
docker-compose up
```
5.The API should now be available at:
👉 http://localhost:8080


🧪 Sample Request

POST http://localhost:8080/api/jobs
Content-Type: application/json

{
  "jobTitle": "Full Stack Developer",
  "companyName": "EduSmart",
  "applicationDate": "2025-06-05",
  "status": "INTERVIEWED"
}

🗃️ Project Structure
jobtracker/
│
├── src/                       # Java source files
├── target/                    # Build output
├── Dockerfile                 # Builds app image
├── docker-compose.yml         # Orchestrates containers
├── README.md                  # This file
└── application.properties     # Spring Boot config

🐘 PostgreSQL Info

Username: postgres

Password: Jakarta39069!

DB Name: jobtrackerdb

📤 Docker Hub
You can also pull the image directly:
docker pull zainmorshed/jobtracker-app:latest

```
2. Build the Spring Boot App (if needed):
```bash
./mvnw clean package
```
This creates a .jar file in the target/ folder.

🧾 License
MIT License © 2025 Zain Morshed
