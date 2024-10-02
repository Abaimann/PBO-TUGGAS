package Pertemuan_5;
import java.util.Scanner;

public class Diskon {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("JUAL STIKER GROSIRAN");
        System.out.println("SETIAP PEMBELIAN KURANG DARI 50.000 DAPAT DISKON 5%");
        System.out.println("SETIAP PEMBELIAN LEBIH DARI 50.000 DAPAT DISKON 20%");
        System.out.print("SAYA MEMBELI : ");
        double pembelian = input.nextDouble();
        double i = pembelian;
        double total_bayar = pembelian;
        
        if (i < 50000){
            total_bayar = total_bayar - (pembelian * 0.05);
            System.out.print("TOTAL : " + total_bayar);
        }else if (i >= 50000){
            total_bayar = total_bayar - (pembelian * 0.2);
            System.out.print("TOTAL : " + total_bayar);
        }
    }
    
}
