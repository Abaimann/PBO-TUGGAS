package Pertemuan_5;
import java.util.Scanner;

public class Menentukan_BeratBadan {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("MASUKAN TINGGI BADAN ANDA : ");
        double tinggi_badan = input.nextDouble();
        
        System.out.print("MASUKAN BERAT BADAN ANDA : ");
        double berat_badan = input.nextDouble();
        
        double imt = (berat_badan / (tinggi_badan * tinggi_badan));
        double i = imt;
        
        System.out.println("IMT = " + imt);
        
        if (i <= 18.4){
            System.out.println("BERAT BADAN KURANG");
        }else if (i >= 18.4 && i <= 24.9){
            System.out.println("BERAT BADAN IDEAL");
        }else if (i >= 24.9 && i <= 29.9){
            System.out.print("BERAT BADAN LEBIH");
        }else if (i >= 29.9 && i <= 39.9){
            System.out.println("GEMUK");
        }else if (i >= 40){
            System.out.println("SANGAT GEMUK");
        }
    }
    
}
