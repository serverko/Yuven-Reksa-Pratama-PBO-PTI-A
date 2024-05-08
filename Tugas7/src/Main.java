package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KueJadi("Klepon", 3000, 3);
        kueArray[1] = new KueJadi("Kue Lumpur", 5000, 4);
        kueArray[2] = new KueJadi("Onde-onde", 4000, 6);
        kueArray[3] = new KueJadi("Kue lapis", 6000, 7);
        kueArray[4] = new KueJadi("Kue mangkok", 4500, 3);
        kueArray[5] = new KueJadi("Bolu Kukus", 15000, 5);
        kueArray[6] = new KueJadi("Kue mangkok", 4500, 4);
        kueArray[7] = new KueJadi("Dadar Gulung", 3500, 4);
        kueArray[8] = new KueJadi("Lapis Legit", 5000, 8);
        kueArray[9] = new KueJadi("Putu Ayu", 2500, 1);

        kueArray[10] = new KueBasi("Kue bolu", 15000, 1);
        kueArray[11] = new KueBasi("Kue talam", 7000, 2);
        kueArray[12] = new KueBasi("Kue cubit", 1000, 1);
        kueArray[13] = new KueBasi("Kue Apem", 5000, 1);
        kueArray[14] = new KueBasi("Kue lumpur", 5000, 1);
        kueArray[15] = new KueBasi("Kue kastangel", 12000, 2);
        kueArray[16] = new KueBasi("Kue sus", 3000, 1);

        kueArray[17] = new KuePesanan("Klepon", 3000, 1);
        kueArray[18] = new KuePesanan("Kue Bolu", 15000, 2);
        kueArray[19] = new KuePesanan("Putu Ayu", 2500, 1);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan semua kue");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("7. Keluar");

            System.out.print("Pilih menu (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Daftar Kue:");
                    for (Kue kue : kueArray) {
                        if (kue != null) {
                            System.out.println(kue);
                        }
                    }
                    break;
                case 2:
                    double totalHargaSemuaKue = 0;
                    for (Kue kue : kueArray) {
                        if (kue != null) {
                            totalHargaSemuaKue += kue.hitungHarga();
                        }
                    }
                    System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);
                    break;
                case 3:
                    double totalHargaKuePesanan = 0;
                    double totalBeratKuePesanan = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KuePesanan) {
                            totalHargaKuePesanan += kue.hitungHarga();
                            totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
                        }
                    }
                    System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
                    System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);
                    break;
                case 4:
                    double totalHargaKueJadi = 0;
                    double totalJumlahKueJadi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueJadi) {
                            totalHargaKueJadi += kue.hitungHarga();
                            totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
                        }
                    }
                    System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
                    System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
                    break;
                case 5:
                    double hargaTerbesar = Double.MIN_VALUE;
                    Kue kueTerbesar = null;
                    for (Kue kue : kueArray) {
                        if (kue != null && kue.hitungHarga() > hargaTerbesar) {
                            hargaTerbesar = kue.hitungHarga();
                            kueTerbesar = kue;
                        }
                    }
                    if (kueTerbesar != null) {
                        System.out.println("Kue dengan Harga Terbesar: " + kueTerbesar);
                    } else {
                        System.out.println("Tidak ada kue dalam array.");
                    }
                    break;
                case 6:
                    double totalHargaKueBasi = 0;
                    int totalLamaHariKueBasi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalHargaKueBasi += kue.hitungHarga();
                            totalLamaHariKueBasi += ((KueBasi) kue).getLamaHari();
                        }
                    }
                    System.out.println("Total Harga Kue Basi: " + totalHargaKueBasi);
                    System.out.println("Total Lama Hari Kue Basi: " + totalLamaHariKueBasi);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}