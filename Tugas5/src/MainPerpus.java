import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {
        // obyek kelas Buku
        BukuPerpus buku = new BukuPerpus("Janji Palsu", "Baskara Putra", 2023);
        // obyek kelas Pengunjung
        Pengunjung pengunjung = new Pengunjung("Yuven", 235150600);
        // obyekl kelas Penjaga
        Penjaga penjaga = new Penjaga("Bayu", 35);

        // display info buku
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Tahun Terbit: " + buku.getTahun());
        System.out.println("Status Ketersediaan: Tidak tersedia");

        // method void Membaca 
        pengunjung.Membaca();

        // Menampilkan informasi pengunjung
        System.out.println("\nInformasi Pengunjung :");
        System.out.println("Nama : " + pengunjung.getNama());
        System.out.println("NIM : " + pengunjung.getNIM());

        // method void berjaga
        penjaga.Berjaga();

        // input utk Penjaga
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan rak buku yang ingin dibersihkan oleh penjaga: ");
        String rakBuku = scanner.nextLine();

        // Method Membersihkan
        penjaga.Membersihkan(rakBuku);

        // Method void main Zuma
        penjaga.BermainZuma();

        scanner.close();
    }
}