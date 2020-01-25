package Part2;


import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        File f = new File("d:\\Projects\\BrusEcels\\src\\Part2\\App.txt");

        if (f.exists()) {
            System.out.println("айл " + f.getName() + " существует");

            if (f.isFile()){
                System.out.println("Имя : "+f.getName());
                System.out.println("Путь : "+ f.getPath());
                System.out.println("Размер файла : "+f.length());
                System.out.println("ткрыт для чтения : "+f.canRead());

            }

        } else {
            System.out.println("айл " + f.getName() + "не существует");
        }

        try {
            if (f.createNewFile()){
                System.out.println("File "+f.getName()+" CREATE");
            }
        }catch (IOException e){
            System.err.println(e);

        }

    }
}
