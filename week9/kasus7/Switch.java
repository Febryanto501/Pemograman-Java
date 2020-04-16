/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus7;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nim, nama;
        int pilihan;

        System.out.print("Masukan nim : ");
        nim = input.nextLine();
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.println("Pilihan :");
        System.out.println("1. Sistem Informasi");
        System.out.println("2. Teknik Industri");
        System.out.println("3. Teknik Informatika");
        System.out.println();
        System.out.print("Masukan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println(nama + " dengan nim " + nim + " memilih jurusan Sitem Informasi");
            break;
            case 2:
                System.out.println(nama+" dengan nim "+nim+" memilih jurusan Teknik Industri");
            break;
            case 3:
                System.out.println(nama+" dengan nim "+nim+" memilih jurusan Teknik Informatika");
            break;
        }

    }
}
