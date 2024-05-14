package Tugas8.src;

class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }
    
    public double getKomisi() {
        return komisi;
    }
    
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    double gaji() {
        return penjualan * komisi;
    }
}