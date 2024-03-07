import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Buku> books = new ArrayList<>();
        List<Penulis> authors = new ArrayList<>();

        // info buku
        books.add(new Buku("Introduction to Java", "Daniel Liang", "Teknologi"));
        books.add(new Buku("Introduction to Phyton", "Daniel Lio", "Teknologi"));
        books.add(new Buku("Introduction to SQL", "Daniel Liam", "Teknologi"));
        books.add(new Buku("Introduction to C", "Soyuz", "Teknologi"));
        books.add(new Buku("Introduction to Obsidian", "Steve", "Teknologi"));

        books.add(new Buku("Filsafari", "Plato", "Filsafat"));
        books.add(new Buku("Filsamari", "Steve", "Filsafat"));
        books.add(new Buku("Filsafat Pancasila", "Alwan", "Filsafat"));
        books.add(new Buku("Filosofia", "Aristoteles", "Filsafat"));
        books.add(new Buku("Ilmu Filsafat", "Socrates", "Filsafat"));

        books.add(new Buku("Sejarah Semesta", "A. Yani", "Sejarah"));
        books.add(new Buku("Sejarah Indonesia", "Sumardi", "Sejarah"));
        books.add(new Buku("Sejarah Jawa", "Jaka Tingkir", "Sejarah"));
        books.add(new Buku("Kemerdekaan", "Bung Tomo", "Sejarah"));
        books.add(new Buku("Brawijaya", "Brawijaya", "Sejarah"));

        books.add(new Buku("Agama Katolik untuk Perguruan Tinggi", "Rm. Agustinus & Fransiskus", "Agama"));
        books.add(new Buku("Agama Katolik", "Romo", "Agama"));
        books.add(new Buku("Agama Kristen Protestan", "Pendeta", "Agama"));
        books.add(new Buku("Agama Islam", "Imam", "Agama"));
        books.add(new Buku("Agama Hindu", "Purohita", "Agama"));
        books.add(new Buku("Agama Buddha", "Bhiksu", "Agama"));
        books.add(new Buku("Agama Kong Hu Cu", "Xue Shi", "Agama"));

        books.add(new Buku("Perkembangan Anak", "Jean Piaget", "Psikologi"));
        books.add(new Buku("Perkembangan Mental", "Jean Piaget", "Psikologi"));
        books.add(new Buku("Masalah Mental", "Ivan Pavlov", "Psikologi"));
        books.add(new Buku("Psikologi Ekonomi", "Plato", "Psikologi"));
        books.add(new Buku("Manusia dan Pikiran", "Mayer", "Psikologi"));

        books.add(new Buku("Marxisme", "Karl Marx", "Politik"));
        books.add(new Buku("Negara Politik", "Mahfud", "Politik"));
        books.add(new Buku("Politikisme", "Anwar Usman", "Politik"));
        books.add(new Buku("Peradaban", "Baskara Putra", "Politik"));
        books.add(new Buku("Kami Belum Tentu", "Baskara Putra", "Politik"));

        books.add(new Buku("Laut Bercerita", "Lee", "Fiksi"));
        books.add(new Buku("Naruto", "Kakashi", "Fiksi"));
        books.add(new Buku("Boruto", "Sasuke", "Fiksi"));
        books.add(new Buku("One Piece", "Luffy", "Fiksi"));
        books.add(new Buku("Laskar Pelangi", "Messi", "Fiksi"));


        // nama penulis dan kategori buku
        String[] penulisDanKategori = {
            "Daniel Liang,Teknologi",
            "Daniel Lio,Teknologi",
            "Daniel Liam,Teknologi",
            "Soyuz,Teknologi",
            "Steve,Teknologi"+" Filsafat",
            "Steve,Filsafat",
            "Plato,Filsafat"+" Psikologi",
            "Alwan,Filsafat",
            "Aristoteles,Filsafat",
            "Socrates,Filsafat",
            "A. Yani,Sejarah",
            "Sumardi,Sejarah",
            "Jaka Tingkir,Sejarah",
            "Bung Tomo,Sejarah",
            "Brawijaya,Sejarah",
            "Rm. Agustinus & Fransiskus,Agama",
            "Romo,Agama",
            "Pendeta,Agama",
            "Imam,Agama",
            "Purohita,Agama",
            "Bhiksu,Agama",
            "Xue Shi,Agama",
            "Jean Piaget,Psikologi",
            "Ivan Pavlov,Psikologi",
            "Mayer,Psikologi",
            "Karl Marx,Politik",
            "Mahfud,Politik",
            "Anwar Usman,Politik",
            "Baskara Putra,politik",
            "Lee,Fiksi",
            "Kakashi,Fiksi",
            "Sasuke,Fiksi",
            "Luffy,Fiksi",
            "Messi,Fiksi"
        };

        for (String infoPenulis : penulisDanKategori) {
            String[] info = infoPenulis.split(",");
            Penulis penulis = new Penulis(info[0]);
            penulis.addCategory(info[1]);
            authors.add(penulis);
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