package Modules;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double salary) {
        super(name, noKTP, tanggalLahir);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return getWeeklySalary();
    }
    public String toString() {
        return String.format("Salaried employee : "+ super.toString()+ "\nweekly salary : "+ getWeeklySalary());
    }
}