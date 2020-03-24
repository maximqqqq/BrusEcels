package Part4_Potoki;

class SomeTheadd extends Thread{
    public void run(){
        System.out.println("Tread");
    }
}

public class App3 {
    public static void main(String[] args) throws InterruptedException {
        SomeTheadd someTheadd = new SomeTheadd();
        someTheadd.start();
        Thread.sleep(3000);//Позволяет заснуть
        System.out.println("Main");
    }
}
