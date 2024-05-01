package Tugas6.src;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Manusia manusia1 = new Manusia("Alul", true, "123456789", false);
        Manusia manusia2 = new Manusia("Dewi", false, "987654321", false);
        Manusia manusia3 = new Manusia("Indra", true, "112233445", false);

        System.out.println("Manusia : ");
        System.out.println("a. " + manusia1);
        System.out.println("b. " + manusia2);
        System.out.println("c. " + manusia3);

        MahasiswaFILKOM mahasiswaA = new MahasiswaFILKOM("Alul", true, "123456789", false, "16515060000001", 3.5);
        MahasiswaFILKOM mahasiswaB = new MahasiswaFILKOM("Dewi", false, "987654321", false, "17515070000012", 3.3);
        MahasiswaFILKOM mahasiswaC = new MahasiswaFILKOM("Indra", true, "112233445", false, "18515040000002", 3.7);

        System.out.println("\nMahasiswa FILKOM : ");
        System.out.println("a. " + mahasiswaA);
        System.out.println("b. " + mahasiswaB);
        System.out.println("c. " + mahasiswaC);

        Pekerja pekerja1 = new Pekerja("David", true, "111111", true, 5000, LocalDate.of(2019, 1, 1), 2);
        Pekerja pekerja2 = new Pekerja("Rina", false, "222222", true, 6000, LocalDate.of(2013, 1, 1), 0);
        Pekerja pekerja3 = new Pekerja("Samuel", true, "333333", false, 7000, LocalDate.of(2000, 1, 1), 10);

        System.out.println("\nPekerja : ");
        System.out.println("a. " + pekerja1);
        System.out.println("b. " + pekerja2);
        System.out.println("c. " + pekerja3);

        Manager manager = new Manager("Timothy", true, "444444", true, 7500, LocalDate.of(2009, 1, 1), 0, "Finance");

        System.out.println("\nManager : ");
        System.out.println(manager);
    }
}