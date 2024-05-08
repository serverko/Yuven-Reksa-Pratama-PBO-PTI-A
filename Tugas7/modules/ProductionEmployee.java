package Modules;
import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private double upahPerBarang;
    private double jumlahBarangProduksi;

    public ProductionEmployee(String name, String noKTP, LocalDate tanggalLahir, double upahPerBarang, double jumlahBarangProduksi) {
        super(name, noKTP, tanggalLahir);
        this.upahPerBarang = upahPerBarang;
        this.jumlahBarangProduksi = jumlahBarangProduksi;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public double getJumlahBarangProduksi() {
        return jumlahBarangProduksi;
    }

    public void setJumlahBarangProduksi(double jumlahBarangProduksi) {
        this.jumlahBarangProduksi = jumlahBarangProduksi;
    }

    @Override
    public double earnings() {
        return upahPerBarang * jumlahBarangProduksi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah per Barang: $" + upahPerBarang + "\nJumlah Barang Produksi: " + jumlahBarangProduksi;
    }
}
