/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program menghitung nilai rata-rata yang inputannya berasal dari user.
 * 
 */
public class PBO6K10116599Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int  banyakMahasiswa;
        double nilai;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scan = new Scanner(System.in);
        banyakMahasiswa = scan.nextInt();
        
        int i;
        i=1;
         do {
              System.out.print("Nilai Mahasiswa ke-" +i+ " : ");
              i++;
        nilai = scan.nextInt();
         } while(i<=banyakMahasiswa);
       
        System.out.println("Maka, rata-rata nilainya adalah "+((nilai/banyakMahasiswa)));
                
    }
    
}
