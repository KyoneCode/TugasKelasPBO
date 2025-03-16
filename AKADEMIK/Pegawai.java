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

    public void setNip(String x){
        nip = x;
    }

    public void setJabatan(String x){
        jabatan = x;
    }
}
