package DbConnection;
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

    public void GetUsers(){
        try{
            Connection conn =  conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,username,password);

            if(conn!=null){
                Statement stmt = conn.createStatement();
                String selectSQL = "SELECT * FROM User";
              ResultSet resultSet
                    = stmt.executeQuery(selectSQL);

            while (resultSet.next()) {
                System.out.println(
                        "ID пользователя: " + resultSet.getInt("Id")
                                + ", Имя: "
                                + resultSet.getString("Name"));
            }

            // Закрытие соединения
            conn.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
