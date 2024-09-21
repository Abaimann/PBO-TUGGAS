package Pertemuan_2;


public class Bingo {
    private String farmerPart;
    private String bingoPart;
    private String hisNamePart;
    private String[] claps;

    public Bingo() {
        this.farmerPart = "There was a farmer who had a dog, And Bingo was his name-o.";
        this.bingoPart = "B-I-N-G-O";
        this.hisNamePart = "And Bingo was his name-o.";
        this.claps = new String[]{"(clap)", "(clap)(clap)", "(clap)(clap)(clap)", "(clap)(clap)(clap)(clap)", "(clap)(clap)(clap)(clap)(clap)"};
    }

    public void singVerse(int verse) {
        System.out.println(farmerPart);
        printClaps(verse);
        printClaps(verse);
        printClaps(verse);
        System.out.println(hisNamePart);
    }

    private void printClaps(int verse) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < verse; i++) {
            line.append("(clap)-");
        }
        for (int i = verse; i < 5; i++) {
            line.append(bingoPart.charAt(2 * i)).append("-");
        }
        line.setLength(line.length() - 1);
        System.out.println(line.toString());
    }

    public void singSong() {
        for (int i = 0; i <= 5; i++) {
            singVerse(i);
            System.out.println();
        }
    }
}