package Tugas8.src;

class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
    
    public double getUpah() {
        return upah;
    }

    @Override
    double gaji() {
        return upah;
    }
}