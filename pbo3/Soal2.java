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
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan bula (angka) : ");
        int kode = input.nextInt();
        
        switch(kode){
            case 1 :
                System.out.println("Januari");
                break;
            case 2 :
                System.out.println("Februari");
                break;
            case 3 :
                System.out.println("Maret");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("Mei");
                break;
            case 6 :
                System.out.println("Juni");
                break;
            case 7 :
                System.out.println("Juli");
                break;
            case 8 :
                System.out.println("Agustus");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("Oktober");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("Desember");
                break;
            case 13 :
                System.out.println("Sistem Error");
                break;
                
        
    }
    }
}