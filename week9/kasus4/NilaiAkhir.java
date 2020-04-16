/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus4;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama,grade;
        double absensi,tugas,uts,uas,khs;
        System.out.println("               Kwik Kian Gie Institute");
        System.out.println("                Nilai Akhir Semester");
        System.out.println("====================================================");
        System.out.println("            Jurusan: Teknik Informatika");
        System.out.print("Nama Mahasiswa    = ");
        nama = input.nextLine();
        System.out.print("Nilai Absensi     = ");
        absensi = input.nextDouble();
        System.out.print("Nilai Tugas       = ");
        tugas = input.nextDouble();
        System.out.print("Nilai UTS         = ");
        uts = input.nextDouble();
        System.out.print("Nilai UAS         = ");
        uas = input.nextDouble();
        System.out.println("------------------------------------");
        khs = (0.2 * absensi)+(0.25 * tugas)+(0.25 * uts)+(0.3 * uas);
        System.out.println("Nilai KHS         = "+khs);
        if (khs >= 80 && khs <=100){
            grade = "A";
        }
        else if (khs >= 66 && khs <= 79.99){
            grade = "B";
        }
        else if (khs >= 56 && khs <= 65.99){
            grade = "C";
        }
        else if (khs >= 46 && khs <= 55.99){
            grade = "D";
        }
        else{
            grade = "E";
        }
        System.out.println("Grade             = "+grade);
        
    }
}
