/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus3;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class TokoSerbaAda {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String namabrg;
        double hargabrg,jumlah,total,totalhrg,uangbyr,kembali,diskon;
        
        
        
        System.out.println("                  Toko Serba Ada");
        System.out.println("    Jl. Bantar Gebang No.23 Bekasi Jawa Barat");
        System.out.println("===================================================");
        System.out.print("Nama Barang        = ");
        namabrg = input.nextLine();
        System.out.print("Harga Barang       = ");
        hargabrg = input.nextDouble();
        System.out.print("Jumlah Beli        = ");
        jumlah = input.nextDouble();
        System.out.println("------------------------------------");
        total = hargabrg * jumlah;
        System.out.println("Total Belanja      = "+total);
        if(total > 500000){
            diskon = total * 0.1;
        }
        else if(total >= 300000){
            diskon = total * 0.06;
        }
        else if(total >= 150000){
            diskon = total * 0.03;
        }
        else if (total >= 100000){
            diskon = total * 0.01;
        }
        else if (total < 100000){
            diskon = 0;
        }
        else{
            diskon= 0;
        }
        System.out.println("Potongan Harga     = "+diskon);
        System.out.println("------------------------------------");
        totalhrg = total - diskon;
        System.out.println("Total Harga        = "+totalhrg);
        System.out.print("Uang Bayar         = ");
        uangbyr = input.nextDouble();
        System.out.println("------------------------------------");
        kembali = uangbyr - totalhrg;
        System.out.println("Uang Kembali       = "+kembali);
        
    }
}
