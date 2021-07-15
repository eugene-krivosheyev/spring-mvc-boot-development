$params = @{
 "name"="Vasya";
}
Invoke-WebRequest -Uri http://localhost:8080/api/client -Method POST -Body ($params|ConvertTo-Json) -ContentType "application/json"
