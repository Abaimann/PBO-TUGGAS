package DoWhile;


public class BilanganPrima {
    public static void main(String[] args) {
        int angka = 0;

        do {
            int faktor = 0;
            
            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    faktor++;
                }
            }

            if (faktor == 2) {
                System.out.println(angka + " : BILANGAN PRIMA");
            } else {
                System.out.println(angka + " : BUKAN PRIMA");
            }

            angka++;
        } while (angka <= 20);
    }
}
