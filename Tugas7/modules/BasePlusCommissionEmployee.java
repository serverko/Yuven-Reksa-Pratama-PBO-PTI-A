package Modules;
import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommisionEmployee {
    private double baseSalary; //gaji pokok/minggu
    public BasePlusCommissionEmployee (String name, String noKTP, LocalDate tanggalLahir, double sales, double rate, double salary) {
        super (name, noKTP, tanggalLahir, sales, rate);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    public String toString() {
        return String.format("Base-salaried "+super.toString()+"\nbase salary "+getBaseSalary());
    }
}