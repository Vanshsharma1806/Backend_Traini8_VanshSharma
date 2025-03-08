# Backend_Traini8_VanshSharma

## 🚀 Project Setup Instructions

This guide will help you set up and run the backend project locally.

### Prerequisites
Before running the project, ensure you have the following installed:
- **Java 17** or later  
- **Maven**  
- **MongoDB** (running locally at `mongodb://127.0.0.1:27017/trainingcenters`)  
- **Postman** (optional, for API testing)

##  Setup & Run the Project

### 1️. Clone the Repository  
```sh
git clone https://github.com/Vanshsharma1806/Backend_Traini8_VanshSharma
cd Backend_Traini8_VanshSharma
```

### 2️. Start MongoDB
Ensure MongoDB is running. The application connects to a database named **"trainingcenters"**.


### 3️. Install Dependencies & Build
```sh
mvn clean install
```

### 4️. Run the Application
```sh
mvn spring-boot:run
```


The backend will be available at:
http://localhost:8080

###  How to Test
Use **Postman** to test the APIs.

```sh
POST http://localhost:8080/training-centers/create
```
###  Create a Training Center

**Request Body (JSON)**

```sh
{
    "centerName": "Tech Skills Academy",
    "centerCode": "TECH1234ABCD",
    "address": {
      "detailedAddress": "Sector 5, Noida",
      "city": "Noida",
      "state": "Uttar Pradesh",
      "pinCode": "201301"
    },
    "studentCapacity": 200,
    "coursesOffered": ["Java", "Spring Boot", "Microservices"],
    "contactEmail": "contact@techskills.com",
    "contactPhone": "9876543210"
}
```

### Get All Training Centers

```sh
GET http://localhost:8080/training-centers/get
```

```sh
[
    {
        "centerName": "Tech Skills Academy",
        "centerCode": "TECH1234ABCD",
        "address": {
          "detailedAddress": "Sector 5, Noida",
          "city": "Noida",
          "state": "Uttar Pradesh",
          "pinCode": "201301"
        },
        "studentCapacity": 200,
        "coursesOffered": ["Java", "Spring Boot", "Microservices"],
        "contactEmail": "contact@techskills.com",
        "contactPhone": "9876543210"
    }
]
```


### Error Handling
- 400 Bad Request → Invalid data (e.g., missing required fields)
- 404 Not Found → Training center not found
- 500 Internal Server Error → Unexpected errors

