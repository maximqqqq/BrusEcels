package Part3_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AppList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();//Имплементация ArrayList. Работает на основе массива
        /*ArrayList динамически расширяем (Изначально на 10 элементов)    ArrayList- обычный список*/
        List<String> linkedList = new LinkedList<>();//LinkedList основан на ссылках(на основе нодов)
        List<Integer> vector = new Vector<>();/*Vector практически тоже самое что и LinkedList но у него все методы за
        синхронизированы (безопасны в отношении потокоа)*/
        List<String> stack = new Stack<>();/*Stack икстендит Vector все медоты Стека засинхронизированы
        (безопасны в отношении потокоа)*/
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());/*Подход для потокобезопасных приложений
        Вызавает мотоды те что есть в ArrayList но оборачивает их в синхронизированые блоки*/

        System.out.println("Sort=================");
        //SORT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");
        for (String s : arrayList) {
            System.out.println(s);
        }
        Collections.sort(arrayList);
        for (String s : arrayList) {
            System.out.println(s);
        }
        List<Student> arrayStudent = new ArrayList<>();
        arrayStudent.add(new Student(1));
        arrayStudent.add(new Student(3));
        arrayStudent.add(new Student(2));
        for (Student s : arrayStudent) {
            System.out.println(s.id);
        }
        Collections.sort(arrayStudent);
        for (Student s : arrayStudent) {
            System.out.println(s.id);
        }

        //БИНАРНЫЙ ПОИСК!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("Бинарный поиск=======================");
        /*Бинарный поиск пробигает по бинарному(находит элементы только если они отсортированы)*/
        Collections.sort(arrayList);//Сортируем колекцию
        System.out.println(arrayList.get(Collections.binarySearch(arrayList, "B")));//Вернет id

        System.out.println("Превращаем массив в колекцию и обратно=============================");
        //ревращаем коллекцию в массив
        String[] strings = new String[arrayList.size()];
        strings = arrayList.toArray(strings);
        //массив в колекцию
        List<String> stringList = Arrays.asList(strings);

        System.out.println("Сравнение====================");
        //Листы могут сравниваться+
        System.out.println(arrayList.equals(stringList));

        System.out.println("toString===================");
        System.out.println(arrayList);

        System.out.println("Vector vs Sync=============");
        List<Integer> arrayListTime = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            arrayListTime.add(i);
        }
        System.out.println(System.currentTimeMillis() - start);


        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            vector.add(i);
        }
        System.out.println(System.currentTimeMillis() - start1);


        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            syncList.add(i);
        }
        System.out.println(System.currentTimeMillis() - start2);

        System.out.println("Добовление элементов=============================");
//        List<Integer> arrayList3 = new ArrayList<>();
//        for (int i = 0; i < 2_000_000_000; i++) {
//            arrayList3.add(i);
//        }


    }

    //Чтобы отсортировать студентов нужно заимплементится и переопределить метод
    static class Student implements Comparable {
        private int id;
        String name;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            return id - ((Student) o).id;
        }
    }
}
