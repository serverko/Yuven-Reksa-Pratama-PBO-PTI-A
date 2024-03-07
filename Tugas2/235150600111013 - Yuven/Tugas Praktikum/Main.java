import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Buku> books = new ArrayList<>();
        List<Penulis> authors = new ArrayList<>();

        // info buku
        books.add(new Buku("Introduction to Java", "Daniel Liang", "Teknologi"));
        books.add(new Buku("Filsafari", "Plato", "Filsafat"));
        books.add(new Buku("Sejarah Semesta", "A. Yani", "Sejarah"));
        books.add(new Buku("Agama untuk Perguruan Tinggi", "Agustinus & Fransiskus", "Agama"));
        books.add(new Buku("Perkembangan Anak", "Jean Piaget", "Psikologi"));
        books.add(new Buku("Marxisme", "Karl Marx", "Politik"));
        books.add(new Buku("Anime", "Lee", "Fiksi"));

        // nama penulis
        authors.add(new Penulis("Daniel Liang"));
        authors.add(new Penulis("Plato"));
        authors.add(new Penulis("A. Yani"));
        authors.add(new Penulis("Agustinus & Fransiskus"));
        authors.add(new Penulis("Jean Piaget"));
        authors.add(new Penulis("Karl Marx"));
        authors.add(new Penulis("Lee"));

        // cocokin kategori buku sama penulis
        for (Buku buku : books) {
            for (Penulis ciptaan : authors) {
                if (ciptaan.getNama().equals(buku.getPenulis())) {
                    ciptaan.addCategory(buku.getKategori());
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("============");
            System.out.println("Pilihan:");
            System.out.println("1. Tampilkan semua judul buku");
            System.out.println("2. Informasi semua Penulis");
            System.out.println("3. Informasi semua Buku");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (angka): ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Semua Judul Buku:");
                    for (Buku book : books) {
                        System.out.println(book.getJudul());
                    }
                    break;
                case 2:
                    System.out.println("Informasi semua Penulis:");
                    for (Penulis author : authors) {
                        author.displayMessage();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Informasi semua Buku:");
                    for (Buku book : books) {
                        book.displayMessage();
                        System.out.println();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}