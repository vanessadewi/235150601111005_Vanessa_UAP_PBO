import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public void mulai() {
        System.out.print("Masa tanam (bulan): ");
        int masaTanam = in.nextInt();
        masaTanam *= 30;

        while (true) {
            System.out.println("Mau menanam apa?");
            System.out.println("1. Tomat");
            System.out.println("2. Stroberi");
            System.out.println("3. Persik");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    tanamans.add(new Tomat(masaTanam));
                    System.out.println("Tomat berhasil ditanam.");
                    break;
                case 2:
                    tanamans.add(new Stroberi(masaTanam));
                    System.out.println("Stroberi berhasil ditanam.");
                    break;
                case 3:
                    tanamans.add(new Persik(masaTanam));
                    System.out.println("Persik berhasil ditanam.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            System.out.print("Lanjut menanam? (yay/tidak): ");
            String lanjut = in.next();
            if (lanjut.equalsIgnoreCase("tidak")) {
                break;
            }
        }
        tampilkanInformasiSetelahPenanaman();
    }

    private void tampilkanInformasiSetelahPenanaman() {
        info();
        perawatan();
        info();
        hasilMenanam();
    }

    public void info() {
        System.out.println("---------------------");
        System.out.println("PROSES PERKEMBANGAN");
        System.out.println("---------------------");
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            tanaman.berkembang();
            System.out.println("Tanaman buah ke-" + (i + 1));
            System.out.println("Masa hidup    : " + tanaman.getMasaHidup() + " hari");
            System.out.println("Umur tanaman  : " + tanaman.getLamaHidup() + " hari");
            System.out.println("Menghasilkan  : " + tanaman.getBuah() + " buah " + tanaman.getClass().getSimpleName());
            System.out.println("Status        : " + (tanaman.getMasaHidup() > 0 ? "Hidup" : "Mati"));
            System.out.println();
        }
    }

    public void perawatan() {
        System.out.println("---------------------");
        System.out.println("DILAKUKAN PERAWATAN");
        System.out.println("---------------------");
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            if (tanaman instanceof Perawatan) {
                ((Perawatan) tanaman).treatment();
                System.out.println("Tanaman " + tanaman.getClass().getSimpleName() + " telah dirawat.");
            }
        }
    }

    public void hasilMenanam() {
        System.out.println("---------------------");
        System.out.println("----HASIL MENANAM----");
        System.out.println("---------------------");
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("Tanaman buah ke-" + (i + 1));
            System.out.println("Masa hidup    : " + tanaman.getMasaHidup() + " hari");
            System.out.println("Umur tanaman  : " + tanaman.getLamaHidup() + " hari");
            System.out.println("Menghasilkan  : " + tanaman.getBuah() + " buah " + tanaman.getClass().getSimpleName());
            System.out.println("Status        : " + (tanaman.getMasaHidup() > 0 ? "Hidup" : "Mati"));
            System.out.println();
        }
    }
}