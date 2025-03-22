// package AKADEMIK;

import java.util.ArrayList;

public class Fakultas {
    // atribut
    private String nama;
    private String kode;
    private ArrayList<ProgramStudi> daftarProdi;

    // konstruktor
    public Fakultas(){
        nama = "";
        kode = "";
        daftarProdi = new ArrayList<>();
    }
    public Fakultas(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.daftarProdi = new ArrayList<>();
    }

    // getter
    public String getNama(){
        return nama;
    }
    public String getKode(){
        return kode;
    }
    public ArrayList<ProgramStudi> getDaftarProdi(){
        return daftarProdi;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setDaftarProdi(ArrayList<ProgramStudi> daftarProdi) {
        this.daftarProdi = daftarProdi;
    }

    // method lain
    public void tambahProdi(ProgramStudi prodi) {
        daftarProdi.add(prodi);
    }

    public String infoFakultas() {
        return "Fakultas: " + nama;
    }

    public void printInfo() {
        System.out.printf("\n====== INFORMASI FAKULTAS =======\n");
        System.out.printf("+-------------------------------+\n");
        System.out.printf("| Fakultas %-21s|\n", nama);
        System.out.printf("+-------------------------------+\n");
        System.out.printf("| Program Studi: %-14s |\n", " ");
        for (ProgramStudi prodi : daftarProdi) {
            System.out.printf("|- %-28s |\n" , prodi.getNama());
        }
        System.out.printf("+-------------------------------+\n");
    }
}