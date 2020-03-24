package Task.Prosteyshie_Zadachi_2;

import java.util.Scanner;

// Дано расстояние в сантиметрах. Найти число полных метров в нем.
public class Task_2_1 {
    public static void main(String[] args) {
        double santmetr;
        int rez;

        Scanner s = null;
        try {

            s = new Scanner(System.in);
            System.out.println("Enter santimetr");
            santmetr = s.nextDouble();

        } finally {
            if (s != null) {
                s.close();
            }
        }

        rez = (int) (santmetr/100);

        System.out.println(rez);

    }
}
