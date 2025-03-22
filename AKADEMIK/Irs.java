import java.util.ArrayList;
import java.util.List;

public class Irs {
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
        if (mataKuliahList.contains(mataKuliah)) {
            throw new ExceptionIRS("Mata Kuliah sudah ditembahkan");
        }

        if (mahasiswa.getJumlahSks() + mataKuliah.getSks() > mahasiswa.getSksMaksimal()){
            throw new ExceptionIRS("Gagal menambahkan " + mataKuliah.getNama() + ". Total SKS melebihi batas (" + mahasiswa.getSksMaksimal() + " SKS).");
        }
        mataKuliahList.add(mataKuliah);
    }
    
    public void cetakIRS() {
        System.out.println("IRS Mahasiswa: " + mahasiswa.getNama());
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("Mata Kuliah: " + mk.getNama());
        }
    }
}