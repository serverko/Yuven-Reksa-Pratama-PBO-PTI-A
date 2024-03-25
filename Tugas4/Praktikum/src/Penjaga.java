public class Penjaga {
    private String nama;
    private int usia;

    public Penjaga(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public Penjaga(String nama) {
        this.nama = nama;
        this.usia = 0;
    }
    public Penjaga(int usia) {
        this.nama = "Magang";
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public void Berjaga() {
        System.out.println("Penjaga " + nama + " sedang menjaga perpustakaan");
    }

    public void Membersihkan(String rakBuku) {
        System.out.println("Penjaga " + nama + " sedang membersihkan rak buku " + rakBuku);
    }

    public void BermainZuma() {
        System.out.println("Penjaga " + nama + " kemudian bermain Zuma di waktu luang");
    }
}