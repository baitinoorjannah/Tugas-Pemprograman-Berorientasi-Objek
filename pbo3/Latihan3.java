/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan3 {
    public static void main(String[] args) {
        String jawaban,jawaban1 = null;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Apakah anda mahasiswa? (iya) ");
        jawaban = scan.next();
        
        if(("iya".equals(jawaban))|| ("IYA".equals(jawaban1)) ){
            System.out.print("Apakah anda selalu terlambat masuk kelas ?");
            jawaban1 = scan.next();
            
        if(("tidak".equals(jawaban1))||("TIDAK".equals(jawaban1)) ){
            System.out.print("Bagus, Pertahankan!!!");   
            }
        }
    }
    
}
