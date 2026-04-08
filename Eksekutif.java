public class Eksekutif extends Tiket {

    public Eksekutif(String namaKereta, String nama, String tujuan) {
        super(namaKereta, nama, tujuan);
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