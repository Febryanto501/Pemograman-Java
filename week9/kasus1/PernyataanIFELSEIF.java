/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus1;

/**
 *
 * @author Febryan PC
 */

import java.util.Scanner;
public class PernyataanIFELSEIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai : ");
        int skorUjian = input.nextInt();
        char grade;
        if (skorUjian >= 90) {
            grade = 'A';
        } else if (skorUjian >= 80) {
            grade = 'B';
        } else if (skorUjian >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade : " + grade);
    }
}
