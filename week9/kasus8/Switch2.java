/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus8;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang,lebar,luas,keliling,pilihan;
        
        System.out.println("== Menghitung Luas dan Keliling Persegi Panjang ==");
        System.out.print("Masukan panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukan lebar   : ");
        lebar = input.nextInt();
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("Masukan pilihan : ");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1 :
                luas = panjang * lebar;
                System.out.println("Luas Persegi Panjang : "+luas);
            break;
            
            case 2 :
                keliling = 2 * (panjang + lebar);
                System.out.println("Keliling Persegi Panjang : "+keliling);
            break;
        }
        
    }
}
