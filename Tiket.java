import java.util.HashMap;
import java.util.Map;


public abstract class Tiket implements Tickettable {
   
    private String namaKereta;
    private String namaPenumpang;
    private String tujuan;

    protected static Map<String, Double> hargaMap = new HashMap<>();

    static {
        hargaMap.put("Bandung", 100000.0);
        hargaMap.put("Jakarta", 150000.0);
        hargaMap.put("Surabaya", 200000.0);
    }

    public Tiket(String namaKereta, String namaPenumpang, String tujuan) {
        this.namaKereta = namaKereta;
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
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
        return hargaMap.getOrDefault(tujuan, 120000.0); 
    }

    // Abstraction
    public abstract double hitungHarga();

    public void tampilInfo() {
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("Tujuan: " + tujuan);
    }
}