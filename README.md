## Establecemos el nombre de nuesta base de datos 

```java
#database connection
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/db_anime?createDatabaseIfNotExist=true&userSSL=false
spring.datasource.username=root
spring.datasource.password=yourpassword
```
### Cambiamos la contraseña de la base de datos en

```java
spring.datasource.password=
```

### Si deseas tener otro nombre de tu base de datos puedes cambiar aca

```java
spring.datasource.url=jdbc:mysql://localhost:3306/nombreDeTuBaseDeDatos?createDatabaseIfNotExist=true&userSSL=false
```

#### eso es todo gracias:)
