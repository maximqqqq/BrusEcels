package Task.TaskStudent;

public class App {

    public static void main(String[] args) {
        Student[] student = new Student[6];
        student[0] = new Student("Steponenko", "Maxim", 1989, "Gomel", "4455", "MTF", 3);
        student[1] = new Student("Korsun", "Kola", 1990, "Minsk", "4433", "MSF", 1);
        student[2] = new Student("Guz", "Misha", 1958, "Grodno", "22225", "MTF", 2);
        student[3] = new Student("Popkin", "Dima", 2000, "Jlobin", "45685", "TAF", 3);
        student[4] = new Student("Kon", "Igor", 1995, "Kirovo", "0245", "SIS", 3);
        student[5] = new Student("Kors", "Ko", 1990, "Brest", "4795", "MSF", 2);

        System.out.println("|List Students for enter facultet|");
        for (Student s : student) {
            s.showStudentFacultet("MTF");
        }
        System.out.println("===================================");
        System.out.println("Facultet MTF");
        for (Student ss : student) {
            ss.ShowAllStudentForMTF();
        }
        System.out.println("Facultet MSF");
        for (Student ss : student) {
            ss.ShowAllStudentForMSF();
        }
        System.out.println("Facultet TAF");
        for (Student ss : student) {
            ss.ShowAllStudentForTAF();
        }
        System.out.println("Facultet SIS");
        for (Student ss : student) {
            ss.ShowAllStudentForSIS();
        }
        System.out.println("==================");
        System.out.println("List Students was born before year");
        for (Student sss:student) {
            sss.findBethdey(1995);
        }

    }
}
