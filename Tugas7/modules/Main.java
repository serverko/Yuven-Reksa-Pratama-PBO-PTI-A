package Modules;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", LocalDate.of(1999, 5, 8), 800); // "Daniel",
                                                                                                                  // "135",
                                                                                                                  // 800.00
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", LocalDate.of(2000, 10, 15), 16.75, 40); // "Karina",
                                                                                                                    // "234",
                                                                                                                    // 16.75,
                                                                                                                    // 40
        CommisionEmployee commissionEmployee = new CommisionEmployee("Bondan", "145", LocalDate.of(2001, 2, 20), 10000,
                .06); // "Keanu", "145", 10000, .06
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234",
                LocalDate.of(2001, 2, 20), 5000, .04, 300); // "Bondan", "234", 5000, .04, 300
        
        ProductionEmployee productionEmployee = new ProductionEmployee("Jamal", "321", LocalDate.of(2005, 7, 15), 2.50, 1000);

        System.out.println("Employees diproses secara terpisah :\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan:", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[5];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee;
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) { // Base ga kapital
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji  pokok  setelah  dinaikkan  10%%  : $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
        Employee[] employees2 = { salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee };
        for (Employee employee : employees) {
            double earnings = employee.earnings();
            // cek ultah?
            if (LocalDate.now().getMonth() == employee.getTanggalLahir().getMonth()
                    && LocalDate.now().getDayOfMonth() == employee.getTanggalLahir().getDayOfMonth()) {
                earnings += 100000; // tambahan 100k kalo ultah
            }
            System.out.printf("Nama: %s\nPendapatan: $%,.2f\n", employee.getName(), earnings);
        }
    }
}