/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

/**
 *
 * @author Geral Tritama Wahyuady
 */
public class DemoNilai {
    public static void main (String args[]){
       Nilai nilaiMHS = new Nilai(); // panggil fungsi nya, dan buat object baru
        
       nilaiMHS.npm = "2410631170070";
       nilaiMHS.nama = "Geral Tritama Wahyuady";
       nilaiMHS.nilaiAbsen = 100;
       nilaiMHS.nilaiTugas = 90;
       nilaiMHS.nilaiUTS = 95;
       nilaiMHS.nilaiUAS = 80;

       nilaiMHS.nilai(); 
       nilaiMHS.cetakNilai(); 
    }
}
