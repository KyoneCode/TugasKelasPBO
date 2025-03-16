package AKADEMIK;

public class Main {
    public static void main(String[] args) {
        // Buat Fakultas
        Fakultas fakTeknik = new Fakultas("Teknik");

        // Buat Program Studi
        ProgramStudi prodiInformatika = new ProgramStudi("Informatika", "IF");
        fakTeknik.tambahProdi(prodiInformatika);

        // Buat Dosen
        Dosen dosen1 = new Dosen("Dr. Andi", "Jl. Merdeka", "andi@kampus.ac.id", "123456", "Profesor");

        // Buat Mata Kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        prodiInformatika.tambahMataKuliah(mk1);
        prodiInformatika.tambahMataKuliah(mk2);

        // Buat Kelas
        Kelas kelas1 = new Kelas("IF101-01", "Senin 08:00-10:00", mk1, dosen1);
        Kelas kelas2 = new Kelas("IF102-02", "Rabu 10:00-12:00", mk2, dosen1);

        // Buat Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", "Jl. Mawar", "budi@student.ac.id", "22001", 2022, "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Ani", "Jl. Melati", "ani@student.ac.id", "22002", 2022, "Informatika");

        // Set Dosen Wali
        mhs1.setDosenWali(dosen1);
        mhs2.setDosenWali(dosen1);

        // Buat Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Mobil", "B 1234 ABC");
        Kendaraan kendaraan2 = new Kendaraan("Motor", "H 5678 DEF");

        // Set Kendaraan Mahasiswa
        mhs1.setKendaraan(kendaraan1);
        mhs2.setKendaraan(kendaraan2);

        // Mahasiswa mengambil mata kuliah
        mhs1.addMatkul(mk1);
        mhs2.addMatkul(mk1);
        mhs2.addMatkul(mk2);

        // Mahasiswa mendaftar ke kelas
        kelas1.tambahMahasiswa(mhs1);
        kelas1.tambahMahasiswa(mhs2);
        kelas2.tambahMahasiswa(mhs2);

        // Cetak Informasi Fakultas & Program Studi
        fakTeknik.printInfo();
        prodiInformatika.printInfo();

        // Cetak Informasi Mata Kuliah
        mk1.printInfo();
        mk2.printInfo();

        // Cetak Informasi Kelas
        kelas1.printInfo();
        kelas2.printInfo();

        // Cetak Informasi Mahasiswa
        mhs1.printInfo();
        mhs2.printInfo();

        // Cetak Informasi Dosen
        dosen1.printInfo();
    }
}
