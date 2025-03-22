// package AKADEMIK;

import java.util.ArrayList;

public class ProgramStudi {
    private String nama;
    private String kode;
    private ArrayList<MataKuliah> daftarMK;

    // konstruktor
    public ProgramStudi(){
        nama = "";
        kode = "";
        daftarMK = new ArrayList<>();
    }
    public ProgramStudi(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.daftarMK = new ArrayList<>();
    }

    // getter
    public String getNama(){
        return nama;
    }
    public String getKode(){
        return kode;
    }
    public ArrayList<MataKuliah> getMataKuliah(){
        return daftarMK;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setMataKuliah(ArrayList<MataKuliah> daftarMK) {
        this.daftarMK = daftarMK;
    }
    
    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public String infoProdi() {
        return "Program Studi: " + nama + " (" + kode + ")";
    }

    public void printInfo() {
        System.out.printf("\n====== INFORMASI PROGRAM STUDI ======\n");
        System.out.printf("+-----------------+-----------------+\n");
        System.out.printf("| %-15s | %-15s |\n", "Nama", nama);
        System.out.printf("| %-15s | %-15s |\n", "Kode", kode);
        System.out.printf("+-----------------+-----------------+\n");
    }
}