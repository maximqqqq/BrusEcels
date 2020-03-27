package Task.Customers;

import java.util.Arrays;
import java.util.Comparator;

public class Customer{
    private int id;
    private String lostName;
    private String name;
    private String otchestvo;
    private String address;
    private int nuberCreditCard;
    private int numberBankChek;

    public Customer() {
    }

    public Customer(int id, String lostName, String name, String otchestvo, String address, int nuberCreditCard, int numberBankChek) {
        this.id = id;
        this.lostName = lostName;
        this.name = name;
        this.otchestvo = otchestvo;
        this.address = address;
        this.nuberCreditCard = nuberCreditCard;
        this.numberBankChek = numberBankChek;
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

    public int getNuberCreditCard() {
        return nuberCreditCard;
    }

    public void setNuberCreditCard(int nuberCreditCard) {
        this.nuberCreditCard = nuberCreditCard;
    }

    public int getNumberBankChek() {
        return numberBankChek;
    }

    public void setNumberBankChek(int numberBankChek) {
        this.numberBankChek = numberBankChek;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lostName='" + lostName + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", address='" + address + '\'' +
                ", nuberCreditCard=" + nuberCreditCard +
                ", numberBankChek=" + numberBankChek +
                '}';
    }
}
