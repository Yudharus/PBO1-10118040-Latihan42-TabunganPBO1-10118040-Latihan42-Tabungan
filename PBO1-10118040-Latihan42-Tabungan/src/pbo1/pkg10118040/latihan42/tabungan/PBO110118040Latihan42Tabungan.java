/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author asus
 *  NAMA  : Moch Yudha Rusdian
 * KELAS : IF 1
 * NIM   : 10118040
 * Deskripsi Program : Program ini untuk menampilkan output saldo tabungan.
 */
public class PBO110118040Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn = new Scanner (System.in);
        
        System.out.println("=======Program Penarikan Uang=======");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        System.out.print("Jumlah uang yang diambil : ");        
        System.out.print("Saldo anda Sekarang : " 
                + tabungan.ambilUang(scn.nextInt())+ "\n");
    }
    
}
    

