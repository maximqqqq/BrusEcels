package Task.TaskStudent;

public class Student {

    private String surName;
    private String name;
    private int data;
    private String address;
    private String mobail;
    private String facultet;
    private int kurs;

    public Student() {
    }

    public Student(String surName, String name, int data, String address, String mobail, String facultet, int kurs) {
        this.surName = surName;
        this.name = name;
        this.data = data;
        this.address = address;
        this.mobail = mobail;
        this.facultet = facultet;
        this.kurs = kurs;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobail() {
        return mobail;
    }

    public void setMobail(String mobail) {
        this.mobail = mobail;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void showStudentFacultet(String str1){
        if (str1.equals(facultet)){
            System.out.println("Name: "+name+"  "+"SurName: "+surName);
        }
    }

    public void ShowAllStudentForMTF(){
        if (facultet.equals("MTF")){
            System.out.println("Name: "+name+" SurName: "+surName);
        }
    }

    public void ShowAllStudentForMSF(){
        if (facultet.equals("MSF")){
            System.out.println("Name: "+name+" SurName: "+surName);
        }
    }

    public void ShowAllStudentForTAF(){
        if (facultet.equals("TAF")){
            System.out.println("Name: "+name+" SurName: "+surName);
        }
    }

    public void ShowAllStudentForSIS(){
        if (facultet.equals("SIS")){
            System.out.println("Name: "+name+" SurName: "+surName);
        }
    }

    public void findBethdey(int i){
        if (i<data){
            System.out.println("Name: "+name+" SurName: "+surName);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", address='" + address + '\'' +
                ", mobail='" + mobail + '\'' +
                ", facultet='" + facultet + '\'' +
                ", kurs=" + kurs +
                '}';
    }
}
