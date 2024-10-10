package bookinghotel;

import java.util.Scanner;

interface IPemesanan {
    void cekKamarKosong(Scanner scanner);
    void pesanKamar(Scanner scanner);
    void cetakBuktiPemesanan(Scanner scanner);
    void cekHistoryPemesanan(Scanner scanner);
}