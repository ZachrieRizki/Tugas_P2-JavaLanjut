public class Ekonomi extends Tiket {

    public Ekonomi(String namaKereta, String nama, String tujuan) {
        super(namaKereta, nama, tujuan);
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

