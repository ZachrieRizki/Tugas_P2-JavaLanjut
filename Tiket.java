public abstract class Tiket implements Tickettable {
    private String namaKereta;
    private String namaPenumpang;
    private String tujuan;
    private double hargaDasar;

    public Tiket(String namaKereta, String namaPenumpang, String tujuan, double hargaDasar) {
        this.namaKereta = namaKereta;
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    // Encapsulation (getter)
    public String getNamaKereta() {
        return namaKereta;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double getHargaDasar() {
        return hargaDasar; 
    }

    // Abstraction
    public abstract double hitungHarga();

    public void tampilInfo() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Tujuan: " + tujuan);
    }
}