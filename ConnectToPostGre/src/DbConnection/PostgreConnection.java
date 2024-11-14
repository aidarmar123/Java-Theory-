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
            Class.forName("org.postgresql.Driver");
            Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,username,password);

            if(conn!=null){
                Statement stmt = conn.createStatement();
                String selectSQL = "SELECT * FROM \"User\" JOIN \"Role\" ON \"Role\".\"Id\" = \"User\".\"RoleId\""; //"SELECT * FROM User"
                ResultSet resultSet = stmt.executeQuery(selectSQL);

            while (resultSet.next()) {

                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String role = resultSet.getString("RoleId");

            }

            // Закрытие соединения
            conn.close();
            }
        }catch (Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
    public void GetData(String sqlRequest){
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,username,password);

            ResultSet resultSet = conn.createStatement().executeQuery(sqlRequest);
            while (resultSet.next()){
               
            }
        }catch (Exception e){
            System.out.println("Error "+e);
        }
    }
}
