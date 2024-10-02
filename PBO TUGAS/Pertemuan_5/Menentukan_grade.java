package Pertemuan_5;
import java.util.Scanner;

public class Menentukan_grade {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("NPM : " );
        String npm = input.nextLine();

        System.out.print("NAMA MAHASISWA : " );
        String nama = input.nextLine();
        
        System.out.print("NILAI KEHADIRAN : " );
        double n_hadir = input.nextDouble();
        
        System.out.print("NILAI TUGAS : " );
        double n_tugas = input.nextDouble();
        
        System.out.print("NILAI UTS : " );
        double n_uts = input.nextDouble();
        
        System.out.print("NILAI UAS : " );
        double n_uas = input.nextDouble();
        
        double n_rata = ((0.1 * n_hadir) + (0.2 * n_tugas) +(0.3 * n_uts) + (0.4 * n_uas));
        double i = n_rata;
        String grade = "";
        String keterangan = "";
        
        
        if(i <= 45){
            grade = "E";
            keterangan = "KURANG SEKALI";
        }else if (i >= 45 && i <= 55){
            grade = "D";
            keterangan = "KURANG";
        }else if (i >= 55 && i <= 65){
            grade = "C";
            keterangan = "CUKUP";
        }else if (i >= 65 && i <= 75){
            grade = "B";
            keterangan = "BAIK";
        }else if (i >= 75 && i <= 100){
            grade = "A";
        keterangan = "ISTIMEWA";
        }
        
        System.out.println("NILAI AKHIR -- GRADE -- KETERANGAN ");
        System.out.println(n_rata + "  " + grade + "  " + keterangan);
        
        
        
        
       
        
    }
    
}
