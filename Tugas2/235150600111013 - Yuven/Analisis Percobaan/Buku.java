public class Buku {

    private int jumlah;
    private double kecepatan;

    public Buku(int jumlahHlm, double kecepatantulis) {
        this.jumlah = jumlahHlm;
        this.kecepatan = kecepatantulis;
    }

    public double lamaSelesai() {
        return jumlah / kecepatan;
    }

    public static void main(String[] args) {
        Buku bukuTulis = new Buku(100, 0.5);
        double lamaSelesai = bukuTulis.lamaSelesai();
        System.out.println("Lamanya menyelesaikan buku: " + lamaSelesai + " hari");
    }
}