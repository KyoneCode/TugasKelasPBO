package AKADEMIK;

import java.util.ArrayList;

public class Mahasiswa extends Orang {
    private String nim;
    private int angkatan;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private final int sksMaksimal = 24;

    public Mahasiswa(String nama, String alamat, String email, String NIM, int angkatan, String prodi) {
        super(nama, alamat, email);
        this.nim = NIM;
        this.angkatan = angkatan;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatkul(MataKuliah mk) {
        if (getJumlahSks() + mk.getSks() > sksMaksimal) {
            System.out.println("Gagal menambahkan " + mk.getNama() + ". Total SKS melebihi batas (" + sksMaksimal + " SKS).");
            return;
        }
        listMatkul.add(mk);
        System.out.println("Mata Kuliah " + mk.getNama() + " berhasil ditambahkan untuk " + nama);
    }

    public int getJumlahSks() {
        int totalSks = 0;
        for (MataKuliah mk : listMatkul) {
            totalSks += mk.getSks();
        }
        return totalSks;
    }

    public void printInfo() {
        System.out.printf("\n===== INFORMASI MAHASISWA =====\n");
        System.out.printf("+-----------------+----------------------------+\n");
        System.out.printf("| %-15s | %-26s |\n", "Nama", getNama());
        System.out.printf("| %-15s | %-26s |\n", "NIM", getNim());
        System.out.printf("| %-15s | %-26s |\n", "Prodi", getProdi());
        System.out.printf("| %-15s | %-26s |\n", "Angkatan", getAngkatan());
        System.out.printf("| %-15s | %-26s |\n", "Dosen Wali", (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
        System.out.printf("| %-15s | %-26s |\n", "Kendaraan", (kendaraan != null ? kendaraan.getJenis() + " " + kendaraan.getNoPlat() : "Tidak memiliki kendaraan"));
        System.out.printf("+-----------------+----------------------------+\n");

        if (listMatkul.isEmpty()) {
            System.out.println("| Mata Kuliah yang diambil: Tidak ada              |");
        } else {
            System.out.println("\n===== MATA KULIAH YANG DIAMBIL =====");
            System.out.printf("+------------+--------------------+------+\n");
            System.out.printf("| %-10s | %-18s | %-4s |\n", "Kode", "Nama", "SKS");
            System.out.printf("+------------+--------------------+------+\n");
            for (MataKuliah mk : listMatkul) {
                System.out.printf("| %-10s | %-18s | %-4d |\n", mk.getIdMatkul(), mk.getNama(), mk.getSks());
            }
            System.out.printf("+------------+--------------------+------+\n");
        }

        System.out.printf("\n| Total SKS: %-32s |\n", getJumlahSks() + "/" + sksMaksimal);
        System.out.printf("+---------------------------------------+\n");
    }
}
