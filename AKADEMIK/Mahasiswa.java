// package AKADEMIK;

import java.util.ArrayList;

public class Mahasiswa extends Orang {
    // atribut
    private String nim;
    private int angkatan;
    private String prodi;
    private Dosen dosenWali;
    private ArrayList<Irs> listIrs;
    private ArrayList<Khs> listKhs;
    private final int sksMaksimal = 24;

    // konstruktor
    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String alamat, String email, String NIM, int angkatan, String prodi) {
        super(nama, alamat, email);
        this.nim = NIM;
        this.angkatan = angkatan;
        this.prodi = prodi;
        this.listIrs = new ArrayList<>();
        this.listKhs = new ArrayList<>();
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

    public Irs getIrs(int semester){
        for (Irs irs : listIrs) {
            if (irs.getSemester() == semester) {
                return irs;
            }
        }
        return null;
    }

    public Khs getKhs(int semester){
        for (Khs khs : listKhs) {
            if (khs.getSemester() == semester) {
                return khs;
            }
        }
        return null;
    }

    public int totalSks(){
        int total = 0;
        for (Irs irs : listIrs) {
            total += irs.getJumlahSks();
        }
        return total;
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

    public void setIrs(Irs irs){
        this.listIrs.add(irs);
    }

    public void setKhs(Khs khs){
        this.listKhs.add(khs);
    }

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
        System.out.printf("| %-15s | %-26s |\n", "Dosen Wali", dosenWali);
        System.out.printf("| %-15s | %-26s |\n", "Total SKS", this.totalSks());
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
