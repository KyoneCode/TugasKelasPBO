import java.util.ArrayList;
import java.util.List;

public class Irs{
    private Mahasiswa mahasiswa;
    private int semester;
    private ArrayList<MataKuliah> mataKuliahList;
    private int jumlahSks;
    
    // konstruktor
    public Irs(){
        this.mahasiswa = new Mahasiswa();
        this.semester = 0;
        this.mataKuliahList = new ArrayList<>();
        this.jumlahSks = 0;
    }
    public Irs(int semester, Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.semester = semester;
        this.mataKuliahList = new ArrayList<>();
        this.jumlahSks = 0;
    }
 
    // getter
    public int getSemester(){
        return semester;
    }

    public List<MataKuliah> getMataKuliahList() {
        return new ArrayList<>(mataKuliahList);
    }

    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }   

    // setter
    public void setMataKuliahList(List<MataKuliah> mataKuliahList) {
        this.mataKuliahList = new ArrayList<>(mataKuliahList);
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    // method yang lain
    public void tambahMataKuliah(MataKuliah mataKuliah) throws ExceptionIRS{
        if (mataKuliahList == null || mataKuliahList.isEmpty() || jumlahSks == 0) { 
            jumlahSks += mataKuliah.getSks();
            mataKuliahList.add(mataKuliah);
        }
        else { 
            if (mataKuliahList.contains(mataKuliah)) {
                throw new ExceptionIRS("Mata Kuliah sudah ditembahkan");
            }

            if (this.getJumlahSks() + mataKuliah.getSks() > mahasiswa.getSksMaksimal()){
                throw new SksMelebihiBatasException("Jatah SKS sudah penuh");
            }
            jumlahSks += mataKuliah.getSks();
            mataKuliahList.add(mataKuliah);
        }         
    }
    
    // public void cetakIRS() {
    //     System.out.println("IRS Mahasiswa: " + mahasiswa.getNama());
    //     for (MataKuliah mk : mataKuliahList) {
    //         System.out.println("Mata Kuliah: " + mk.getNama());
    //     }
    // }

    public void cetakIRS() {
        System.out.println("===== INFORMASI IRS MAHASISWA =====");
        System.out.println("+---------------------------------------------+");
        System.out.printf("| %-10s : %-30s |\n", "Nama", mahasiswa.getNama());
        System.out.printf("| %-10s : %-30s |\n", "NIM", mahasiswa.getNim());
        System.out.println("+---------------------------------------------+");
    
        if (mataKuliahList.isEmpty()) {
            System.out.println("|           Belum ada mata kuliah            |");
            System.out.println("+---------------------------------------------+");
        } else {
            System.out.println("+------+--------------------------------+------+" );
            System.out.printf("| %-4s | %-30s | %-4s |\n", "No", "Nama Mata Kuliah", "SKS");
            System.out.println("+------+--------------------------------+------+" );
    
            int no = 1;
            int totalSks = 0;
            for (MataKuliah mk : mataKuliahList) {
                System.out.printf("| %-4d | %-30s | %-4d |\n", no++, mk.getNama(), mk.getSks());
                totalSks += mk.getSks();
            }
            
            System.out.println("+------+--------------------------------+------+" );
            System.out.printf("| %-4s | %-30s | %-4d |\n", "", "Total SKS", totalSks);
            System.out.println("+------+--------------------------------+------+" );
        }
    }
    
}