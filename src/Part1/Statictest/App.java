package Part1.Statictest;

public class App {
    public static void main(String[] args) {
        IncrementTable.increment();
        System.out.println(StaticTest.i);

        IncrementTable sf = new IncrementTable();
        sf.increment();
        System.out.println(StaticTest.i);
    }
}
