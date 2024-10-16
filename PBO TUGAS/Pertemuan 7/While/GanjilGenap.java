package While;


public class GanjilGenap {
    public static void main(String[] args) {
        int angka = 0;

        while (angka <= 20) {
            if (angka % 2 == 0) {
                System.out.println(angka + " : adalah bilangan genap.");
            } else {
                System.out.println(angka + " : adalah bilangan ganjil.");
            }
            angka++;
        }
    }
}
