package Praktikum;

public class Main {
    public static void main(String[] args) {
        // buat invoice
        Invoice[] invoices = {
                new Invoice("Product A", 2, 10),
                new Invoice("Product B", 3, 15)
        };

        //obyek
        PermanentEmployee permanentEmployee = new PermanentEmployee(1001, "Budak Korporat", 2000, invoices, 500);
        PermanentEmployee permanentEmployee2 = new PermanentEmployee(1012, "Widodo", 5000000, invoices, 1000000);
        PermanentEmployee permanentEmployee3 = new PermanentEmployee(1013, "Messi", 500000, invoices, 1000);

        //output permanent
        Employee.displayEmployeeInfo(permanentEmployee);
        permanentEmployee.displayEmployeeType();
        permanentEmployee.displayEmployeeBonus();

        //output gaji terima permanen
        double totalPayable = permanentEmployee.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
        
        // Output informasi untuk setiap objek PermanentEmployee
        Employee.displayEmployeeInfo(permanentEmployee2);
        permanentEmployee2.displayEmployeeType();
        permanentEmployee2.displayEmployeeBonus();

        totalPayable = permanentEmployee2.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
        
        Employee.displayEmployeeInfo(permanentEmployee3);
        permanentEmployee3.displayEmployeeType();
        permanentEmployee3.displayEmployeeBonus();

        totalPayable = permanentEmployee3.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
        
        //obyek
        InternEmployee internEmployee = new InternEmployee(1999, "Nak Magang", 500, invoices, 3);
        InternEmployee internEmployee2 = new InternEmployee(2999, "Nak MSIB", 750, invoices, 6);
        InternEmployee internEmployee3 = new InternEmployee(3999, "Doni", 500, invoices, 9);

        // output intern
        Employee.displayEmployeeInfo(internEmployee);
        internEmployee.displayEmployeeType();
        internEmployee.trackContractDuration();

        // output terima intern
        totalPayable = internEmployee.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
        
        // Output informasi untuk setiap objek InternEmployee
        Employee.displayEmployeeInfo(internEmployee2);
        internEmployee2.displayEmployeeType();
        internEmployee2.trackContractDuration();

        totalPayable = internEmployee2.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
        
        Employee.displayEmployeeInfo(internEmployee3);
        internEmployee3.displayEmployeeType();
        internEmployee3.trackContractDuration();

        totalPayable = internEmployee3.getSalaryPerMonth();
        for (Invoice invoice : invoices) {
            totalPayable -= invoice.getPayableAmount();
        }
        System.out.println("Total Salary after deduction: " + totalPayable);
    }
}
