import java.util.ArrayList;
import java.util.List;

public class Irs {
    private Mahasiswa mahasiswa;
    private List<MataKuliah> mataKuliahList;
    
    public Irs(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahList = new ArrayList<>();
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public List<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }

    public void setMataKuliahList(List<MataKuliah> mataKuliahList) {
        this.mataKuliahList = mataKuliahList;
    }
    
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        if (mataKuliahList.contains(mataKuliah)) {
            throw new IRSException("Mata kuliah sudah ditambahkan ke IRS.");
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