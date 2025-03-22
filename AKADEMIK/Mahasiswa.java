// package AKADEMIK;

public class Mahasiswa extends Orang {
    // atribut
    private String nim;
    private int angkatan;
    private String prodi;
    private Dosen dosenWali;
    private Irs irs;
    private Khs khs;
    private final int sksMaksimal = 24;

    // konstruktor
    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String alamat, String email, String NIM, int angkatan, String prodi) {
        super(nama, alamat, email);
        this.nim = NIM;
        this.angkatan = angkatan;
        this.prodi = prodi;
        this.irs = new Irs();
        this.khs = new Khs();
    }

    // getter
    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSksMaksimal(){
        return sksMaksimal;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Irs getIrs(){
        return irs;
    }

    public Khs getKhs(){
        return khs;
    }

    // setter
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setIrs(Irs irs) {
        this.irs = irs;
    }

    public void setKhs(Khs khs) {
        this.khs = khs;
    }

    // // method lain
    // public void addMatkul(MataKuliah mk) {
    //     if (getJumlahSks() + mk.getSks() > sksMaksimal) {
    //         throw new SksMelebihiBatasException("Gagal menambahkan " + mk.getNama() + ". Total SKS melebihi batas (" + sksMaksimal + " SKS).");
    //     }
    //     listMatkul.add(mk);
    //     System.out.println("Mata Kuliah " + mk.getNama() + " berhasil ditambahkan untuk " + nama);
    // }

    @Override
    public void printInfo() {
        System.out.printf("\n===== INFORMASI MAHASISWA =====\n");
        System.out.printf("+-----------------+----------------------------+\n");
        System.out.printf("| %-15s | %-26s |\n", "Nama", nama);
        System.out.printf("| %-15s | %-26s |\n", "Alamat", alamat);
        System.out.printf("| %-15s | %-26s |\n", "Email", email);
        System.out.printf("| %-15s | %-26s |\n", "NIM", nim);
        System.out.printf("| %-15s | %-26s |\n", "Angkatan", angkatan);
        System.out.printf("| %-15s | %-26s |\n", "Program Studi", prodi);
        System.out.printf("| %-15s | %-26s |\n", "Total SKS", getIrs().getJumlahSks() + "/" + sksMaksimal);
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
