import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class Main {
    public static void main(String[] args) {
        while (true) { // Memulai loop utama program untuk memungkinkan pengulangan
            try {
                // Membaca input NPM dari pengguna
                String npm = Main.readInput("Masukkan NPM anda (ketik q untuk keluar): ");

                // Memeriksa apakah pengguna ingin keluar dari program
                if (Main.isExit(npm)) {
                    System.out.println("[TERMINATE] Program berakhir!");
                    break; // Keluar dari loop dan mengakhiri program
                }

                // Mengonversi NPM menjadi objek MahasiswaEntity
                MahasiswaEntity mahasiswa = Npm.convert(npm);

                // Menampilkan data mahasiswa
                System.out.println("----------------[DATA MAHASISWA]--------------");
                System.out.println("NPM \t\t: " + mahasiswa.npm);
                System.out.println("Tahun masuk\t\t: " + mahasiswa.tahun);
                System.out.println("Kode fakultas\t: " + mahasiswa.kodeFakultas);
                System.out.println("Kode prodi\t\t: " + mahasiswa.kodeProdi);
                System.out.println("Nama prodi\t\t: " + mahasiswa.namaProdi);
                System.out.println("Urutan masuk\t: " + mahasiswa.urutanMasuk);
                System.out.println("-----------------------------------------------");

                // Menanyakan apakah pengguna ingin mengulang program
                String repeat = readInput("Apakah anda ingin mengulang Program lagi (y/n)? ");
                repeat = repeat.toLowerCase(); // Mengubah input menjadi huruf kecil

                // Jika pengguna tidak ingin mengulang, keluar dari loop
                if (!repeat.equals("y")){ // equals berfungsi seperti jika variabel repeat berisi y maka mengembalikan nilai benar
                    System.out.println("[TERMINATE] Program anda telah berakhir");
                    break; // menghentikan perulangan
                }

                System.out.println(); // Baris kosong untuk pemisah tampilan
                System.out.println("================================================");
            } catch (Exception err) {
                // Menangani dan menampilkan kesalahan
                System.out.println("[ERROR] " + err.getMessage()); // err.getMessage() mendapat kan pesan Error yang dikirimkan
                System.out.println();
            }
        }
    }

    // Metode untuk memeriksa apakah input adalah perintah keluar
    private static boolean isExit(String text) {
        text = text.toLowerCase(); // Mengubah input menjadi huruf kecil
        return text.equals("q") || text.equals("quit") || text.equals("exit"); // Memeriksa berbagai perintah keluar seperti q, quit, ext
    }

    // Metode untuk membaca input dari pengguna dengan prompt teks
    private static String readInput(String text) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input
        System.out.print(text); // Menampilkan prompt teks
        return scanner.nextLine().trim(); // Membaca dan mengembalikan input pengguna, menghapus spasi berlebih
    }
}
