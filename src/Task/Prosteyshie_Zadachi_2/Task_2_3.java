package Task.Prosteyshie_Zadachi_2;

import java.util.Scanner;

//Дана масса в килограммах. Найти число полных тонн в ней.
public class Task_2_3 {
    public static void main(String[] args) {
        double massTona;
        int rez;

        Scanner s = null;

        try {

            s = new Scanner(System.in);

            System.out.println("Enter massTona");
            massTona = s.nextDouble();

        } finally {
            if (s != null) {
                s.close();
            }
        }

        rez = (int) (massTona / 1000);
        System.out.println(rez);
    }
}
