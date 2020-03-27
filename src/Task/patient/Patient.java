package Task.patient;

public class Patient {

    private int id;
    private String lostName;
    private String name;
    private String otchestvo;
    private String address;
    private int number;
    private int numbMedCard;
    private String diagnoz;

    public Patient() {
    }

    public Patient(int id, String lostName, String name, String otchestvo, String address, int number, int numbMedCard, String diagnoz) {
        this.id = id;
        this.lostName = lostName;
        this.name = name;
        this.otchestvo = otchestvo;
        this.address = address;
        this.number = number;
        this.numbMedCard = numbMedCard;
        this.diagnoz = diagnoz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLostName() {
        return lostName;
    }

    public void setLostName(String lostName) {
        this.lostName = lostName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumbMedCard() {
        return numbMedCard;
    }

    public void setNumbMedCard(int numbMedCard) {
        this.numbMedCard = numbMedCard;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lostName='" + lostName + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", numbMedCard=" + numbMedCard +
                ", diagnoz='" + diagnoz + '\'' +
                '}';
    }
}
