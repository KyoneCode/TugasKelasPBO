// package AKADEMIK;

public class Dosen extends Pegawai {
    // atribut
    protected String prodi;

    // konstruktor
    public Dosen(){
        super();
        prodi = "";
    }
    public Dosen(String nip, String jabatan, String nama, String alamat, String email, String prodi) {
        super(nip, jabatan, nama, alamat, email);
        this.prodi = prodi;
    }

    // getter
    public String getProdi() {
        return prodi;
    }

    // setter
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // method lain
    public void mengajar(MataKuliah mk) {
        System.out.println(nama + " mengajar mata kuliah " + mk.getNama());
    }

    @Override
    public void printInfo() {
        System.out.printf("\n=============== INFORMASI DOSEN ================\n");
        super.printInfo();
        System.out.printf("| %-15s | %-26s |\n", "Prodi", getProdi());
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
