public class BukuPerpus {
    private String judul;
    private String penulis;
    private int tahun;
    private boolean tersedia;

    // C1
    public BukuPerpus(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.tersedia = true;
    }

    // C2
    public BukuPerpus(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = 0;
        this.tersedia = true;
    }

    // C3
    public BukuPerpus(String judul) {
        this.judul = judul;
        this.penulis = "Penulis Tidak Diketahui";
        this.tahun = 0;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public boolean isTersedia() {
        return tersedia;
    }
}