public class Pengunjung {
    private String nama;
    private int nim;

    public Pengunjung(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNIM() {
        return nim;
    }
   
    public void Membaca() {
        System.out.println(nama + " sedang membacanya di perpustakaan");
    }
    // O1
    public void Membaca(String judulBuku) {
        System.out.println(nama + " sedang membaca buku dengan judul: " + judulBuku);
    }

    // O2
    public void Membaca(String judulBuku, String penulis) {
        System.out.println(nama + " sedang membaca buku dengan judul: " + judulBuku + " karya " + penulis);
    }

    // O3
    public void Membaca(String judulBuku, int tahunTerbit) {
        System.out.println(nama + " sedang membaca buku dengan judul: " + judulBuku + " terbit tahun " + tahunTerbit);
    }
    // Metode instans yang mengembalikan tipe data class itu sendiri
    public Pengunjung getPengunjung() {
        return this;
    }
}