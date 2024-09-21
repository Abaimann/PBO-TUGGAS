package Pertemuan_1;
public class Nilai {
    int nim;
    String nama;
    double Absen;
    double Tugas;
    double Uts;
    double Uas;   
    double akhir;
    
    void nilai(){
    akhir = (Uas * 0.40) + (Absen * 0.10) + (Tugas * 0.20) + (Uts * 0.30);
    Uas = Uas * 0.40;
    Uts = Uts * 0.30;
    Absen = Absen * 0.10;
    Tugas = Tugas * 0.20;
    }
    
    void cetakNilai() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + Absen);
        System.out.println("Nilai Tugas [20%] : " + Tugas);
        System.out.println("Nilai UTS [30%] : " + Uts);
        System.out.println("Nilai UAS [40%] : " + Uas);
        System.out.println("Nilai Akhir : " + akhir);
    }
}