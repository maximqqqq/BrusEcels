package taskJdbs.taskJdbsStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//for Class.foreName ужно скачать дрова jar
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

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
            statement.executeUpdate("drop table BOOKS");
            //Create new table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS BOOKS(id MEDIUMINT NOT NULL AUTO_INCREMENT , name CHAR(30) NOT NULL , PRIMARY KEY (id))");
            //add new value in table
            statement.executeUpdate("insert into BOOKS (name) values ('Inferno')");
            statement.executeUpdate("insert into BOOKS set NAME = 'Solomon'");
//ResultSet Выгребает данные
            ResultSet resultSet = statement.executeQuery("select  * from BOOKS");
             while (resultSet.next()){
                 System.out.println(resultSet.getInt(1));
                 System.out.println(resultSet.getString(2));
             }
        }

    }
}
