package Tugas8.src;

public class Main {
    public static void main(String[] args) {
        Pegawai[] pegawaiList = new Pegawai[9];
        pegawaiList[0] = new PegawaiTetap("Widodo", "123456789", 5000000);
        pegawaiList[1] = new PegawaiTetap("Messi", "112233", 10000000);
        pegawaiList[2] = new PegawaiTetap("Haaland", "99887766", 15000000);

        pegawaiList[3] = new PegawaiHarian("Denis", "987654321", 20000, 45);
        pegawaiList[4] = new PegawaiHarian("Ibrahimovic", "00776633", 10000, 10);
        pegawaiList[5] = new PegawaiHarian("Teddy", "1133546987", 300000, 35);

        pegawaiList[6] = new Sales("Timothy Donald", "2151708000", 10000000, 0.5);
        pegawaiList[7] = new Sales("Lo Kheng Hong", "9999999", 10000000, 0.1);
        pegawaiList[8] = new Sales("Doddy Prayogo", "3564198830001", 50000, 0.2);

        for (Pegawai pegawai : pegawaiList) {
            // periksa tipe
            if (pegawai instanceof PegawaiTetap) {
                PegawaiTetap tetap = (PegawaiTetap) pegawai;
                System.out.println("Detail Pegawai Tetap:");
                System.out.println(tetap);
                System.out.println("Gaji: " + tetap.gaji());
            } else if (pegawai instanceof PegawaiHarian) {
                PegawaiHarian harian = (PegawaiHarian) pegawai;
                System.out.println("Detail Pegawai Harian:");
                System.out.println(harian);
                System.out.println("Gaji: " + harian.gaji());
            } else if (pegawai instanceof Sales) {
                Sales sales = (Sales) pegawai;
                System.out.println("Detail Sales:");
                System.out.println(sales);
                System.out.println("Gaji: " + sales.gaji());
            }
            System.out.println("-----------------------------");
        }
    }
}