package Part3_Collections.Part_Blinov_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

//Замена удоление и поиск элемента
public class App2 {
    public static void main(String[] args) {
        ArrayList<Character> a = new ArrayList<>(5);
        System.out.println("Колекция пуста " + a.isEmpty());

        for (char c = 'a'; c < 'h'; ++c) {
            a.add(c);
        }

        char ch = 'a';

        a.add(6, ch);

        System.out.println(a);

        ListIterator<Character> it;
        it = a.listIterator(2);//Извлечение итератора списка позиции

        System.out.println("Добовление итератора в позицию " + it.nextIndex());

        it.add('x');//Добовление элемента без замены

        System.out.println(a);
        //Сравнить методы
        int index = a.lastIndexOf(ch);

        a.set(index, 'W');

        System.out.println(a+ " После замены элемента");

        if (a.contains(ch)){
            a.remove(a.indexOf(ch));
        }
        System.out.println(a+" Удаленный элемент "+ch);


    }
}
