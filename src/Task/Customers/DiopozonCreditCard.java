package Task.Customers;

public class DiopozonCreditCard {

    public static void diopozonCreditCard(int a, int b,Customer[] customers){


        for (int i = 0; i < customers.length; i++) {
            if (a < customers[i].getNumberBankChek() && customers[i].getNumberBankChek()< b){
                System.out.println(customers[i].getLostName()+"  "+customers[i].getName()+"  "+customers[i].getOtchestvo());
            }

        }

    }
}
