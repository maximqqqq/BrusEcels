package Part3_Matrix;

public class App_Genereyt_Chees {
    public static void main(String[] args) {
//        int[][] array = new int[][];
        int[][] array = {{5,7,3,1},{8,6,2,9},{9,2,4,3}};

        for (int i = 0; i < 3; i++) {//Идем по строкам
            for (int j = 0; j < 4; j++) {//Идем по столбам
                System.out.print(" "+array[i][j]+" ");
            }
            System.out.println();//Перенос строки
        }

        //Шахматная строка
        String[][] chessBoat = new String[8][8];
        for (int i = 0; i < chessBoat.length; i++) {
            for (int j = 0; j < chessBoat[0].length; j++) {
                if ((i+j)%2==0){
                    chessBoat[i][j] = "X";
                }else {
                    chessBoat[i][j] = "O";
                }
                System.out.print(" "+chessBoat[i][j]+" ");
            }
            System.out.println();
        }


    }
}
