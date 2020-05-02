/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus2;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;

public class arraySatuDimensi2 {

    static int[] inputArray(int panjang) {
        Scanner input = new Scanner(System.in);
        int[] elemen = new int[panjang];
        for (int i = 0; i < panjang; i++) {
            System.out.print("masukkan Array ke " + i + " = ");
            elemen[i] = input.nextInt();
        }
        return elemen;
    }

    static void TampilArray(int[] cetak) {
        for (int i = 0; i < cetak.length; i++) {
            System.out.println("Nilai Akhir Index " + i + " = " + cetak[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nilai = new int[6];
        nilai = inputArray(6);
        System.out.println();
        TampilArray(nilai);
        System.out.println();
    }
}
