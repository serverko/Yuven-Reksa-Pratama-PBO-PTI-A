public class Buku {
    private String judul;
    private String penulis;
    private String kategori;

    public Buku(String judulbuku, String penulisbuku, String kategoribuku) {
        this.judul = judulbuku;
        this.penulis = penulisbuku;
        this.kategori = kategoribuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }

    public void displayMessage() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Kategori: " + kategori);
    }
}