/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus6;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gapo,gol,masuk,bonus,masakerja;
        
        
        System.out.println("                    PT.Angin Ribut          ");
        System.out.println("          Jl.Sulawesi No.29 Jakarta Utara            ");
        System.out.println("=====================================================");
        System.out.print("Nama Karyawan       = ");
        String nama = input.nextLine();
        System.out.print("Golongan            = ");
        gol = input.nextInt();
        if(gol == 1){
            gapo = 1500000;
        }
        else if(gol == 2){
            gapo = 1200000;
        }
        else if(gol == 3){
            gapo = 1000000;
        }
        else if(gol == 4){
            gapo = 700000;
        }
        else{
            gapo = 0;
        }
        System.out.println("Laporan gaji Karyawan");
        System.out.println("Gaji Pokok  Karyawan      = "+gapo);
        System.out.print("Tahun Masuk Kerja Karyawan  = ");
        masuk = input.nextInt();
        masakerja = 2017 - masuk;
        System.out.println("Masa Kerja Karyawan       = "+masakerja+ " tahun");
        if(masakerja >= 5){
            bonus = 800000;
        }else{
            bonus = 0;
        }
        System.out.println("Bonus  Karyawan     = "+bonus);
        int gajibersih = gapo + bonus;
        System.out.println("Gaji Karyawan       = "+gajibersih);
        
    }
    
}