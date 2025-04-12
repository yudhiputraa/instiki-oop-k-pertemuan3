/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan301;

import javax.swing.JOptionPane;

/**
 *
 * @author Yudhi Putra
 * TGL 22 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int naw = 0;
        
        naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal") );
        
        int awal = naw;
        int akhir = 10;
        akhir = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir") );
        
        System.out.println("Perulangan While");
        while(awal<akhir) {
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }
        
        System.out.println("Perulangan Do..While");
        awal = naw;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while(awal<akhir);
        
        System.out.println("Perulangan dengan For");
        for (awal=naw; awal<akhir; awal++){
            System.out.println("Perulangan ke-"+awal);
        }
    }
    
}
