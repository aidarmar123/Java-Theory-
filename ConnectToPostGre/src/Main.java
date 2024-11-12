//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import DbConnection.PostgreConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        String jdbcURL
//                = "jdbc:postgresql://localhost:5432/Crud";
//        String username = "postgres";
//        String password = "1";
//
//        try {
//            // Загрузка драйвера PostgreSQL JDBC
//            Class.forName("org.postgresql.Driver");
//
//            // Установка соединения Connection
//            Connection connection
//                    = DriverManager.getConnection(
//                    jdbcURL, username, password);
//            System.out.println(
//                    "Подключено к базе данных PostgreSQL!");
//
//            // Создание оператора Statement
//            Statement statement
//                    = connection.createStatement();
//
//            // Создание таблицы, если она не существует
//
//
//            // Вставка строки в таблицу
//
//
//            // Извлечение данных из таблицы
//            String selectSQL = "SELECT * FROM users";
//            ResultSet resultSet
//                    = statement.executeQuery(selectSQL);
//
//            while (resultSet.next()) {
//                System.out.println(
//                        "ID пользователя: " + resultSet.getInt("Id")
//                                + ", Имя: "
//                                + resultSet.getString("Name"));
//            }
//
//            // Закрытие соединения
//            connection.close();
//            System.out.println("Соединение закрыто.");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        PostgreConnection conn = new PostgreConnection();
        conn.GetUsers();
    }
}