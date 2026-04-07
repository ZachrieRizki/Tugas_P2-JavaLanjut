public class Ekonomi extends Tiket {

    public Ekonomi(String namaKereta, String nama, String tujuan, double hargaDasar) {
        super(namaKereta, nama, tujuan, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return getHargaDasar();
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Ekonomi");
        System.out.println("Harga: " + hitungHarga());
    }
}

