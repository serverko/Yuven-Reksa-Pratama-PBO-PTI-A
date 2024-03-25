package Tugas4.Modul1;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Malang", 20, 100.0, 80.0, 89.0);
        anna.displayMessage();

        System.out.println("===================");

        Student chris = new Student("Chris", "Kediri", 21, 70.0, 90.0, 60.0);
        chris.displayMessage();

        System.out.println("===================");

        anna.setAddress("Batu");
        anna.setAge(18);
        anna.displayMessage();

        System.out.println("===================");

        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
        Student.jumlahObjek();
    }
}