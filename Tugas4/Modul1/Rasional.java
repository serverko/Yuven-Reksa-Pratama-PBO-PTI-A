package Tugas4.Modul1;

public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    // operator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    // operator <
    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    // operator <=
    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    // operator >=
    public boolean greaterThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // operator -
    public Rasional minus(Rasional A) {
        Rasional hasil = new Rasional();
        hasil.pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        hasil.penyebut = penyebut * A.penyebut;
        hasil.Sederhana();
        return hasil;
    }

    // operator *
    public Rasional kali(Rasional A) {
        Rasional hasil = new Rasional();
        hasil.pembilang = pembilang * A.pembilang;
        hasil.penyebut = penyebut * A.penyebut;
        hasil.Sederhana();
        return hasil;
    }

    // operator / dan !
    public Rasional bagi(Rasional A) {
        if (A.penyebut == 0) {
            throw new ArithmeticException("Dibagi dengan penyebut 0!");
        }
        Rasional hasil = new Rasional();
        hasil.pembilang = pembilang * A.penyebut;
        hasil.penyebut = penyebut * A.pembilang;
        hasil.Sederhana();
        return hasil;
    }

    // operator unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    // operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}