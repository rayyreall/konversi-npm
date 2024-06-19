public class Npm {
    // Metode untuk mengonversi NPM menjadi objek MahasiswaEntity
    public static MahasiswaEntity convert(String npm) throws Exception {
        if (npm == null) {
            throw new Exception("NPM tidak boleh kosong"); // Memeriksa apakah NPM kosong
        }
        if (npm.length() != 10) {
            throw new Exception("NPM panjangnya harus pas 10!"); // Memeriksa apakah panjang NPM tepat 10 karakter
        }
        if (!Npm.isNumber(npm)) {
            throw new Exception("NPM harus berupa angka!"); // Memeriksa apakah NPM hanya berisi angka
        }

        MahasiswaEntity mahasiswa = new MahasiswaEntity(); // Membuat objek MahasiswaEntity baru
        mahasiswa.npm = npm; // Mengatur NPM
        mahasiswa.tahun = "20" + npm.substring(0, 2); // Mengatur tahun masuk berdasarkan dua digit pertama NPM
        mahasiswa.kodeFakultas = npm.substring(2, 4); // Mengatur kode fakultas berdasarkan dua digit berikutnya
        mahasiswa.kodeProdi = npm.substring(4, 6); // Mengatur kode program studi berdasarkan dua digit berikutnya
        mahasiswa.urutanMasuk = npm.substring(6, 10); // Mengatur urutan masuk berdasarkan empat digit terakhir

        // Mengatur nama program studi berdasarkan kode program studi
        if (mahasiswa.kodeProdi.equals("01")) {
            mahasiswa.namaProdi = "Teknik Informatika"; // Jika kode prodi adalah 01, maka nama prodi adalah Teknik Informatika
        } else if (mahasiswa.kodeProdi.equals("02")) {
            mahasiswa.namaProdi = "Sistem Informasi"; // Jika kode prodi adalah 02, maka nama prodi adalah Sistem Informasi
        } else {
            throw new Exception("Kode prodi tidak terdaftar"); // Jika kode prodi tidak terdaftar, lempar pengecualian
        }

        return mahasiswa; // Mengembalikan objek MahasiswaEntity yang telah diisi
    }

    // Metode untuk memeriksa apakah sebuah string hanya berisi angka
    public static boolean isNumber(String text) {
        try {
            Long.parseLong(text); // Mencoba mengonversi string menjadi angka
            return true; // Jika berhasil, mengembalikan true
        } catch (NumberFormatException e) {
            return false; // Jika gagal (terjadi pengecualian), mengembalikan false
        }
    }
}
