package taskJdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class taskJdbsPrepareStatment {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:h2:~/test";
        String name = "ss";
        String password = "";
        //for Class.foreName ужно скачать дрова jar. Он был в установленой папке проги.Указать путь
        //File-Projekt structure-SDKs-и там найти файл(+)
        Class.forName("org.h2.Driver");
        //Так же в Projekt structure ужно добавить его
        try (Connection conn = DriverManager.getConnection(url, name, password)) {
            System.out.println("Is Connection");

            Statement statement = conn.createStatement();
            //Delete
            statement.executeUpdate("drop table Users");
            //Create new table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Users(id MEDIUMINT NOT NULL AUTO_INCREMENT , name CHAR(30) NOT NULL,password CHAR(30) NOT NULL , PRIMARY KEY (id))");
            //add new value in table
            statement.executeUpdate("insert into Users (name,password) values ('Maxim','123')");
            statement.executeUpdate("insert into Users set name = 'Sasha',password ='321'");

            String userId = "1";
//--------------------------------
//            ResultSet rs = statement.executeQuery("select * from  Users where id = '"+userId+"'");
//            while (rs.next()){
//                System.out.println("UserName "+rs.getString("name"));
//                System.out.println("PasswordName "+rs.getString("password"));
//            }
//------------------------------------
            PreparedStatement preparedStatement = conn.prepareStatement("select * from Users where id = ?");
            preparedStatement.setString(1,userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("UserName "+resultSet.getString("name"));
                System.out.println("PasswordName "+resultSet.getString("password"));
            }
        }
    }
}
