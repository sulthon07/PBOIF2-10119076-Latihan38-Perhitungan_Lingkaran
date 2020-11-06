/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan38.perhitungan.lingkaran;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Program Perhitungan Lingkaran
 */
public class PBOIF210119076Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.println("=====Perhitungan Lingkaran=====");
        lingkaran.inputDiameter();
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + lingkaran.hitungJariJari());
        System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());
    }
    
}
