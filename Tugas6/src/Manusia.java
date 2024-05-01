package Tugas6.src;

public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true laki-laki, false perempuan
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) { // true laki-laki
                return 25;
            } else { // false perempuan
                return 20;
            }
        } else {
            return 15; // belum nikah
        }
    }

    public double getPendapatan() {
        return 1000;
    }

    @Override
    public String toString() {
        String jenis = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + ", NIK: " + nik + ", Jenis Kelamin: " + jenis + ", Pendapatan: $" + getPendapatan();
    }
}
