public class Bisnis extends Tiket {

    public Bisnis(String nama, String tujuan, double hargaDasar) {
        super(nama, tujuan, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return hargaDasar + (hargaDasar * 0.2);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Bisnis");
        System.out.println("Harga: " + hitungHarga());
    }
}