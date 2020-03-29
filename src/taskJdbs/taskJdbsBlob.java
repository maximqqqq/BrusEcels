package taskJdbs;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class taskJdbsBlob {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
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
            statement.executeUpdate("drop table USERS");
            //Create new table
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Users(id MEDIUMINT NOT NULL AUTO_INCREMENT , name CHAR(30) NOT NULL, img BLOB, PRIMARY KEY (id))");
//Записали в базу
            BufferedImage image = ImageIO.read(new File("smile.jpg"));
            Blob blob = conn.createBlob();

            try (OutputStream outputStream = blob.setBinaryStream(1)) {//!!!!!!!!!!!!!
                ImageIO.write(image, "jpg", outputStream);
            }

            PreparedStatement preparedStatement = conn.prepareStatement("insert into USERS (name,img) values (?,?)");
            preparedStatement.setString(1, "Maxim");
            preparedStatement.setBlob(2, blob);
            preparedStatement.execute();

//Читаем из базы
            ResultSet resultSet = statement.executeQuery("select * from USERS");
            while (resultSet.next()){
                Blob blob1 = resultSet.getBlob("img");
                BufferedImage image1 = ImageIO.read(blob1.getBinaryStream());
                File outPutFile = new File("seve.png");//Сохраняем в проект в новом формате
                ImageIO.write(image1,"png",outPutFile);
            }
        }
    }
}
