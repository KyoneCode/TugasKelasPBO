// package AKADEMIK;

public class Tendik extends Pegawai {
    protected String bidang;

    // konstruktor
    public Tendik(){
        super();
        bidang = "";
    }
    
    public Tendik(String nip, String jabatan, String nama, String alamat, String email, String bidang) {
        super(nip, jabatan, nama, alamat, email);
        this.bidang = bidang;
    }

    // getter
    public String getBidang() {
        return bidang;
    }

    // setter
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        super.printInfo(); 
        System.out.printf("| %-15s | %-26s |\n", "Bidang", bidang);
        System.out.printf("+-----------------+----------------------------+\n");
    }
}

