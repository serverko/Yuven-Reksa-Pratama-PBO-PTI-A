package Tugas6.src;
import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunBekerja >= 0 && tahunBekerja <= 5) {
            return gaji * 0.05;
        } else if (tahunBekerja > 5 && tahunBekerja <= 10) {
            return gaji * 0.10;
        } else {
            return gaji * 0.15;
        }
    }

    public double getTunjanganAnak() {
        return jumlahAnak * 20;
    }

    public double getPendapatan() {
        return gaji + getBonus() + getTunjanganAnak();
    }

    @Override
    public String toString() {
        return super.toString() + ", Tahun Masuk: " + tahunMasuk + ", Jumlah Anak: " + jumlahAnak + ", Gaji: $" + gaji;
    }
}