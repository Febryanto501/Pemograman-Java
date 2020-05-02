/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11.kasus6;

/**
 *
 * @author Febryan PC
 */
import java.util.ArrayList;
public class NegaraKota {
    public static void main(String[] args) {
        ArrayList<String> negara = new ArrayList<>();
        negara.add("Amerika");
        negara.add("Inggris");
        negara.add("Jepang");
        negara.add("Perancis");
        negara.add("Indonesia");
        negara.add("Iran");
        negara.add("Irak");
        
        ArrayList<String> kota = new ArrayList<>();
        kota.add("Teheran");
        kota.add("Bekasi");
        kota.add("Jakarta");
        kota.add("Bantar Gebang");
        kota.add("Tokyo");
        
        System.out.println("ibukota "+negara.get(4)+" adalah "+ kota.get(2));
        System.out.println("ibukota "+negara.get(2)+" adalah "+ kota.get(4));
        System.out.println("ibukota "+negara.get(5)+" adalah "+ kota.get(0));

    }
}
