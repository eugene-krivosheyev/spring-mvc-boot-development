$params = @{
 "name"="Vasya";
}
Invoke-WebRequest -Uri http://localhost:8080/spring-mvc-webapp/api/client -Method POST -Body ($params|ConvertTo-Json) -ContentType "application/json"
