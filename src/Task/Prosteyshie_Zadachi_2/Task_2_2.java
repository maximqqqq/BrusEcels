package Task.Prosteyshie_Zadachi_2;

import java.util.Scanner;

//Дана масса в килограммах. Найти число полных центнеров в ней.
public class Task_2_2 {
    public static void main(String[] args) {
        double massKilo;
        int rez;

        Scanner s = null;

        try {
            s = new Scanner(System.in);

            System.out.println("Enter massKilo");
            massKilo = s.nextDouble();

        } finally {
            if (s != null) {
                s.close();
            }
        }

        rez = (int) (massKilo/100);

        System.out.println(rez);
    }
}
