package bookinghotel;

import java.util.ArrayList;

class Pemesanan {
    String kamar;
    int jumlahPenginap;
    ArrayList<Penginap> penginapList = new ArrayList<>();
    int lamaInap;
    int tambahanKasur;

    public Pemesanan(String kamar, int jumlahPenginap, ArrayList<Penginap> penginapList, int lamaInap, int tambahanKasur) {
        this.kamar = kamar;
        this.jumlahPenginap = jumlahPenginap;
        this.penginapList = penginapList;
        this.lamaInap = lamaInap;
        this.tambahanKasur = tambahanKasur;
    }

    public String toString() {
        String dataPenginap = "";
        for (Penginap penginap : penginapList) {
            dataPenginap += "Nama: " + penginap.nama + ", NIK: " + penginap.nik + ", Umur: " + penginap.umur + "\n";
        }
        return "Kamar: " + kamar + "\nJumlah Penginap: " + jumlahPenginap + "\nData Penginap:\n" + dataPenginap +
               "Lama Inap: " + lamaInap + " malam\nTambahan Kasur: " + tambahanKasur +
               "\nHarga per malam: Rp " + getHargaPerMalam() +
               "\nTotal harga untuk " + lamaInap + " malam: Rp " + getTotalHarga();
    }

    public int getHargaPerMalam() {
        switch (kamar) {
            case "Kamar Biasa": return 200000;
            case "Kamar Lumayan": return 350000;
            case "Kamar Gacor": return 500000;
            case "Kamar Gacor Banget": return 700000;
            default: return 0;
        }
    }

    public int getTotalHarga() {
        int total = getHargaPerMalam() * lamaInap;
        total += tambahanKasur * 20000;
        if (jumlahPenginap > 2) {
            total += (jumlahPenginap - 2) * 30000;
        }
        return total;
    }
}
