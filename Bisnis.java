public class Bisnis extends Tiket {

    public Bisnis(String namaKereta, String nama, String tujuan) {
        super(namaKereta, nama, tujuan);
    }

    @Override
    public double hitungHarga() {
        return getHargaDasar() + (getHargaDasar() * 0.2);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Bisnis");
        System.out.println("Harga: " + hitungHarga());
    }
}