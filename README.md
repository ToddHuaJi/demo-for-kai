# demo-for-kai
Standard Spring boot with In memory SQL. SQL will reset when the server is restarted. SQL init state can see `/demo/src/main/resources/data.sql`

# Usage
To clone this repo:
`git clone https://github.com/ToddHuaJi/demo-for-kai.git`

When you are at the root dir (where you can see `pom.xml`) execute `.\mvnw spring-boot:run` to run the server

# Exposed REST API Endpoint: 
- `GET`and `POST` on `http://localhost:8080/students` 
- `PUT`and `DELETE` `http://localhost:8080/students/{id}`. Replace `{id}` with actual `int` id of the student

API code can be found in `/demo/src/main/java/com/todd/demo/controller/StudnetController.java` 

# Stuff I used for this
- Spring boot 
- Spring MVC (Controller and RESTful API endpoint)
- Spring Data JPA (SQL stuff, annotations in `dao` and `model` package) 
- Maven
- JDK 8
