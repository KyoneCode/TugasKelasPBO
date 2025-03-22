// package AKADEMIK;

public class MataKuliah {
    // atribut
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    // konstruktor
    public MataKuliah(){
        idMatkul = "";
        namaMatkul = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String namaMatkul, int sks) {
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    // getter dan setter
    public String getIdMatkul() {
        return idMatkul;
    }

    public String getNama() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    // setter
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    
    public void setNama(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }
    
    public void setSks(int sks) {
        this.sks = sks;
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