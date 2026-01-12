# Tasks Management API – Spring Boot (AWS Deployed)

A **RESTful Task Management backend application** built with **Spring Boot** and deployed on **AWS EC2 with Amazon RDS (MySQL)**. This project showcases the complete journey from local development to production cloud deployment.

## 🚀 Features

- **User Authentication:** Registration and login with JWT tokens
- **Task Management:** Create, update, delete, and view tasks
- **Filtering:** Filter tasks by status and priority
- **Security:** Protected APIs using Spring Security and JWT
- **Cloud-Ready:** Fully deployed on AWS infrastructure

---

## 🛠 Tech Stack

- **Backend:** Spring Boot, Spring Security, JWT
- **Database:** MySQL (Amazon RDS)
- **ORM:** JPA / Hibernate
- **Build Tool:** Maven
- **Cloud Services:** AWS EC2, AWS RDS
- **API Testing:** Postman

---

## ☁️ Deployment Architecture

The application follows a cloud-native architecture:

- Spring Boot application runs on **AWS EC2** (Amazon Linux)
- MySQL database hosted on **Amazon RDS** for reliability
- Secure communication between EC2 and RDS via VPC Security Groups
- Public API access through EC2's public IP on port 3030

---

## 🔐 Security

-JWT-based authentication
- Protected task APIs (user-specific access)
- Security Groups configured with minimum required ports

---

## 📦 Deployment Journey

Here's how I deployed this application to AWS:

### Step 1: Setting Up the Database

First, I created a MySQL database instance on **Amazon RDS**:

<img width="700" alt="AWS RDS MySQL database instance configuration" src="https://github.com/user-attachments/assets/bfd02a59-0878-4050-9d16-cbd589ff4740" />

Then verified the connection using **MySQL Workbench**:

<img width="700" alt="MySQL Workbench connection to AWS RDS" src="https://github.com/user-attachments/assets/47af6e3a-7f30-430c-a195-8be57045de15" />

### Step 2: Configuring the Application

Updated `application.properties` with RDS credentials:
```properties
spring.datasource.url=jdbc:mysql://<rds-endpoint>:3306/taskapplication
spring.datasource.username=admin
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
```

### Step 3: Launching EC2 Instance

Created an **EC2 instance** and configured the security groups to allow traffic on port 3030:

<img width="700" alt="AWS EC2 instance running with network configuration" src="https://github.com/user-attachments/assets/5affaa9b-83fd-425e-8a5f-405007f12205" />

### Step 4: Deploying the Application

Built and deployed the application:
```bash
# Build the JAR file locally
mvn clean package

# Copy to EC2 server
scp -i taskspem.pem target/TasksApp-0.0.1-SNAPSHOT.jar ec2-user@<ec2-ip>:/home/ec2-user/projects/

# SSH into EC2
ssh -i taskspem.pem ec2-user@<ec2-ip>

# Run the application
cd /home/ec2-user/projects
java -jar TasksApp-0.0.1-SNAPSHOT.jar
```

Application successfully started on port 3030:

<img width="700" alt="Spring Boot application running on EC2" src="https://github.com/user-attachments/assets/6f0ff70e-2e76-4924-bbe6-966e16b7fdb6" />

### Step 5: Testing the APIs

Verified everything works using **Postman**:

<img width="700" alt="Successful user registration API test" src="https://github.com/user-attachments/assets/62c1675a-ae14-476c-8c5c-d2e4e4357e94" />

---

## 🌐 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | User login |
| GET | `/api/tasks` | Get all tasks |
| POST | `/api/tasks` | Create a new task |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |

---

## 📝 What I Learned

Through this project, I gained hands-on experience with:

- Setting up and configuring **AWS RDS** for production databases
- Deploying Spring Boot applications on **EC2 instances**
- Troubleshooting connection issues between EC2 and RDS





