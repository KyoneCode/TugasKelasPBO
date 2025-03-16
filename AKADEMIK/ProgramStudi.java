package AKADEMIK;

import java.util.ArrayList;

public class ProgramStudi {
    private String nama;
    private String kode;
    private ArrayList<MataKuliah> daftarMK;

    public ProgramStudi(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.daftarMK = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public String infoProdi() {
        return "Program Studi: " + nama + " (" + kode + ")";
    }

    public void printInfo() {
        System.out.printf("\n===== INFORMASI PROGRAM STUDI =====\n");
        System.out.printf("+-----------------+-----------------+\n");
        System.out.printf("| %-15s | %-15s |\n", "Nama", nama);
        System.out.printf("| %-15s | %-15s |\n", "Kode", kode);
        System.out.printf("+-----------------+-----------------+\n");
    }
}