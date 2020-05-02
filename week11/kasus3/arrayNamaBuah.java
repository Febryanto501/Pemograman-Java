/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus3;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class arrayNamaBuah {
     static String[] inputArray(int panjang) {
        Scanner input = new Scanner(System.in);
        String[] elemen = new String[panjang];
        for (int i = 0; i < panjang; i++) {
            System.out.print("Buah ke-" + i + ": ");
            elemen[i] = input.nextLine();
        }
        return elemen;
    }

    static void TampilArray(String[] cetak) {
        for (int i = 0; i < cetak.length; i++) {
            System.out.println(cetak[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] nilai = new String[5];
        nilai = inputArray(5);
        System.out.println("=========================");
        TampilArray(nilai);
        System.out.println();
    }
}
