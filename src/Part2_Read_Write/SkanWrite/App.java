package Part2_Read_Write.SkanWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = null;

        String str ;

        try {
            FileWriter fileWriter = new FileWriter(new File("d:\\\\Projects\\\\BrusEcels\\\\src\\\\Part2_Read_Write\\\\SkanWrite\\\\Apps.txt"));
            scanner = new Scanner(System.in);
            System.out.println("Enter string");
            str = scanner.nextLine();
            fileWriter.write(str);
            fileWriter.close();
        }catch (IOException e){
            System.err.println("NotFile"+e);
        }
        finally {
            if (scanner!=null){
                scanner.close();
            }
        }


    }
}
