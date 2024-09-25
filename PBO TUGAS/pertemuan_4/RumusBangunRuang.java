package pertemuan_4;


public class RumusBangunRuang {
    double Volume (double sisi) {
        double volume = (sisi * sisi * sisi);
        return volume;
    }
    
    double Luas (double panjang, double lebar, double tinggi) {
        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luas;
    }
    
    double Volume (double panjang , double lebar, double tinggi) {
        double volume = (panjang * lebar * tinggi);
        return volume;
    }
    
    double Luas (double rusuk){
        double luas = (rusuk * rusuk * 6);
        return luas;
    }
    
}
