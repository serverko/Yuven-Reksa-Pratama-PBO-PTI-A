public class BukuPerpus {
    private String judul;
    private String penulis;
    private int tahun;
    private boolean tersedia;

    public BukuPerpus(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
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