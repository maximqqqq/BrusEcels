package Part2_Read_Write;

import java.util.Scanner;

public class AppScaner {
    public static void main(String[] args) {
        Scanner s = null;
        double x, y;
        double rez;

        try {
            s = new Scanner(System.in);

            System.out.println("Enter x ");
            x = s.nextDouble();

            System.out.println("Enter y ");
            y = s.nextDouble();


        } finally {
            if (s != null) {
                s.close();
            }
        }

        rez = ((Math.sin(x) + Math.cos(y)) /
                (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println(String.format("%.3f", rez));
    }
}
