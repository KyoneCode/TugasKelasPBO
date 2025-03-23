
import java.util.ArrayList;
import java.util.List;


public class Khs {
    // atribut
    private Mahasiswa mahasiswa;
    private int semester;
    private ArrayList<MataKuliahNilai> mataKuliahNilaiList;
    private int jumlahSks;
    private Irs IRS;
    
    // konstruktor
    public Khs() {
        this.mahasiswa = new Mahasiswa();
        this.semester = 0;
        this.mataKuliahNilaiList = new ArrayList<>();
        this.jumlahSks = 0;
        this.IRS = new Irs();
    }

    public Khs(Irs irs) {
        this.mahasiswa = irs.getMahasiswa();
        this.semester = irs.getSemester();
        this.mataKuliahNilaiList = new ArrayList<>();
        this.jumlahSks = irs.getJumlahSks();
        this.IRS = irs;
    }

    // getter dan setter
    public int getSemester() {
        return semester;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public List<MataKuliahNilai> getMataKuliahNilaiList() {
        return new ArrayList<>(mataKuliahNilaiList);
    }

    public Irs getIRS() {
        return IRS;
    }

    public void setIRS(Irs IRS) {
        this.IRS = IRS;
    }

    public void tambahNilai(MataKuliah mataKuliah, char nilai) {
        try {
            if (mataKuliah == null) {
                throw new ExceptionIRS("Mata kuliah tidak valid!");
            }

            if (!IRS.getMataKuliahList().contains(mataKuliah)) {
                throw new ExceptionIRS("Mahasiswa belum mengambil mata kuliah " + mataKuliah.getNama() + " dalam IRS.");
            }

            if ("ABCDE".indexOf(nilai) == -1) {
                throw new ExceptionIRS("Nilai tidak valid! Harus berupa A, B, C, D, atau F.");
            }

            mataKuliahNilaiList.add(new MataKuliahNilai(mataKuliah, nilai));
            System.out.println("Isi mataKuliahNilaiList:");
            
            System.out.println("Nilai " + nilai + " berhasil ditambahkan untuk mata kuliah: " + mataKuliah.getNama());

        } catch (ExceptionIRS e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan yang tidak terduga: " + e.getMessage());
        }
    }

    public void cetakKHS() {
        System.out.println("=====================================");
        System.out.println("         INFORMASI KHS MAHASISWA     ");
        System.out.println("=====================================");
        System.out.println("Nama         : " + getMahasiswa().getNama());
        System.out.println("NIM          : " + getMahasiswa().getNim());
        System.out.println("-------------------------------------");
        System.out.printf("%-25s | %-5s\n", "Mata Kuliah", "Nilai");
        System.out.println("-------------------------------------");

        for (MataKuliahNilai mkNilai : mataKuliahNilaiList) {
            System.out.printf("%-25s | %-5s\n", mkNilai.getMataKuliah().getNama(), mkNilai.getNilai());
        }
        System.out.println("-------------------------------------");
    }

}
