package ForLoop;


public class nomor1 {


    public static void main(String[] args) {
        // TODO code application logic here
    for (int i = 1;i <= 20; i++){
        if (i % 2 != 0 && i % 3 != 0 && i > 1 || i == 2 || i == 3){
            System.out.println(i + " : BILANGAN PRIMA");
        }else{
            System.out.println(i + " : BUKAN PRIMA");
        }
    }
    }
    
}