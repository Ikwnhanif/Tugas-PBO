/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_balok.tabung;

import static java.lang.System.in;
import java.util.Scanner;
import perhitungan.Balok;
import perhitungan.Tabung;

/**
 *
 * @author Asus
 */
public class Main {

    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int ulang;
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        do {
            System.out.println("==================");
            System.out.println("Menu Utama");
            System.out.println("==================");
            System.out.println("1. Menghitung Balok");
            System.out.println("2. Menghitung Tabung");
            System.out.println("0.exit");

            System.out.print("pilih: ");
            int pilih = in.nextInt();

            switch (pilih) {
                case 1:{
                    System.out.print("Input Panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Input Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggi = input.nextDouble();

                    balok.setAll(panjang,lebar,tinggi);

                    System.out.println("Luas Persegi Panjang : " + balok.getLuas() );
                    System.out.println("Keliling Persegi Panjang : " + balok.getKeliling() );
                    System.out.println("Luas Permukaan Balok : " + balok.getLuasPermukaan() );
                    System.out.println("Volume Balok : " + balok.getVolume() );
                    
                    
                    
                    break;
                }

                case 2:{
                    
                    System.out.print("Input jari-jari : ");
                    double jarijari = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggi = input.nextDouble();

                    tabung.setAll(jarijari,tinggi);

                    System.out.println("Luas Lingkaran : " + tabung.getLuas() );
                    System.out.println("Keliling Lingkaran : " + tabung.getKeliling() );
                    System.out.println("Luas Permukaan Tabung : " + tabung.getLuasPermukaan() );
                    System.out.println("Volume Tabung : " + tabung.getVolume() );
                    
                    
                    break;
                }

            } 
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = in.nextInt();
        } while (ulang==1);
    
    
    }

}
