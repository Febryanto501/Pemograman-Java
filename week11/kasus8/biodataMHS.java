/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus8;

/**
 *
 * @author Febryan PC
 */
import java.util.*;
public class biodataMHS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nim = new int[5];
        String[] nama = new String[5];
        String[] jurusan = new String[5];
        String[] alamat = new String[5];
      
        
        System.out.print("masukan jumlah data: ");
        int data = in.nextInt();
        in.nextLine();
        for(int i = 0;i < data;i++){
            System.out.println("------Data Ke-"+(i+1)+"------");
            System.out.print("Masukan Nim     = ");
            nim[i] = in.nextInt();
            in.nextLine();
            System.out.print("Masukan Nama    = ");
            nama[i] = in.nextLine();
            System.out.print("Masukan Jurusan = ");
            jurusan[i] = in.nextLine();
            System.out.print("Masukan Alamat  = ");
            alamat[i] = in.nextLine();
        }
        System.out.println();
        System.out.println("+====================================HASIL OUTPUT===================================+");
        System.out.println("No\t\t NIM\t\t Nama Mahasiswa\t\t Jurusan\t\t Alamat");
        System.out.println("=====================================================================================");
        for(int i = 0;i < data;i++){
            System.out.print((i+1)+"\t\t ");
            System.out.print(nim[i]+"\t\t ");
            System.out.print(nama[i]+"\t\t\t");
            System.out.print(jurusan[i]+"\t\t ");
            System.out.print(alamat[i]);
              
            System.out.println();
        }
    }
}
