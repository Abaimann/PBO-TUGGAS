package While;


public class BilanganPrima {
    public static void main(String[] args) {
        int angka = 0;

        while (angka <= 20) {
            int faktor = 0;
            
            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    faktor++;
                }
            }

            if (faktor == 2) {
                System.out.println(angka + " : BILANGAN PRIMAA");
            } else {
                System.out.println(angka + " : BUKAN PRIMA");
            }

            angka++;
        }
    }
}
