/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Yudhi Putra
 * TGL 22 Maret 2025
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai = 0;
        String nama = "";
        String nim = "";
        String ket = "";
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nama Mahasiswa: ");
        nama = dtIN.nextLine();
        System.out.print("NIM: ");
        nim = dtIN.nextLine();
        System.out.print("Input Nilai Ujian: ");
        nilai = Integer.parseInt(dtIN.nextLine() );
        
        
        //keterangan berisikan Lulus apabila nilai 60 ke atas
        if(nilai >= 60){
            ket = "Lulus";
        }else{
            ket = "Tidak Lulus";
        }
        
        System.out.printf("Nilai Mahasiswa dengan nama %s (%s) adalah %d dinyatakan %s",nama,nim,nilai,ket);
        
         //keterangan berisikan Tidak Lulus jika nilai dibawa 60
        
    }
    
}
