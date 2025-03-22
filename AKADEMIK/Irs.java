import java.util.ArrayList;
import java.util.List;

public class Irs{
    private Mahasiswa mahasiswa;
    private List<MataKuliah> mataKuliahList;
    
    // konstruktor
    public Irs(){
        this.mahasiswa = new Mahasiswa();
        this.mataKuliahList = new ArrayList<>();
    }
    public Irs(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahList = new ArrayList<>();
    }
 
    // getter
    public List<MataKuliah> getMataKuliahList() {
        return new ArrayList<>(mataKuliahList);
    }

    public Mahasiswa getMahasiswa(){
        return mahasiswa;
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
        if (mataKuliahList == null || mataKuliahList.isEmpty()) { 
            mataKuliahList.add(mataKuliah);
        }
        else { 
            if (mataKuliahList.contains(mataKuliah)) {
                throw new ExceptionIRS("Mata Kuliah sudah ditembahkan");
            }

            if (mahasiswa.getIrs().getJumlahSks() + mataKuliah.getSks() > mahasiswa.getSksMaksimal()){
                throw new SksMelebihiBatasException("Jatah SKS sudah penuh");
            }
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
        System.out.println("=====================================");
        System.out.println("         INFORMASI IRS MAHASISWA     ");
        System.out.println("=====================================");
        System.out.println("Nama         : " + mahasiswa.getNama());
        System.out.println("NIM          : " + mahasiswa.getNim());
        if (mataKuliahList.isEmpty()) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            System.out.println("Mata Kuliah yang Diambil:");
            System.out.println("-------------------------------------");
            System.out.printf("| %-5s | %-30s | %-4s |\n", "No", "Nama Mata Kuliah", "SKS");
            System.out.println("-------------------------------------");
            int no = 1;
            for (MataKuliah mk : mataKuliahList) {
                System.out.printf("| %-5d | %-30s | %-4d |\n", no++, mk.getNama(), mk.getSks());
            }
            System.out.println("-------------------------------------");
        }
    }

    public int getJumlahSks() {
        if (mataKuliahList == null || mataKuliahList.isEmpty()) {
            return 0;
        }
        int totalSks = 0;
        for (MataKuliah mk : mataKuliahList) {
            if (mk != null) {
                totalSks += mk.getSks();
            }
        }
        return totalSks;
    }
}