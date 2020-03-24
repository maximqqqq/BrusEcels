package Part3_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AppCollect {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();//Листы работают на основе индексов
        Set<String> set = new HashSet<>();
        Queue<String> queue = new LinkedList<>();//Очереди

        Map<String,String> map = new HashMap<>();

        System.out.println("======Collection========");
        collection.add("one");//Добовление элемента
        collection.add("two");
        collection.add("three");
        collection.add("fore");
        System.out.println(collection.contains("two"));//Проверка на существование елем в колекции
        System.out.println(collection.size());//Вывод количества элементов
        collection.remove("one");//Удаление
        System.out.println(collection.size());//Вывод количества элементов

        //Итератор для того что бы пробежать по коллекции
        Iterator<String> iterator = collection.iterator();//Так использовать итератор не красиво, лучше юзать !forech!
        while (iterator.hasNext()){//Метод hasNext() используется, чтобы проверять, есть ли еще элементы.
            System.out.println(iterator.next());//Метод next() возвращает следующий (очередной) элемент коллекции.
        }
        System.out.println("==========================================");
        //Так лучше
        for (String s:collection) {
            System.out.println(s);
        }

        System.out.println("======List======");
        list.add("Vasa");
        list.add("Piter");
        list.add("Otto");
        list.add("Kola");
        System.out.println(list.get(1));//Вывод по индексу

        System.out.println("======Set======");
        //!!!!!!!!!!  SET не хранит одинаковые объекты, каждый объект уникален, он затрет одинаковые и создаст 1н объект
        set.add("ooo");
        set.add("ooo");
        System.out.println(set.size());

        System.out.println("======Queue======");
        queue.add("one");
        queue.add("two");
        queue.add("three");
//        System.out.println(queue.element());//То что пришло первым, первым и выдаст
        //Метод remove()-удоляет  peek()-достает элемент но не удоляет его в очереди  pool()-Достоет и удаляет из очереди
        System.out.println(queue.offer("fore"));//Добовляет элемент в конец очереди
        queue.add("five");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("======Map======");

        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put(null,"fore");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        map.remove("1");
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        System.out.println(map.get("3"));
        System.out.println(map.get(null));

    }
}
