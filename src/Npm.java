public class Npm {
    public static MahasiswaEntity convert (String npm) throws Exception {
        if (npm == null) {
            throw new Exception("NPM tidak boleh kosong");
        }
        if (npm.length() != 10) {
            throw new Exception("NPM panjangnya harus pas 10!");
        }
        if (!Npm.isNumber(npm)) {
            throw new Exception("NPM harus berupa angka!");
        }

        MahasiswaEntity mahasiswa = new MahasiswaEntity();
        mahasiswa.npm = npm;
        mahasiswa.tahun = "20" + npm.substring(0, 2);
        mahasiswa.kodeFakultas = npm.substring(2, 4);
        mahasiswa.kodeProdi = npm.substring(4, 6);
        mahasiswa.urutanMasuk = npm.substring(6, 10);


        if (mahasiswa.kodeProdi.equals("01")) {
            mahasiswa.namaProdi = "Teknik Informatika";
        } else if (mahasiswa.kodeProdi.equals("02")) {
            mahasiswa.namaProdi = "Sistem Informasi";
        } else {
            throw new Exception("Kode prodi tidak terdaftar");
        }

        return mahasiswa;
    }
    public static boolean isNumber(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
