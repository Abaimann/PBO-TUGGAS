/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class InputDataMahasiswa {
    ArrayList<BioMahasiswa> listmahasiswa;
    public InputDataMahasiswa() {
        listmahasiswa = new ArrayList ();
    }
    public void insertData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        BioMahasiswa mhs = new BioMahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listmahasiswa.add(mhs);
    }
    public ArrayList<BioMahasiswa> getALL() {
        return listmahasiswa;
    }
    public void deleteData(int index) {
        listmahasiswa.remove(index);
    }
}
