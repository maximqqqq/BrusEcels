package Part3_Collections.Part_Blinov_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        ArrayList<Double> c = new ArrayList<>(7);
        for (int i = 0; i < 10; i++) {
            double z = new Random().nextGaussian();
            c.add(z);
        }
        for (Double d : c) {
            System.out.printf(" %.2f ", d);
        }
        int positiveNum = 0;
        int size = c.size();

        Iterator<Double> it = c.iterator();

        while (it.hasNext()) {
            if (it.next() > 0) {
                positiveNum++;
            } else {
                it.remove();
            }
        }
        System.out.printf("%n Количество полож : %d", positiveNum);
        System.out.printf("%n Количество не полож : %d", size - positiveNum);
        System.out.printf("\n Положительная колекция\n");

        for (Double d : c) {
            System.out.printf(" %.2f ", d);
        }

    }
}