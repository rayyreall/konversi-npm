public class Mahasiswa {
    public static void konversi (String npm, MahasiswaModel model) throws Exception {
        konversiHelper(npm, model);
    }
    public static MahasiswaModel konversi (String npm) throws Exception {
        MahasiswaModel model = new MahasiswaModel();
        return konversiHelper(npm, model);
    }
    private static MahasiswaModel konversiHelper (String npm, MahasiswaModel model) throws Exception {
        String tahunMasuk = npm.substring(0, 2);
        String kodeFakultas = npm.substring(2, 4);
        String kodeProdi = npm.substring(4, 6);
        String urutanMasuk = npm.substring(6, 10);
        String namaProdi = konversiNamaProdi(kodeProdi);


        model.setNpm(npm);
        model.setTahunMasuk(tahunMasuk);
        model.setKodeFakultas(kodeFakultas);
        model.setKodeProdi(kodeProdi);
        model.setNamaProdi(namaProdi);
        model.setUrutanMasuk(urutanMasuk);
        return model;
    }

    private static String konversiNamaProdi (String kodeProdi) throws Exception {
        switch (kodeProdi) {
            case "01":
                return "Teknik Informatika";
            case "02":
                return "Sistem Informasi";
            default:
                throw new Exception("Invalid Kode");
        }
    }
    public static boolean isNpmValid (String npm)  {
        if (npm == null) {
            System.out.println("Error: npm tidak boleh kosong");
            return false;
        }
        if (npm.length() != 10) {
            System.out.println("Error: npm harus pas 10 karakter");
            return false;
        }
        try {
            Long.parseLong(npm);
        } catch (Exception e) {
            System.out.println("Error: NPM harus berupa angka semua tidak boleh ada karakter");
            return false;
        }
        return true;
    }
}
