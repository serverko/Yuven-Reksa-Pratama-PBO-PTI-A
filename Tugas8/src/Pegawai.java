package Tugas8.src;

abstract class Pegawai {

    protected String nama;
    protected String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }
    
    public String getNoKTP() {
        return noKTP;
    }

    abstract double gaji();

    @Override // method tostring
    public String toString() {
        return "Nama: " + nama + "\nNo. KTP: " + noKTP;
    }
}