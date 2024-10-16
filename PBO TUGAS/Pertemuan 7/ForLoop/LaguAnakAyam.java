package ForLoop;


public class LaguAnakAyam {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int anakAyam = 10; 


         for (int i = anakAyam; i > 0; i--) {
          if (i > 1) {
                System.out.println("ANAK AYAM TURUN " + i + ", MATI SATU TINGGAL " + (i - 1));
            } else {
                System.out.println("ANAK AYAM TURUN 1, MATI SATU TINGGAL INDUKNYA");
        }
    }
    }
}
