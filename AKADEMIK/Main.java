// package AKADEMIK;

public class Main {
    public static void main(String[] args) {
        // Buat Fakultas
        Fakultas fakTeknik = new Fakultas("Teknik", "E11");
        Fakultas fakSains = new Fakultas("Sains dan Matematika", "E08");
        fakTeknik.printInfo();
        fakSains.printInfo();

        // Buat Program Studi
        ProgramStudi prodiInformatika = new ProgramStudi("Informatika", "06");
        ProgramStudi prodiFisika = new ProgramStudi("Fisika", "02");
        prodiFisika.printInfo();
        prodiInformatika.printInfo();

        // Menambahkan Prodi ke Fakultas
        fakTeknik.tambahProdi(prodiInformatika);
        fakSains.tambahProdi(prodiFisika);
        fakTeknik.printInfo();
        fakSains.printInfo();

        // Buat Dosen
        Dosen dosen1 = new Dosen("12345", "Dosen Tetap", "Andi", "Jl. Merdeka No. 25", "Andi@gmail.com", "Fisika");
        dosen1.printInfo();

        Dosen dosen2 = new Dosen("44553378", "Dosen Tetap", "Rinaldi Munir", "Jl. Mawar No. 56", "RinaldiMunir@yahoo.com", "Informatika");
        dosen2.printInfo();

        // Buat Tendik
        Tendik tendik1 = new Tendik("432987", "Tendik", "Sumargo", "Jl. Pondok Gede No. 41", "Sumargo12@gmail.com", "Kemahasiswaan");
        tendik1.printInfo();

        // Buat Mata Kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        prodiInformatika.tambahMataKuliah(mk1);
        prodiInformatika.tambahMataKuliah(mk2);
        mk1.printInfo();
        mk2.printInfo();

        // Buat Kelas
        Kelas kelas1 = new Kelas("IF101-01", "Senin 08:00-10:00", mk1, dosen1);
        Kelas kelas2 = new Kelas("IF102-02", "Rabu 10:00-12:00", mk2, dosen1);
        kelas1.printInfo();
        kelas2.printInfo();

        // Buat Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", "Jl. Mawar", "budi@student.ac.id", "22001", 2022, "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Ani", "Jl. Melati", "ani@student.ac.id", "22002", 2022, "Informatika");
        mhs1.printInfo();
        mhs2.printInfo();

        // Set Dosen Wali
        mhs1.setDosenWali(dosen2);
        mhs2.setDosenWali(dosen2);

        //Mahasiswa mengisi Irs
        Irs irsMhs1 = new Irs(mhs1);
        irsMhs1.tambahMataKuliah(mk1);
        mhs1.setIrs(irsMhs1);
        mhs1.printInfo();
        // System.out.println(mhs1.getIrs().getJumlahSks());
        // System.out.println(mhs1.getSksMaksimal());
        irsMhs1.tambahMataKuliah(mk2);
        mhs1.printInfo();

        // Mahasiswa mendaftar ke kelas
        kelas1.tambahMahasiswa(mhs1);
        kelas1.tambahMahasiswa(mhs2);
        kelas2.tambahMahasiswa(mhs2);
        kelas1.printInfo();
        kelas2.printInfo();

        //Print Info Mahasiswa
        mhs1.printInfo();

        //Cetak IRS 
        mhs1.getIrs().cetakIRS();

        //buat KHS
        Khs khsMhs1 = new Khs(irsMhs1);

        //Tambahkan Nilai ke KHS
        khsMhs1.tambahNilai(mk1, 'A');
        khsMhs1.tambahNilai(mk1, 'Y');

        // Cetak KHS mahasiswa
        khsMhs1.cetakKHS();

        //End Main
        System.out.println("\nIni sudah selesai");
        
    }
}
