package pertemuan_4;


public class Hitung {


    public static void main(String[] args) {
        // TODO code application logic here
        RumusBangunRuang rumus = new RumusBangunRuang();
        double sisi = 7;
        double panjang = 14;
        double lebar = 10;
        double tinggi = 11;
        double rusuk = 7;
        
        
        System.out.println("Volume kubus adalah " + rumus.Volume(sisi));
        System.out.println("luas kubus adalah " + rumus.Luas(rusuk));
        System.out.println("Volume balok adalah " + rumus.Volume(panjang,lebar,tinggi));
        System.out.println("luas balok adalah " + rumus.Luas(panjang,lebar,tinggi));
    }
    
}
