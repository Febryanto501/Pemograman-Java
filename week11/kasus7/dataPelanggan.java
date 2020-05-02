/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus7;

/**
 *
 * @author Febryan PC
 */
import java.util.*;
public class dataPelanggan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] kode = new String[5];
        String[] nama = new String[5];
        String[] alamat = new String[5];
      
        
        System.out.print("masukan jumlah data: ");
        int data = in.nextInt();
        in.nextLine();
        for(int i = 0;i < data;i++){
            System.out.println("Data Ke-"+(i+1));
            System.out.print("kode pelanggan : ");
            kode[i] = in.nextLine();
            System.out.print("nama pelanggan : ");
            nama [i] = in.nextLine();
            System.out.print("alamat pelanggan : ");
            alamat[i] = in.nextLine();
            System.out.println();
        }
        System.out.println();
        System.out.println("              DATA PELANGGAN PT.SENTOSA JAYA");
        System.out.println("         JL. Sagu No.27A Kebagusan Jakarta Selatan");
        System.out.println("================================================================");
        System.out.println("No         Kode Pelanggan           Nama Pelanggan             Alamat");
        System.out.println("================================================================");
        for(int i = 0;i < data;i++){
            System.out.print((i+1)+"\t\t");System.out.print(kode[i]+"\t\t\t");System.out.print(nama[i]+"\t\t\t");System.out.print(alamat[i]);
              
            System.out.println();
        }
    }
}
