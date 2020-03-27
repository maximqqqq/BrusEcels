package Task.patient;

import Task.patient.Patient;

public class MedCartaFind {
    public static void findPatientCard(int a, int b, Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (a<patients[i].getNumbMedCard()&&patients[i].getNumbMedCard()<b){
                System.out.println(patients[i].getLostName()+"  "+patients[i].getName()+"  "+patients[i].getOtchestvo());
            }
        }
    }
}
