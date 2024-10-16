package DoWhile;


public class GanjilGenap {
    public static void main(String[] args) {
        int angka = 0;

        do {
            if (angka % 2 == 0) {
                System.out.println(angka + " : BILANGAN PRIMA");
            } else {
                System.out.println(angka + " : BUKAN PRIMA");
            }
            angka++;
        } while (angka <= 20);
    }
}
