/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author Geral Tritama Wahyuady
 */
public class Nilai {
    //deklarasi variable dulu ges
    String npm, nama;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir; //var pecahan
    
    public void nilai(){ //fungsi untuk menghitung nilai dan mentotalkan semua nilainya
        nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    public void cetakNilai(){ //fungsi untuk menampilkan
        System.out.println("NPM                 : " + npm);
        System.out.println("Nama Lengkap        : " + nama);
        System.out.println("Nilai Absen [10%]   : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]   : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]     : " + nilaiUTS);
        System.out.println("Nilai UAS [40%]     : " + nilaiUAS);
        System.out.println("-----------------------------------------");
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
    }
}
