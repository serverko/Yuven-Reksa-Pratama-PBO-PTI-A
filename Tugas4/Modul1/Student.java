package Tugas4.Modul1;

import java.util.Scanner;

public class Student {
    private static int banyakStudent = 0;
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    // private double average;
    public Student() {
        name = "";
        address = "";
        age = 0;
        banyakStudent++;
    }

    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        getAverage();
        banyakStudent++;
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang telah dibuat: " + banyakStudent);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("Beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        String status = statusAkhir() ? "Lulus" : "Remidi";
        System.out.println("Status Akhir: " + status);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan data untuk siswa ke-" + (i + 1) + ":");

            System.out.print("Nama: ");
            String name = scanner.nextLine();

            System.out.print("Alamat: ");
            String address = scanner.nextLine();

            System.out.print("Usia: ");
            int age = scanner.nextInt();

            System.out.print("Nilai Matematika: ");
            double mathGrade = scanner.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = scanner.nextDouble();

            System.out.print("Nilai Ilmu Pengetahuan: ");
            double scienceGrade = scanner.nextDouble();

            students[i] = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);
            scanner.nextLine();
        }

        System.out.println("===================");

        for (Student student : students) {
            student.displayMessage();
            System.out.println("===================");
        }

        scanner.close();
    }
}