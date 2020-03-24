package Part2_Read_Write;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        File f1 = new File("d:\\Projects\\BrusEcels\\src\\Part2_Read_Write\\App.txt");
        File f2 = new File("d:\\Projects\\BrusEcels\\src\\Part2_Read_Write\\AppS.txt");

        int b;
        int count = 0;

        try {
            FileReader fr = new FileReader(f1);
            FileWriter fw = new FileWriter(f2);
            System.out.println("File App");
            while ((b = fr.read()) != -1) {
                System.out.print((char) b);
                 fw.write((char)b);
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Alarm " + e);
        }

    }
}
