public class Khs {
    private Mahasiswa mahasiswa;
    private List<MataKuliah> mataKuliahList;
    private List<Character> nilaiList;
    
    public Khs(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahList = new ArrayList<>();
        this.nilaiList = new ArrayList<>();
    }
    
    public void tambahMataKuliah(MataKuliah mataKuliah, char nilai){
        mataKuliahList.add(mataKuliah);
        nilaiList.add(nilai);
    }
    
    public void cetakKHS() {
        System.out.println("KHS Mahasiswa: " + mahasiswa.getNama());
        for (int i = 0; i < mataKuliahList.size(); i++) {
            System.out.println("Mata Kuliah: " + mataKuliahList.get(i).getNama() + ", Nilai: " + nilaiList.get(i));
        }
    }
    
    // Getter dan Setter
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

    public List<Character> getNilaiList() {
        return nilaiList;
    }

    public void setNilaiList(List<Character> nilaiList) {
        this.nilaiList = nilaiList;
    }
}
