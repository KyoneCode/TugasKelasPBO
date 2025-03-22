// package AKADEMIK;
import java.util.ArrayList;

public class Kelas {
    // Atribut
    private String kode;
    private String jadwal;
    private MataKuliah mataKuliah;
    private Dosen dosenPengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private final int kapasitasMaksimal = 50;

    // Konstruktor
    public Kelas(){
        kode = "";
        jadwal = "";
        mataKuliah = new MataKuliah();
        dosenPengampu = new Dosen();
        daftarMahasiswa = new ArrayList<>();
    }
    public Kelas(String kode, String jadwal, MataKuliah mataKuliah, Dosen dosenPengampu) {
        this.kode = kode;
        this.jadwal = jadwal;
        this.mataKuliah = mataKuliah;
        this.dosenPengampu = dosenPengampu;
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Getter dan Setter
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public void setDosenPengampu(Dosen dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (daftarMahasiswa.size() >= kapasitasMaksimal) {
            throw new IllegalStateException("Kelas penuh! Tidak bisa menambahkan mahasiswa lagi.");
        }
        daftarMahasiswa.add(mahasiswa);
        System.out.println(mahasiswa.getNama() + " berhasil masuk kelas " + kode);
    }

    public void printInfo() {
        System.out.printf("\n===== INFORMASI KELAS =====\n");
        System.out.printf("+-----------------+-----------------------------+\n");
        System.out.printf("| %-16s | %-26s |\n", "Kode Kelas", kode);
        System.out.printf("| %-16s | %-26s |\n", "Jadwal", jadwal);
        System.out.printf("| %-16s | %-26s |\n", "Mata Kuliah", mataKuliah.getNama());
        System.out.printf("| %-16s | %-26s |\n", "Dosen Pengampu", dosenPengampu.getNama());
        System.out.printf("| %-16s | %-26s |\n", "Jumlah Mahasiswa", daftarMahasiswa.size() + "/" + kapasitasMaksimal);
        System.out.printf("+-----------------+----------------------------+\n");

        if (daftarMahasiswa.isEmpty()) {
            System.out.println("| Mahasiswa: Tidak ada mahasiswa terdaftar      |");
        } else {
            System.out.println("\n===== DAFTAR MAHASISWA =====");
            System.out.printf("+------------+--------------------+\n");
            System.out.printf("| %-10s | %-18s |\n", "NIM", "Nama");
            System.out.printf("+------------+--------------------+\n");
            for (Mahasiswa mhs : daftarMahasiswa) {
                System.out.printf("| %-10s | %-18s |\n", mhs.getNim(), mhs.getNama());
            }
            System.out.printf("+------------+--------------------+\n");
        }
    }
}