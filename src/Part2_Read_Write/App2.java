package Part2_Read_Write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("d:\\Projects\\BrusEcels\\src\\Part2_Read_Write\\App.txt"));

            String str = "";
            while ((str = br.readLine()) != null) {
                String[] s = str.split("\\s");
                System.out.println("Вывод получ строк");
                for (String App : s) {
                    System.out.println(App);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
