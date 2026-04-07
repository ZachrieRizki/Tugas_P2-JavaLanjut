import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. DATA KERETA (LIST)
        List<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Ekonomi("KA Ekonomi", "Zachrie", "Bandung", 100000));
        daftarTiket.add(new Bisnis("KA Bisnis", "Rizki", "Jakarta", 150000));
        daftarTiket.add(new Eksekutif("KA Eksekutif", "Chandra", "Surabaya", 200000));

        //2. Tampilkan Daftar Kereta
        System.out.println("=== DAFTAR KERETA ===");
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i).getNamaKereta());
        }

        //3. simulasi pilihan
        int pilihan = 2;

        //4. ambil tiket dari list
        Tiket tiketDipilih = daftarTiket.get(pilihan - 1);

        //5. Tampilkan Detail Tiket
        System.out.println("\n=== DETAIL TIKET ===");
        tiketDipilih.tampilInfo();

    }
}