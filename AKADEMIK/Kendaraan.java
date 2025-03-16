package AKADEMIK;

public class Kendaraan {
    private String jenis; // Jenis kendaraan (Mobil atau Motor)
    private String noPlat; // Nomor Plat Kendaraan

    // Konstruktor default
    public Kendaraan() {
        this.jenis = "";
        this.noPlat = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String jenis, String noPlat) {
        this.jenis = jenis;
        this.noPlat = noPlat;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    // Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Method untuk mencetak informasi kendaraan
    public String getInfoKendaraan() {
        return "Jenis Kendaraan: " + jenis + ", No Plat: " + noPlat;
    }
}

