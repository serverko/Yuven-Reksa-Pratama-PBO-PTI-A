import java.util.Scanner;

public class SwalayanTiny {
    public static void main(String[] args) {

        Customer customer = new Customer("3801234567", "Timothy Donald", 500000, 123456);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Selamat datang di Swalayan Tiny!");
            System.out.print("Masukkan nomor pelanggan (10 digit) : ");
            String noAkun = input.nextLine();

            System.out.print("Masukkan PIN Anda : ");
            int pin = input.nextInt();
            input.nextLine();

            if (customer.cekPin(pin)) {
                System.out.println("Selamat datang, " + customer.getNama());
                System.out.println("Saldo Anda saat ini: Rp " + customer.getSaldo());

                System.out.println("Menu transaksi:");
                System.out.println("1. Pembelian");
                System.out.println("2. Top Up");
                System.out.println("3. Keluar");

                System.out.print("Pilih menu (angka) : ");
                int pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan jumlah pembelian: Rp ");
                        double jumlah = input.nextDouble();
                        input.nextLine();

                        if (customer.pembelian(jumlah, pin)) {
                            System.out.println("Pembelian berhasil!");
                            System.out.println("Saldo Anda saat ini: Rp " + customer.getSaldo());
                        } else {
                            System.out.println("Pembelian gagal. Pastikan saldo mencukupi.");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah top up: Rp ");
                        double jumlahTopUp = input.nextDouble();
                        input.nextLine();

                        if (customer.topUp(jumlahTopUp, pin)) {
                            System.out.println("Top up berhasil!");
                            System.out.println("Saldo Anda saat ini: Rp " + customer.getSaldo());
                        } else {
                            System.out.println("Top up gagal. Pastikan PIN benar atau coba lagi.");
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("Terima kasih telah berbelanja di Swalayan Tiny!");
                        System.out.println();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        System.out.println();
                }
            } else {
                System.out.println("Autentikasi gagal. Pastikan nomor pelanggan dan PIN benar.");
                System.out.println();
            }
            // input.close();
        }
    }
}