/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan42.tabungan;

/**
 *
 * @author MERDEFI
 */


import java.util.Scanner;
public class PBOIF210119084Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int jumlahAmbil;
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        //inisialisasi objek tabungan
        Tabungan tabungan = new Tabungan(keyboard.nextInt());
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlahAmbil = tabungan.ambilUang(keyboard.nextInt());
        System.out.println("Saldo Anda Sekarang : " + jumlahAmbil);
    }
    
}
