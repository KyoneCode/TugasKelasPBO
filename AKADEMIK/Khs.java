import java.util.ArrayList;

public class Khs {
    // atribut
    private Irs IRS;
    private ArrayList<Character> nilaiList;
    
    // konstruktor
    public Khs() {
        this.IRS = new Irs();
        this.nilaiList = new ArrayList<>();
    }

    // getter dan setter
    public Irs getIRS() {
        return IRS;
    }

    public void setIRS(Irs IRS) {
        this.IRS = IRS;
    }

    public ArrayList<Character> getNilaiList() {
        return nilaiList;
    }

    public void setNilaiList(ArrayList<Character> nilaiList) {
        this.nilaiList = nilaiList;
    }

    public Khs(Irs irs) {
        this.IRS = irs;
        this.nilaiList = new ArrayList<>();
    }
    
    public void cetakKHS() {
        System.out.println("KHS Mahasiswa: " + IRS.getMahasiswa().getNama());
        for (int i = 0; i < IRS.getMataKuliahList().size(); i++) {
            System.out.println("Mata Kuliah: " + IRS.getMataKuliahList().get(i).getNama() + ", Nilai: " + nilaiList.get(i));
        }
    }
}
