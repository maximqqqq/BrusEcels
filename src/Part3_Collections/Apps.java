package Part3_Collections;

import java.util.ArrayList;
import java.util.List;

public class Apps {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("qqq");
        stringList.add("WWW");
        stringList.add("eee");
        stringList.add("rrrr");
        System.out.println(stringList.size());
        for (String str:stringList) {
            System.out.println(str);
        }
        System.out.println("====================");
        stringList.remove(1);
        stringList.remove(2);
        System.out.println(stringList.size());
        for (String str1:stringList) {
            System.out.println(str1);
        }

    }
}
