package Part4_Potoki;

class Some implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number - "+ i);
        }
    }
}

public class App2 {
    public static void main(String[] args) {
        Thread test1 = new Thread(new Some());
        Thread test2 = new Thread(new Some());

        test1.start();
        test2.start();
    }
}
