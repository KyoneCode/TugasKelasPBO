package AKADEMIK;

public class Pegawai extends Orang {
    //atribut
    protected String nip;
    protected String jabatan;
    //metode
    //konstruktor
    public Pegawai(){}
    public Pegawai(String nip, String jabatan, String nama, String alamat, String email){
        super(nama, alamat, email);
        this.nip = nip;
        this.jabatan = jabatan;
    }

    public String getNip(){
        return nip;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    @Override
public void printInfo() {
    super.printInfo(); 
    System.out.printf("| %-15s | %-26s |\n", "NIP", nip);
    System.out.printf("| %-15s | %-26s |\n", "Jabatan", jabatan);
    System.out.printf("+-----------------+----------------------------+\n");
}
}
