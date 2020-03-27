package Task.patient;

public class IsDiagnoz {
    public static void findDiagnoz(String str,Patient[] patients){

        for (int i = 0; i <patients.length ; i++) {
            if (str.equals(patients[i].getDiagnoz())){
                System.out.println(patients[i].getLostName()+"  "+patients[i].getName()+"  "+patients[i].getOtchestvo());
            }
        }
    }
}
