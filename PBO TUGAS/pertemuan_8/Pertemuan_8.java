package pertemuan_8;
import java.util.Scanner;

public class Pertemuan_8 {
    
    static String[] kodeBarang = {"a001", "a002", "a003"};
    static String[] namaBarang = {"BUKU", "PENSIL", "PULPEN"};
    static int[] hargaBarang = {35000, 42000, 51000};
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("MASUKAN JUMLAH BARANG : ");
        
        int jumlahItem = input.nextInt();
        
        
        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayarPerItem = new int[jumlahItem];
        int totalBayar = 0;
        
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("DATA KE " + (i + 1));
            System.out.print("MASUKAN KODE : ");
            
            kodeInput[i] = input.next();
            
            System.out.print("MASUKAN JUMLAH BELI : ");
            jumlahBeli[i] = input.nextInt();
     }
        
        
            System.out.println("\nTOKO SERBA ADA");
            System.out.println("===============================");
            System.out.println("NO  KODE BARANG  NAMA BARANG  HARGA  JUMLAH BELI  JUMLAH BAYAR");
            System.out.println("=============================================================");
        
        for (int i = 0; i < jumlahItem; i++) {
            int indexBarang = cariBarang(kodeInput[i]);
            if (indexBarang != -1) {
                totalBayarPerItem[i] = hargaBarang[indexBarang] * jumlahBeli[i];
                totalBayar += totalBayarPerItem[i];
                System.out.printf("%-3d %-12s %-12s %-7d %-12d %-12d\n",
                        (i + 1), kodeBarang[indexBarang], namaBarang[indexBarang], hargaBarang[indexBarang], jumlahBeli[i], totalBayarPerItem[i]);
         } else {
                System.out.println("EROR");
         }
     }
        
        System.out.println("=============================================================");
        System.out.println("TOTAL BAYAR : " + totalBayar);
 }

    
    public static int cariBarang(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equals(kode)) {
                return i;
         }
     }
        return -1;
    }
}
