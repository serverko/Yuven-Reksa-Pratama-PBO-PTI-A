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
}