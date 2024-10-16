package While;


public class LaguAnakAyam{
    public static void main(String[] args) {
        int anakAyam = 10;

        while (anakAyam > 0) {
            if (anakAyam > 1) {
                System.out.println("ANAK AYAM TURUN " + anakAyam + ", MATI SATU TINGGAL " + (anakAyam - 1));
            } else {
                System.out.println("ANAK AYAM TURUN 1, MATI SATU TINGGAL INDUKNYA");
            }
            anakAyam--;
        }
    }
}
