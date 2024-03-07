import java.util.ArrayList;
import java.util.List;

public class Penulis {
    private String nama;
    private List<String> kategori;

    public Penulis(String name) {
        this.nama = name;
        this.kategori = new ArrayList<>();
    }

    public void addCategory(String kategoribuku) {
        kategori.add(kategoribuku);
    }

    public String getNama() {
        return nama;
    }

    public List<String> getKategori() {
        return kategori;
    }

    public void displayMessage() {
        System.out.println("Nama Penulis: " + nama);
        System.out.println("Kategori Buku yang Ditulis: " + kategori);
    }
}