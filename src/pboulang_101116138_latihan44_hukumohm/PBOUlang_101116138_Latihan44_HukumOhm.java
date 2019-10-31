/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_101116138_latihan44_hukumohm;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Hukum Ohm
 */
public class PBOUlang_101116138_Latihan44_HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float kuatArus;
        float hambatan;

        System.out.println("===Hukum Ohm===");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar  " + "\n"
                + "akan berbanding lurus dengan beda potensial"
                + "\n" + "pada ujung-ujung kawat penghantar tersebut" + "\n" + "asalkan suhu kawat"
                + "dijaga konstan.");

        Baterai btr = new Baterai();
        Baterai ohm = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan() + " volt");

    }

}
