// package AKADEMIK;

public class Dosen extends Pegawai {
    protected String prodi;

    public Dosen(){}
    public Dosen(String nip, String jabatan, String nama, String alamat, String email, String prodi) {
        super(nip, jabatan, nama, alamat, email);
        this.prodi = prodi;
    }

    public String getProdi() {
        return prodi;
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
        System.out.printf("| %-15s | %-26s |\n", "Prodi", getProdi());
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
