package Part2_Read_Write;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RideOperationWrite {
    public static void main(String[] args) throws IOException {

        List<String> list = Files.readAllLines(Paths.get("App.txt"), Charset.defaultCharset());

        int a = Integer.parseInt(list.get(0));
        int b = Integer.parseInt(list.get(1));

        int c = a + b;

        String text = Integer.toString(c);
        PrintWriter out = new PrintWriter("App2.txt");
        out.println(text);
        out.close();
    }
}
