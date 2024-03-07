import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //m1
        System.out.println("Masukkan data untuk mobil m1:");
        System.out.print("Masukkan kecepatan: ");
        int kecepatanM1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan manufaktur: ");
        String manufakturM1 = scanner.nextLine();
        System.out.print("Masukkan nomor plat: ");
        String noPlatM1 = scanner.nextLine();
        System.out.print("Masukkan warna: ");
        String warnaM1 = scanner.nextLine();
        System.out.println("Masukkan waktu dalam jam : ");
        double waktuM1 = scanner.nextDouble();

        Mobil m1 = new Mobil();
        m1.setKecepatan(kecepatanM1);
        m1.setManufaktur(manufakturM1);
        m1.setNoPlat(noPlatM1);
        m1.setWarna(warnaM1);
        m1.setWaktu(waktuM1);
        m1.hitungJarak();
        m1.displayMessage();
        System.out.println("================");

        //m2
        System.out.println("Masukkan data untuk mobil m2:");
        System.out.print("Masukkan kecepatan: ");
        int kecepatanM2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan manufaktur: ");
        String manufakturM2 = scanner.nextLine();
        System.out.print("Masukkan nomor plat: ");
        String noPlatM2 = scanner.nextLine();
        System.out.print("Masukkan warna: ");
        String warnaM2 = scanner.nextLine();
        System.out.println("Masukkan waktu dalam jam : ");
        double waktuM2 = scanner.nextDouble();

        Mobil m2 = new Mobil();
        m2.setKecepatan(kecepatanM2);
        m2.setManufaktur(manufakturM2);
        m2.setNoPlat(noPlatM2);
        m2.setWarna(warnaM2);
        m2.setWaktu(waktuM2);
        m2.hitungJarak();
        m2.displayMessage();
        System.out.println("================");
        scanner.close();

        /*merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");

        //menampilkan hasil perubahan
        m1.displayMessage(); */
    }
}