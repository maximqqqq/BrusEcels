package Part3_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppSet {
    public static void main(String[] args) {
        //Set Это уникальная колекция в которую мы не можем положить 2 одинаковых элемента
        Set<String> hashSetset = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        hashSetset.add(null);
        linkedHashSet.add(null);
//        treeSet.add(null);
        System.out.println("Можно ли положить null ?....  YES");
        System.out.println("hashSetset  " + hashSetset.size());
        System.out.println(hashSetset.contains(null));
        System.out.println("linkedHashSet  " + linkedHashSet.size());
        System.out.println("В treeSet ноль(null) ложить нельзя");
        System.out.println("Разница между ними=====================");
        //HashSet хранит в рамдомном порядке!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        hashSetset.add("one");
        hashSetset.add("two");
        hashSetset.add("three");
        hashSetset.add("four");
        hashSetset.add("five");
        for (String hs : hashSetset) {
            System.out.println(hs);
        }
        System.out.println();
        //LinkedHashSet ранит все по порядку !!!!!!!!!!!!!!!!!!!!!
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        for (String lhs : linkedHashSet) {
            System.out.println(lhs);
        }
        System.out.println();
        //TreeSet это отсортированая коллекция в данном случае по алфавиту
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("f");
        treeSet.add("b");
        for (String ts : treeSet) {
            System.out.println(ts);
        }
        System.out.println("Student=======================");
        Set<Student> hashSetsetStud = new HashSet<>();
        Set<Student> linkedHashSetStud = new LinkedHashSet<>();
        Set<Student> treeSetStud = new TreeSet<>();
        hashSetsetStud.add(new Student(3));
        hashSetsetStud.add(new Student(1));
        hashSetsetStud.add(new Student(2));
        for (Student s:hashSetsetStud) {
            System.out.println(s.id);
        }
        System.out.println("Чтобы ложить тудентов в TreeSet нужно имплементить conperabe и переопределяит comparableTo" +
                " ему нужно сравнивать элементы что бы отсортировать, ля сортировки он заходит не в иквалс в компараблеТо");
        treeSetStud.add(new Student(3));
        treeSetStud.add(new Student(1));
        treeSetStud.add(new Student(2));
        for (Student ts:treeSetStud) {
            System.out.println(ts.id);
        }

    }
    static class Student implements Comparable{
        int id;

        public Student(int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int compareTo(Object o) {
            return id -((Student)o).id;
        }
    }
}
