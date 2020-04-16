/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus2;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class PernyataanIFELSEIF2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total, jasa=0, komisi=0,pendapatan;

        System.out.print("Masukan Pendapatan Sales Rp. ");
        pendapatan = input.nextInt();
        System.out.println();
        if (pendapatan == 200000) {
            jasa = 10000;
            komisi = 0.1 * pendapatan;
        }
        else if(pendapatan > 200000 && pendapatan <=500000){
            jasa = 20000;
            komisi = 0.15 * pendapatan;
        }
        else{
            jasa = 30000;
            komisi = 0.2 * pendapatan;
        }
         total = jasa + komisi;
        System.out.println("Uang Jasa   Rp. " + jasa);
        System.out.println("Uang Komisi RP. " + komisi);
        System.out.println("========================");
        total = jasa + komisi;
        System.out.println("Uang Total  Rp. " + total);
    }
}
