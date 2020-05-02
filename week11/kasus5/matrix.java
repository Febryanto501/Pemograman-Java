/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus5;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        
    
    Scanner inp = new Scanner(System.in);
    
    int Nbaris = 3, Nkolom = 2;

    int [][] x = new int[Nbaris][Nkolom];
    for (int ibaris = 0; ibaris < Nbaris; ibaris++){
        for (int ikolom = 0; ikolom < Nkolom; ikolom++){
            System.out.printf("baris ke-%d kolom ke-%d : ", ibaris, ikolom);
            x[ibaris][ikolom] = inp.nextInt();
        }
    }
    System.out.println();
 

    for (int ibaris = 0; ibaris < Nbaris; ibaris++){
        for (int ikolom = 0; ikolom < Nkolom; ikolom++){
            System.out.printf(x[ibaris][ikolom] + " ");
        }
    System.out.println();
    }
  }
}
