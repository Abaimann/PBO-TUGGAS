package Pertemuan_3;


public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();
    
        System.out.println("10 % 20 = " + mtk.Modulus(10, 20));
        System.out.println("10 + 20 = " + mtk.Pertambahan(10, 20));
        System.out.println("20 - 10 = " + mtk.Pengurangan(20, 10));
        System.out.println("5 X 10 = " + mtk.Perkalian(5, 10));
        System.out.println("10 : 5 = " + mtk.Pembagian(10,5));
    }
}