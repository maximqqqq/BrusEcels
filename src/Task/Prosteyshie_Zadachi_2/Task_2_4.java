package Task.Prosteyshie_Zadachi_2;

import java.util.Scanner;

//Дано расстояние в метрах. Найти число полных километров в нем.
public class Task_2_4 {
    public static void main(String[] args) {
        double metr;
        int rez;
        Scanner s = null;

        try {

            s = new Scanner(System.in);
            System.out.println("Enter mert");
            metr = s.nextDouble();
        } finally {
            if (s != null) {
                s.close();
            }
        }
        rez = (int) (metr/1000);
        System.out.println(rez);
    }
}
