package Pertemuan_3;


public class DemoKonversiSuhu {

    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        double celcius = 70;
        double fahrenheit = 217;
        
        System.out.println("Konversi dari Celcius ke Fahrenheit: " + konversiSuhu.celciusKeFahrenheit(celcius));
        System.out.println("Konversi dari Celcius ke Reamur: " + konversiSuhu.celciusKeReamur(celcius));
        System.out.println("Konversi dari Fahrenheit ke Reamur: " + konversiSuhu2.fahrenheitKeReamur(fahrenheit));
    }
}