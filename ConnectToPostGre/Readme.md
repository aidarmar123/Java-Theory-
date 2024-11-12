## Подключение к PostGre с помощью JDBC

### Установка драйвера 
Для начала нужно установить (драйвер)[https://jdbc.postgresql.org/download/postgresql-42.7.4.jar] 

### Создание класса для подключение к БД 

#### Подключем драйвер 
Правой кнопкой мыши по названию проекта и выбираем Open Module Settings
![image](https://github.com/user-attachments/assets/2ae5b91c-8214-4f2b-8ba6-c04abbd4b0c9)

Далее выбирем Libraies и добовляем скаченный драйвер
![image](https://github.com/user-attachments/assets/4ea2db66-a51b-44d4-9402-edbaff4f3cb6)

Создаем Connection используя DriverManager
 
```java
import java.sql.*;

public class PostgreConnection {

    String port = "5432";
    String dbName = "Crud";
    String username = "postgres";
    String password = "1";
    public Connection connectToDb(){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,username,password);
            if(conn!=null){
                System.out.println("Connected");
            }else{
                System.out.println("Not Connected");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    };
```

