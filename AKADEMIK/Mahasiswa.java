// package AKADEMIK;

import java.util.ArrayList;

public class Mahasiswa extends Orang {
    // atribut
    private String nim;
    private int angkatan;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private final int sksMaksimal = 24;

    // konstruktor
    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String alamat, String email, String NIM, int angkatan, String prodi) {
        super(nama, alamat, email);
        this.nim = NIM;
        this.angkatan = angkatan;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
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

    // // method lain
    // public void addMatkul(MataKuliah mk) {
    //     if (getJumlahSks() + mk.getSks() > sksMaksimal) {
    //         throw new SksMelebihiBatasException("Gagal menambahkan " + mk.getNama() + ". Total SKS melebihi batas (" + sksMaksimal + " SKS).");
    //     }
    //     listMatkul.add(mk);
    //     System.out.println("Mata Kuliah " + mk.getNama() + " berhasil ditambahkan untuk " + nama);
    // }

    public int getJumlahSks() {
        int totalSks = 0;
        for (MataKuliah mk : listMatkul) {
            totalSks += mk.getSks();
        }
        return totalSks;
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
        System.out.printf("| %-15s | %-26s |\n", "Total SKS", getJumlahSks() + "/" + sksMaksimal);
        System.out.printf("+-----------------+----------------------------+\n");
    }
}
