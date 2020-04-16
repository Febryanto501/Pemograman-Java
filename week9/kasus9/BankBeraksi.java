/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.kasus9;

/**
 *
 * @author Febryan PC
 */
import java.util.Scanner;

public class BankBeraksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bank obj_bank = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil Uang");
        System.out.print("Pilih Menu: ");
        int pilihan = input.nextInt();
        System.out.println();

        switch (pilihan) {
            case 1:
                System.out.println("Saldo saat ini : Rp. " + obj_bank.getSaldo());
                break;
            case 2:
                System.out.print("Jumlah uang yang anda simpan : Rp. ");
                int simpan = input.nextInt();
                obj_bank.simpanUang(simpan);
                System.out.println("Saldo saat ini : Rp. " + obj_bank.getSaldo());
                break;
            case 3:
                System.out.print("Ambil uang : Rp. ");
                int ambil = input.nextInt();
                if (obj_bank.saldo >= ambil) {
                    obj_bank.ambilUang(ambil);
                } else {
                    System.out.println("Saldo Tidak Mencukupi");
                } 
                System.out.println("Saldo saat ini : Rp. " + obj_bank.getSaldo());
                break;
        }
    }
}
