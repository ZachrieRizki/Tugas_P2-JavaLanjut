public class Main {
    public static void main(String[] args) {

        Tiket t1 = new Ekonomi("Zachrie", "Bandung", 100000);
        Tiket t2 = new Bisnis("Rizki", "Jakarta", 150000);
        Tiket t3 = new Eksekutif("Chandra", "Surabaya", 200000);

        System.out.println("=== Tiket 1 ===");
        t1.tampilInfo();

        System.out.println("\n=== Tiket 2 ===");
        t2.tampilInfo();

        System.out.println("\n=== Tiket 3 ===");
        t3.tampilInfo();
    }
}