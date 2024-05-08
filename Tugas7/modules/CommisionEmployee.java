package Modules;
import java.time.LocalDate;

public class CommisionEmployee extends Employee {
    private double grossSales; //penjualan/minggu
    private double commisionRate; //komisi
    public CommisionEmployee(String name, String noKTP, LocalDate tanggalLahir,double sales, double rate) {
        super (name, noKTP, tanggalLahir);
        setGrossSales (sales);
        setCommisionRate(rate);
    }
    public void setGrossSales(double sales) {
        grossSales = sales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommisionRate (double rate) {
        commisionRate = rate;
    }
    public double getCommisionRate() {
        return commisionRate;
    }
    public double earnings() {
        return getCommisionRate() * getGrossSales();
    }
    public String toString() {
        return String.format("Commision employee : "+super.toString()+"\ngross"+getGrossSales()+"\ncommision rate "+getCommisionRate());
    }
}