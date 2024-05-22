package Praktikum;

abstract class Employee {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public abstract void displayEmployeeType();

    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("\nEmployee Information:");
        System.out.println("Registration Number: " + employee.getRegistrationNumber());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary per Month: " + employee.getSalaryPerMonth());
    }
}