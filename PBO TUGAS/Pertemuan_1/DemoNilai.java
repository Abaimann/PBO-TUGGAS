package Pertemuan_1;
public class DemoNilai {


    public static void main(String[] args) {
        
        Nilai hasil = new Nilai();
        
        hasil.nama = "Abdurrahman";
        hasil.nim = 7286482;
        hasil.Absen = 100;
        hasil.Tugas = 95;
        hasil.Uts = 89;
        hasil.Uas = 90;
        
        
        hasil.nilai();
        hasil.cetakNilai();   
    }
}