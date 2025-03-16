package AKADEMIK;

public class Orang {
    protected String nama;
    protected String alamat;
    protected String email;

    public Orang(String nama, String alamat, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        System.out.printf("+-----------------+----------------------------+\n");
        System.out.printf("| %-15s | %-26s |\n", "Nama", nama);
        System.out.printf("| %-15s | %-26s |\n", "Alamat", alamat);
        System.out.printf("| %-15s | %-26s |\n", "Email", email);
        System.out.printf("+-----------------+----------------------------+\n");
    } 
}
