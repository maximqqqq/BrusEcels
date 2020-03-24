package Part3_Matrix;


public class MatrixSortirovka {
    public static void main(String[] args) {
        System.out.println("==========Сортировка");
        int[][] array = {{4, 8, 6, 7}, {1, 6, 8, 3}, {8, 32, 45, 78}, {12, 13, 46, 54}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int temp1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if (array[k][l] > array[i][j]) {
                            temp1 = array[k][l];
                            array[k][l] = array[i][j];
                            array[i][j] = temp1;
                        }
                    }
                }
            }
        }
        System.out.println("\nУпорядоченный массив: ");
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("=============Сортировка выбором");
        int[] a = {1, 5, 2, 4, 7};
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            int min = a[i];// Предполагаемый минимальный элемент
            int imin = i;  // Индекс минимального элемента
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }

        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("\n=============Сортировка узырьком");

        int[] a1 = {5, 6, 7, 1, 3, 8, 4};
        for (int i = 0; i < a1.length; i++) {
            System.out.print(" " + a1[i] + " ");
        }
        /* Внешний цикл постоянно сужает фрагмент массива,
         * который будет рассматриваться, ведь после каждого прохода
         * внутреннего цикла на последнем месте фрагмента будет
         * оказываться нужный элемент (его не надо рассматривать снова).*/
        for (int i = a1.length - 1; i >= 2; i--) {
            /* В переменной sorted мы будем хранить признак того,
             * отсортирован ли массив. Перед каждым проходом внутреннего
             * цкла будем предполагать, что отсортирован, но если совершим
             * хоть одну перестановку, то значит ещё не конца отсортирован.
             * Этот приём, упрощающий сортировку, называется критерием Айверсона.*/
            boolean sorted = true;
            /* Во внутреннем цикле мы проходимся по фрагменту массива, который
             * определяется внешним циклом. В этом фрагменте мы устанавливаем
             * правильный порядок между соседними элементами, так попарно
             * обрабатывая весь фрагмент.*/
            for (int j = 0; j < i; j++) {
                /* Если порядок соседних элементов не правильный, то их
                 * надо обменять местами. И запомнить, что была перестановка.*/
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                    sorted = false;
                }
            }
            /* Если массив отсортирован (т.е. не было ни одной перестановки
             * во внутреннем цикле, значит можно прекращать работу внешнего
             * цикла.*/

            if (sorted) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < a1.length; i++) {
            System.out.print(" " + a1[i] + " ");
        }
    }
}
