package Task.Customers;

//id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
//Номер банковского счета.
public class App {

    public static void main(String[] args) {
        Customer[] customers = new Customer[5];

        customers[0] = new Customer(1, "Степоненко", "Мкас", "Александрович", "Гомель", 548796, 135852);
        customers[1] = new Customer(1, "Гуз", "Петя", "Петрович", "Жлобин", 548796, 155852);
        customers[2] = new Customer(1, "Дуб", "Коля", "Иван", "Минск", 548796, 205852);
        customers[3] = new Customer(1, "Керн", "Вова", "Михаилович", "Кирово", 548796, 135852);
        customers[4] = new Customer(1, "Аупкин", "Дима", "Эдуардович", "Брест", 548796, 205852);

        SortCustomers.sortCustomers(customers);

        System.out.println("Список покупателей поподающих в диопозон");
        DiopozonCreditCard.diopozonCreditCard(100000,140000,customers);

    }

}
