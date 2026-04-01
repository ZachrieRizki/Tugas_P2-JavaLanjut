public class Ekonomi extends Tiket {

    public Ekonomi(String nama, String tujuan, double hargaDasar) {
        super(nama, tujuan, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return hargaDasar;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Ekonomi");
        System.out.println("Harga: " + hitungHarga());
    }
}