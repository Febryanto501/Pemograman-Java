/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus11;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;

public class MenghitungHari {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        int bulan, tahun;
        System.out.println("PROGRAM MENGETAHUI HARI DALAM BULAN");
        System.out.println("");
        System.out.print("Masukan tahun : ");
        tahun = masuk.nextInt();
        System.out.print("Masukan bulan : ");
        bulan = masuk.nextInt();
        switch (bulan) {
            case 1:
                System.out.println("Jumlah Hari = 31 hari");
               break;
            case 2:
                if (tahun % 400 == 0) {
                    System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 29 hari");
                }
                else if ((tahun % 400 != 0) && (tahun % 100 == 0)) {
                    System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 28 hari");
                }
                else if ((tahun % 400 != 0) && (tahun % 100 != 0) && (tahun % 4 == 0)) {
                    System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 29 hari"); 
                }
                else {
                    System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 28 hari"); 
                }
            break;
            case 3:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            case 4:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 30 hari");
            break;
            case 5:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            case 6:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 30 hari");
            break;
            case 7:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            case 8:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            case 9:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 30 hari");
            break;
            case 10:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            case 11:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 30 hari");
            break;
            case 12:
                System.out.println("Jumlah Hari pada tahun "+tahun+ " bulan "+bulan+ " adalah 31 hari");
            break;
            default:
                System.out.println("Program Error!! ");
            break;
        }
    }
}
