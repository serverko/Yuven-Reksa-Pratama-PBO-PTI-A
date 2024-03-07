public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan();
    }

    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

    private double rubahSekon(double w) {
        return waktu = w * 3600;
    }

    private void rubahKecepatan() {
        kecepatan = (int) Math.round((kecepatan * 1000) / 3600);
    }

    public void hitungJarak() {
        jarak = ((kecepatan * 3.6) * (waktu /3600));
    }

    public void displayMessage() {
        System.out.println("Mobil anda bermerek : " + manufaktur);
        System.out.println("Mempunyai plat nomor : " + noPlat);
        System.out.println("Serta memiliki warna : " + warna);
        System.out.println("Dan mampu menempuh kecepatan : " + kecepatan + " m/s");
        System.out.println("Waktu : " + waktu + " detik");
        System.out.println("Jarak yang dapat ditempuh oleh mobil: " + jarak + " km");
    }
}