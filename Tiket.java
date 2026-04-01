public abstract class Tiket implements Tickettable {
    private String namaPenumpang;
    private String tujuan;
    protected double hargaDasar;

    public Tiket(String namaPenumpang, String tujuan, double hargaDasar) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    // Encapsulation (getter)
    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    // Abstraction
    public abstract double hitungHarga();

    public void tampilInfo() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Tujuan: " + tujuan);
    }
}