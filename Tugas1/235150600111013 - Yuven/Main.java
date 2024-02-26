import java.util.Scanner;

public class Main {
    static String[] nama = new String[24];
    static String[] kunci = new String[24];
    static int jumlahpengguna = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean SudahLogin = false;
        while (true) {
            if (!SudahLogin) {
                System.out.println("=== Sistem Broadcast Pengumuman ===");
                System.out.println("1. Daftar");
                System.out.println("2. Masuk");
                System.out.println("3. Keluar");
                System.out.print("Pilih tindakan (angka): ");
                int tindakan = scanner.nextInt();
                scanner.nextLine();
                switch (tindakan) {
                    case 1:
                        SignUp(scanner);
                        break;
                    case 2:
                        SudahLogin = Login(scanner);
                        break;
                    case 3:
                        System.out.println("Berhasil keluar dari program.");
                        return;
                    default:
                        System.out.println("Pilihan invalid!");
                }
            } else {
                System.out.println("Berhasil masuk!");
                System.out.println("Berikut merupakan pengumuman jadwal kelas yang tersedia");
                TampilJadwal();
                System.out.println("1. Keluar");
                System.out.print("Pilih tindakan (angka): ");
                int tindakan = scanner.nextInt();
                scanner.nextLine();
                if (tindakan == 1) {
                    SudahLogin = false;
                } else {
                    System.out.println("Pilihan invalid");
                }
            }
        }
    }

    static void SignUp(Scanner input) {
        System.out.print("Masukkan username (NIM): ");
        String username = input.nextLine();
        System.out.print("Masukkan password (min 6 karakter): ");
        String password = input.nextLine();
        if (password.length() < 6) {
            System.out.println("Password harus setidaknya 6 karakter!");
            return;
        }
        nama[jumlahpengguna] = username;
        kunci[jumlahpengguna] = password;
        jumlahpengguna++;
        System.out.println("Berhasil terdaftar!");
    }

    static boolean Login(Scanner input) {
        System.out.print("Masukkan username (NIM): ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        for (int i = 0; i < jumlahpengguna; i++) {
            if (nama[i].equals(username) && kunci[i].equals(password)) {
                return true;
            }
        }
        System.out.println("Username atau password tidak valid!");
        return false;
    }

    static void TampilJadwal() {
        String[][] jadwal = {
            {"Senin", "07.00-08.40", "Bahasa Indonesia", "F2.1"},
            {"Senin", "12.50-14.30", "Sistem Operasi Komputer", "G1.4"},
            {"Senin", "14.45-16.25", "Pancasila", "F3.18"},
            {"Selasa", "07.00-08.40", "Sistem Operasi Komputer", "F3.2"},
            {"Selasa", "09.30-12.00", "Matematika Komputasi", "F4.9"},
            {"Selasa", "12.50-14.30", "Pemrograman Berorientasi Objek", "G1.6"},
            {"Rabu", "07.00-08.40", "Pemrograman Berbasis Objek", "F2.6"},
            {"Rabu", "09.30-12.00", "Statistika Dasar", "F4.2"}
        };
        for (String[] entry : jadwal) {
            System.out.println(entry[0] + " - " + entry[1] + " - " + entry[2] + " - " + entry[3]);
        }
    }
}