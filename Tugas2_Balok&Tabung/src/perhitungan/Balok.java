/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitungan;

/**
 *
 * @author Asus
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
     protected double tinggi, volume, luasPermukaan;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public Balok() {
    }
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    
    public void setAll(double panjang, double lebar, double tinggi){
    
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        
        this.luas();
        this.keliling();
        this.luasPermukaan();
        this.volume();
        
    }

    @Override
    public void volume() {
         this.volume = this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 2 * ((this.panjang * this.lebar)+(this.lebar * this.tinggi)+(this.panjang * this.tinggi));
    }

     
     
    
}
