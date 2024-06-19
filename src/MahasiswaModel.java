

public class MahasiswaModel extends  Person {

    private int tahunMasuk;
    private int kodeFakultas;
    private int kodeProdi;
    private  String urutanMasuk;
    private String namaProdi;

    public MahasiswaModel(String npm) {
        super(npm, null);
    }
    public MahasiswaModel(String npm, String name) {
        super(npm, name);
    }
    public MahasiswaModel () {
        super(null, null);
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }


    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public void setTahunMasuk (String tahunMasuk) {
        this.tahunMasuk = Integer.parseInt(tahunMasuk);
    }

    public int getKodeFakultas() {
        return kodeFakultas;
    }

    public void setKodeFakultas(int kodeFakultas) {
        this.kodeFakultas = kodeFakultas;
    }
    public void setKodeFakultas  (String kodeFakultas) {
        this.kodeFakultas = Integer.parseInt(kodeFakultas);
    }

    public int getKodeProdi() {
        return kodeProdi;
    }

    public void setKodeProdi(int kodeProdi) {
        this.kodeProdi = kodeProdi;
    }
    public void setKodeProdi (String kodeProdi) {
        this.kodeProdi = Integer.parseInt(kodeProdi);
    }

    public String getUrutanMasuk() {
        return urutanMasuk;
    }

    public void setUrutanMasuk(String urutanMasuk) {
        this.urutanMasuk = urutanMasuk;
    }

    @Override
    public String toString() {
        String text = "Data Mahasiswa\n";
        if (this.getNpm() != null) {
            text += "NPM \t\t\t: " + this.getNpm() + "\n";
        }
        if (this.getName() != null) {
            text += "Nama \t\t\t: " + this.getName() + "\n";
        }
        text += "Tahum masuk \t: " + this.getTahunMasuk() + "\n";
        text += "Kode Fakultas \t: " + this.getKodeFakultas() + "\n";
        text += "Kode Prodi \t\t: " + this.getKodeProdi() + "\n";
        text += "Nama Prodi \t\t: " + this.getNamaProdi() + "\n";
        text += "Urutan Masuk \t: " + this.getUrutanMasuk() + "\n";
        return text;
    }
}
