public class Customer {
    private String noAkun;
    private String Nama;
    private double Balance;
    private int pin;
    private int Percobaan;

    public Customer(String noAkun, String Nama, double Saldo, int pin) {
        this.noAkun = noAkun;
        this.Nama = Nama;
        this.Balance = Saldo;
        this.pin = pin;
        this.Percobaan = 0;
    }

    public String getNoAkun() {
        return noAkun;
    }

    public String getNama() {
        return Nama;
    }

    public double getSaldo() {
        return Balance;
    }

    public boolean pembelian(double jumlah, int inputPin) {
        if (inputPin != pin || Percobaan >= 3) {
            return false;
        }

        // cek saldo
        if (Balance < jumlah || jumlah < 10000) {
            return false;
        }

        double cashback = 0;
        if (noAkun.startsWith("38")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.05;
            }
        } else if (noAkun.startsWith("56")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.07;
            } else {
                cashback = jumlah * 0.02;
            }
        } else if (noAkun.startsWith("74")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.10;
            } else {
                cashback = jumlah * 0.05;
            }
        }

        // saldo akhir
        Balance -= jumlah;
        Balance += cashback;

        return true;
    }

    public boolean topUp(double jumlah, int inputPin) {
        if (inputPin != pin || Percobaan >= 3) {
            return false;
        }

        Balance += jumlah;
        return true;
    }

    public boolean cekPin(int pinInput) {
        if (pinInput == pin) {
            Percobaan = 0;
            return true;
        } else {
            Percobaan++;
            return false;
        }
    }
}