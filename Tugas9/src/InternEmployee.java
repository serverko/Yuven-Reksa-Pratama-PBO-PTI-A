package Praktikum;

class InternEmployee extends Employee implements Contract {
    private Integer durationOfContract;

    public InternEmployee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices, Integer durationOfContract) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.durationOfContract = durationOfContract;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Employee Type: Intern");
    }

    @Override
    public Integer getContractDuration() {
        return durationOfContract;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Attending training session");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Contract duration: " + durationOfContract + " months");
    }

    public Integer getDurationOfContract() {
        return durationOfContract;
    }

    public void setDurationOfContract(Integer durationOfContract) {
        this.durationOfContract = durationOfContract;
    }
}