/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan42.tabungan;

/**
 *
 * @author asus
 */
public class Tabungan {
    
private final int saldo;
    
    
    public Tabungan(int saldo) {  
      this.saldo = saldo;
    }

    public int ambilUang (int jumlah){
        return saldo - jumlah;
    }
    
}

