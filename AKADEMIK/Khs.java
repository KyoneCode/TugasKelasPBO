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
    
            nilaiList.add(nilai);
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
        System.out.println("Nama         : " + IRS.getMahasiswa().getNama());
        System.out.println("NIM          : " + IRS.getMahasiswa().getNim());
        System.out.println("-------------------------------------");
        System.out.printf("%-25s | %-5s\n", "Mata Kuliah", "Nilai");
        System.out.println("-------------------------------------");

        for (int i = 0; i < IRS.getMataKuliahList().size() - 1; i++) {
            System.out.printf("%-25s | %-5s\n", IRS.getMataKuliahList().get(i).getNama(), nilaiList.get(i));
        }
        System.out.println("-------------------------------------");
    }

}
