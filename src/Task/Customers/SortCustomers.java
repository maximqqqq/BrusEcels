package Task.Customers;

import java.util.Arrays;
import java.util.Comparator;

public class SortCustomers {
    //Сортировка массива объектов по фамилии
    public static void sortCustomers(Customer[] customers) {
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer a, Customer b) {
                return a.getLostName().compareTo(b.getLostName());
            }
        });
        System.out.println("Отсортированный массив");
        for (Customer cus:customers) {
            System.out.println(cus);
        }
    }
}
