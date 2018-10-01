/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan23.besarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Nilai Terbesar dan Terkecil
 *  
 */
public class PBO310117116Latihan23BesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
          
        int n,nilai[];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String Petugas;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai "
                           + "Mahasiswa=====");
        
        System.out.print("Masukan Nama Petugas : ");
        Petugas = input.next();
        
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for(int i=0; i<=n-1; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
            
        if (nilai[i] > max) {
            max=nilai[i];
        }
        if (nilai[i] < min) {
            min=nilai[i];
        }
            
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        for(int i=0; i<=n-1; i++) {
        System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : " + nilai[i]);
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        
        System.out.println("");
        System.out.println("Petugas : " + Petugas);
       }
    }  

