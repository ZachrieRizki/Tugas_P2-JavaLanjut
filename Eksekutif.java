public class Eksekutif extends Tiket {

    public Eksekutif(String namaKereta, String nama, String tujuan, double hargaDasar) {
        super(namaKereta, nama, tujuan, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return getHargaDasar() + (getHargaDasar() * 0.5);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Eksekutif");
        System.out.println("Harga: " + hitungHarga());
    }
}