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
public class Bank {
    int saldo;

     public Bank(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int value) {
        saldo += value;
    }

    public void ambilUang(int value) {
        saldo -= value;
    }

    public int getSaldo() {
        return saldo;
    }
}
