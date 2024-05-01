package Tugas6.src;
import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGaji() * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }
}