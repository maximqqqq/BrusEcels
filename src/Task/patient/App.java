package Task.patient;

//id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
//карты, Диагноз.
public class App {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient(1,"Степоненко","Макс","Алекс","Гомель",4433,23,"ОРВИ");
        patients[1] = new Patient(1,"Корсун","Саша","Анатол","Гомель",2241,8,"Короновирус");
        patients[2] = new Patient(1,"Гуз","Вова","Петрович","Минск",1144,14,"Диорея");
        patients[3] = new Patient(1,"Пупкин","Петя","Эдуардов","Кирово",5858,31,"ОРВИ");
        patients[4] = new Patient(1,"Булка","Коля","Игорев","Жлобин",2356,2,"Короновирус");
        System.out.println("Поиск по диагнозу");
        IsDiagnoz.findDiagnoz("Короновирус",patients);
        System.out.println("Поиск диопозона мед карты");
        MedCartaFind.findPatientCard(1,15,patients);
    }
}
