public class MataKuliahNilai {
    // Atribut
    private MataKuliah mataKuliah;
    private char nilai;
    // Konstruktor
    public MataKuliahNilai() {
        this.mataKuliah = new MataKuliah();
        this.nilai = ' ';
    }
    public MataKuliahNilai(MataKuliah mataKuliah, char nilai) {
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }
    // Getter dan Setter
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public char getNilai() {
        return nilai;
    }
    public void setNilai(char nilai) {
        this.nilai = nilai;
    }
}
