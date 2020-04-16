/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus5;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;
public class NilaiKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int kode;
        String nama,ket,nim,jurusan="";
        double absensi,tugas,uts,uas,khs;
        
        System.out.println("               Universitas Indonesia");
        System.out.println("                Fakultas Teknik");
        System.out.println("====================================================");
        System.out.print("Nim               = ");
        nim = input.nextLine();
        System.out.print("Nama Mahasiswa    = ");
        nama = input.nextLine();
        System.out.print("Kode Jurusan      = ");
        kode = input.nextInt();
        if(kode == 1){
            jurusan = "Teknik Mesin";
        }
        else if(kode == 2){
            jurusan = "Teknik Sipil";
        }
        else if(kode == 3){
            jurusan = "Teknik Elektro";
        }
        else if(kode == 4){
            jurusan = "Teknik Industri";
        }
        else{
            jurusan = "Salah Kode";
        }
        System.out.println("Nama Jurusan      = "+jurusan);
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
        if(khs >= 60){
            ket = "Lulus";
        }else{
            ket = "Tidak Lulus";
        }
        System.out.println("Keterangan        = "+ket);
    }
}
