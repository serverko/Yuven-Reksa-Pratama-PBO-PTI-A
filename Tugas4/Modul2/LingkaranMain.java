package Tugas4.Modul2;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l= new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        Lingkaran l2 = new Lingkaran(4, 10);
        l2.displayMessage();
        Lingkaran Lstring = new Lingkaran("5", "10");
        Lstring.displayMessage();
    }
}
