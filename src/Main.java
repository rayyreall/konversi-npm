import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                String npm = Main.readInput("Masukkan NPM anda (ketik q untuk keluar): ");
                if (Main.isExit(npm)) {
                    System.out.println("[TERMINATE] Program berakhir!");
                    break;
                }
                MahasiswaEntity mahasiswa = Npm.convert(npm);

                System.out.println("----------------[DATA MAHASISWA]--------------");
                System.out.println("NPM \t\t: " + mahasiswa.npm);
                System.out.println("Tahun masuk\t\t: " + mahasiswa.tahun);
                System.out.println("Kode fakultas\t: " + mahasiswa.kodeFakultas);
                System.out.println("Kode prodi\t\t: " + mahasiswa.kodeProdi);
                System.out.println("Nama prodi\t\t: " + mahasiswa.namaProdi);
                System.out.println("Urutan masuk\t: " + mahasiswa.urutanMasuk);
                System.out.println("-----------------------------------------------");

                String repeat = readInput("Apakah anda ingin mengulang Program lagi (y/n)? ");

                repeat = repeat.toLowerCase();

                if (!repeat.equals("y")){
                    System.out.println("[TERMINATE] Program anda telah berakhir");
                    break;
                }
                System.out.println();
                System.out.println("================================================");
            } catch (Exception err) {
                System.out.println("[ERROR] " + err.getMessage());
                System.out.println();
            }
        }
    }
    private static  boolean isExit(String text) {
        text = text.toLowerCase();
        if (text.equals("q") || text.equals("quit") || text.equals("exit")) {
            return true;
        }
        return false;
    }
    private static String readInput (String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        return scanner.nextLine().trim();
    }
}
