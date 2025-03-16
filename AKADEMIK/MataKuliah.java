package AKADEMIK;

public class MataKuliah {
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void printInfo() {
        System.out.printf("\n===== INFORMASI MATA KULIAH =====\n");
        System.out.printf("+------------+--------------------+------+\n");
        System.out.printf("| %-10s | %-18s | %-4s |\n", "Kode", "Nama", "SKS");
        System.out.printf("+------------+--------------------+------+\n");
        System.out.printf("| %-10s | %-18s | %-4d |\n", getIdMatkul(), getNama(), getSks());
        System.out.printf("+------------+--------------------+------+\n");
    }
}