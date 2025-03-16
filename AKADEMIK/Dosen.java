package AKADEMIK;

public class Dosen extends Pegawai {
    private String prodi;

    public Dosen(String nip, String jabatan, String nama, String alamat, String email, String prodi) {
        super(nip, jabatan, nama, alamat, email);
        this.prodi = prodi;
    }

    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void mengajar(MataKuliah mk) {
        System.out.println(nama + " mengajar mata kuliah " + mk.getNama());
    }

    @Override
    public void printInfo() {
        System.out.printf("\n===== INFORMASI DOSEN =====\n");
        super.printInfo();
        System.out.printf("| %-15s | %-26s |\n", "NIP", getNip());
        System.out.printf("| %-15s | %-26s |\n", "Jabatan", getJabatan());
        System.out.printf("| %-15s | %-26s |\n", "Prodi", getProdi());
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
