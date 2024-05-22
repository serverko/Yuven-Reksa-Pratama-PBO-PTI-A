package Praktikum;

class PermanentEmployee extends Employee {
    private Integer bonus;

    public PermanentEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, Integer bonus) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Employee Type: Permanent");
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public void displayEmployeeBonus() {
        System.out.println("Bonus: " + bonus);
    }
}
