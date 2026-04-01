public class Eksekutif extends Tiket {

    public Eksekutif(String nama, String tujuan, double hargaDasar) {
        super(nama, tujuan, hargaDasar);
    }

    @Override
    public double hitungHarga() {
        return hargaDasar + (hargaDasar * 0.5);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kelas: Eksekutif");
        System.out.println("Harga: " + hitungHarga());
    }
}