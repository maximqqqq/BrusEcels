package Part3_Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppMaps {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();//(Изночальгое значение 16, а максимальное 2^30) Массив Nodov
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        Map<String,String> treeMap = new TreeMap<>();//Дерево Entry
        Map<String,String> hashTable = new Hashtable<>();//Потока безопасна yncronaze
        Map<String,String> syncMap = Collections.synchronizedMap(new HashMap<>());/*Более современный подход любую мапу
        можем сделать синхронизированой*/
        System.out.println("Max copasity   HashMap (Изночальгое значение 16, а максимальное 2^30) Массив Nodov");
        System.out.println("load factor  по умолчанию  0.75");
        /*Колизия(это когда в ячейку поподают элементы с динаковыми хэш кодами),
         значение с одинаковыми хэшами могуд складываться в одну ячейку
        * концепция в том что есть у нас например 16 элементов и как только будут заполнены 75%(0.75)
        * в 12ти ячейках будут лежать элементы то таблица начинает перехешироваться, т е она вырастит в 2 раза
        * т е она будет не 16 а уже 32 элемента и так далее*/
        System.out.println("navegable map===");
        TreeMap<String,String> treeMap1 = new TreeMap<>();
        treeMap1.put("a","1");
        treeMap1.put("d","4");
        treeMap1.put("c","5");
        System.out.println(treeMap1.subMap("a","b"));//Получить значение от а до б, выведет только а, т к б не включительно
        System.out.println(treeMap1.subMap("c","d"));
        System.out.println("HashMap  занимает больше место чем TreeMap. В TreeMap объекты ссылаются друг на друга и пустых мест там не будет" +
                " а HashMap будет иметь пустые ячейки которые будут ждать заполнение 75%");

    }
}
