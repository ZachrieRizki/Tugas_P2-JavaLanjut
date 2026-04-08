import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. list kerera
        List<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Ekonomi("KA Ekonomi", "Zachrie", "Bandung"));
        daftarTiket.add(new Bisnis("KA Bisnis", "Rizki", "Jakarta"));
        daftarTiket.add(new Eksekutif("KA Eksekutif", "Chandra", "Surabaya"));

        //2. nampilin daftarkereta
        System.out.println("=== DAFTAR KERETA ===");
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i).getNamaKereta());
        }

        //3. simulasi pilihan
        int pilihan = 0;

        //4. ambil tiket dari list
        Tiket tiketDipilih = daftarTiket.get(pilihan);

        //5. Tampilkan Detail Tiket
        System.out.println("\n=== DETAIL TIKET ===");
        tiketDipilih.tampilInfo();

    }
}