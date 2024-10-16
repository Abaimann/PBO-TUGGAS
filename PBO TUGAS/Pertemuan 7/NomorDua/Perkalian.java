package NomorDua;
import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("MASUKAN NILAI N (1-10): ");
        int n = input.nextInt();
        
        if (n < 1 || n > 10) {
            System.out.println("NILAI N HARUS ANTARA 1 SAMPAI 10.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }

        input.close();
    }
}

