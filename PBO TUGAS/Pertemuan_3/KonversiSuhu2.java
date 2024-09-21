package Pertemuan_3;


class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitKeReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius * 4/5;
    }
}

