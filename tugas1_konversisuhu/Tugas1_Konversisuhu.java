/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_konversisuhu;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas1_Konversisuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        double suhu;
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("==== PROGRAM KONVERSI SUHU AIR =====");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("----------");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhu = input.nextDouble();
        
        OUTER:
        do {
            Mengkonversikan fromCelcius = new Mengkonversikan(suhu);
            System.out.println("");
            System.out.println("Pilihan : ");
            System.out.println("------------------------------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            pilih=input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("==============================");
                    System.out.println("Suhu dalam Celcius\t: " + suhu + "°C");
                    System.out.println("Dalam Fahrenheit\t: " + fromCelcius.ToFahrenheit() + "°F");
                    System.out.println("Dalam Reamur\t\t: " + fromCelcius.ToReamur() + "°R");
                    System.out.println("Dalam Kelvin\t\t: " + fromCelcius.ToKelvin() + "K");
                    System.out.println("Kondisi Air " + fromCelcius.kondisi());
                    break;
                case 2:
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius\t: ");
                    suhu = input.nextDouble();
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Pilihan Tidak Ada, Mohon masukkan pilihan yang sesuai!");
                    break;
            }
        } while (pilih !=3); 
    }
    
}
