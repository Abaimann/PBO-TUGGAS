package bookinghotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements IPemesanan {
    static ArrayList<Pemesanan> historyPemesanan = new ArrayList<>();

    static final String USERNAME = "Aiman"; 
    static final String PASSWORD = "12345"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(); 

        while (true) {
            System.out.println("Selamat datang! Mau login sebagai siapa ? :");
            System.out.println("1. Pemesan");
            System.out.println("2. Admin");
            System.out.println("3. Selesai");
            System.out.print("Masukkan pilihan Anda (1, 2, atau 3): ");

            String pilihan = scanner.nextLine();

            if ("1".equals(pilihan)) {
                menu.tampilkanMenuPemesan(scanner); 
            } else if ("2".equals(pilihan)) {
                System.out.println("Silahkan login, masukkan username dan password:");
                if (menu.loginAdmin(scanner)) {
                    menu.tampilkanMenuAdmin(scanner);  
                } else {
                    System.out.println("Login gagal. Kembali ke menu utama.");
                }
            } else if ("3".equals(pilihan)) {
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break; 
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close(); // Menutup scanner setelah selesai
    }
    
    public static boolean loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa username dan password
        return username.equals(USERNAME) && password.equals(PASSWORD); // Login berhasil atau gagal
    }

    public void tampilkanMenuPemesan(Scanner scanner) {
        while (true) {
            System.out.println("\nAnda memilih sebagai Pemesan. Pilih menu berikut:");
            System.out.println("1. Cek kamar kosong");
            System.out.println("2. Memesan kamar");
            System.out.println("3. Cetak bukti pemesanan");
            System.out.println("4. Kembali ke menu utama");
            System.out.println("5. Selesai");
            System.out.print("Masukkan pilihan Anda: ");

            String pilihan = scanner.nextLine();
            switch (pilihan) {
                case "1":
                    cekKamarKosong(scanner);
                    break;
                case "2":
                    pesanKamar(scanner);
                    break;
                case "3":
                    cetakBuktiPemesanan(scanner);
                    break;
                case "4":
                    return; 
                case "5":
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    System.exit(0); 
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public void tampilkanMenuAdmin(Scanner scanner) {
        while (true) {
            System.out.println("\nAnda memilih sebagai Admin. Pilih menu berikut:");
            System.out.println("1. Cek kamar kosong");
            System.out.println("2. Memesan kamar");
            System.out.println("3. Cetak bukti pemesanan");
            System.out.println("4. Cek history pemesanan");
            System.out.println("5. Kembali ke menu utama");
            System.out.println("6. Selesai");
            System.out.print("Masukkan pilihan Anda: ");

            String pilihan = scanner.nextLine();
            switch (pilihan) {
                case "1":
                    cekKamarKosong(scanner);
                    break;
                case "2":
                    pesanKamar(scanner);
                    break;
                case "3":
                    cetakBuktiPemesanan(scanner);
                    break;
                case "4":
                    cekHistoryPemesanan(scanner);
                    break;
                case "5":
                    return; 
                case "6":
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    System.exit(0); 
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public void cekKamarKosong(Scanner scanner) {
        System.out.println("\nKamar yang tersedia:");
        System.out.println("1. Kamar Biasa (Rp 200.000 per malam)");
        System.out.println("2. Kamar Lumayan (Rp 350.000 per malam)");
        System.out.println("3. Kamar Gacor (Rp 500.000 per malam)");
        System.out.println("4. Kamar Gacor Banget (Rp 700.000 per malam)");

        System.out.print("\nIngin kembali ke menu Pemesan? Ketik 'kembali' jika iya, ketik 'selesai' jika tidak: ");
        String pilihan = scanner.nextLine();

        if ("kembali".equalsIgnoreCase(pilihan)) {
            return; // Kembali ke menu Pemesan
        } else if ("selesai".equalsIgnoreCase(pilihan)) {
            System.out.println("Terima kasih! Sampai jumpa.");
            System.exit(0); 
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public void pesanKamar(Scanner scanner) {
        System.out.println("\nKamar yang tersedia untuk dipesan:");
        System.out.println("1. Kamar Biasa (Rp 200.000 per malam)");
        System.out.println("2. Kamar Lumayan (Rp 350.000 per malam)");
        System.out.println("3. Kamar Gacor (Rp 500.000 per malam)");
        System.out.println("4. Kamar Gacor Banget (Rp 700.000 per malam)");

        System.out.print("\nPilih kamar yang ingin dipesan (1-4): ");
        String pilihanKamar = scanner.nextLine();
        String kamar = "";

        switch (pilihanKamar) {
            case "1":
                kamar = "Kamar Biasa";
                break;
            case "2":
                kamar = "Kamar Lumayan";
                break;
            case "3":
                kamar = "Kamar Gacor";
                break;
            case "4":
                kamar = "Kamar Gacor Banget";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.print("Berapa jumlah penginap: ");
        int jumlahPenginap = Integer.parseInt(scanner.nextLine()); // Menggunakan nextLine dan parseInt
        ArrayList<Penginap> penginapList = new ArrayList<>();
        
        for (int i = 1; i <= jumlahPenginap; i++) {
            System.out.println("Data Penginap " + i);
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIK: ");
            String nik = scanner.nextLine();
            System.out.print("Umur: ");
            int umur = Integer.parseInt(scanner.nextLine()); // Menggunakan nextLine dan parseInt
            penginapList.add(new Penginap(nama, nik, umur));
        }

        System.out.print("Masukkan lama inap (dalam malam): ");
        int lamaInap = Integer.parseInt(scanner.nextLine()); // Menggunakan nextLine dan parseInt

        System.out.print("Apakah Anda membutuhkan kasur tambahan? (Ya/Tidak): ");
        String jawab = scanner.nextLine();
        int tambahanKasur = 0;

        if (jawab.equalsIgnoreCase("Ya")) {
            System.out.print("Berapa jumlah kasur tambahan? ");
            tambahanKasur = Integer.parseInt(scanner.nextLine()); // Menggunakan nextLine dan parseInt
        }

        Pemesanan pemesanan = new Pemesanan(kamar, jumlahPenginap, penginapList, lamaInap, tambahanKasur);
        historyPemesanan.add(pemesanan);

        System.out.println("\nPemesanan berhasil! Ini detail pemesanan Anda:");
        System.out.println(pemesanan);
    }

    public void cetakBuktiPemesanan(Scanner scanner) {
        System.out.print("Masukkan nama pemesan untuk cetak bukti: ");
        String namaPemesan = scanner.nextLine();

        for (Pemesanan pemesanan : historyPemesanan) {
            for (Penginap penginap : pemesanan.penginapList) {
                if (penginap.nama.equalsIgnoreCase(namaPemesan)) {
                    System.out.println("\nBerikut bukti pemesanan untuk " + namaPemesan + ":");
                    System.out.println(pemesanan);
                    return;
                }
            }
        }

        System.out.println("Tidak ada pemesanan untuk nama: " + namaPemesan);
    }

    public void cekHistoryPemesanan(Scanner scanner) {
        if (historyPemesanan.isEmpty()) {
            System.out.println("Belum ada history pemesanan.");
        } else {
            System.out.println("History Pemesanan:");
            for (Pemesanan pemesanan : historyPemesanan) {
                System.out.println(pemesanan);
                System.out.println("--------------------------");
            }
        }
    }
}
