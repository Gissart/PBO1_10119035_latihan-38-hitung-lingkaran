package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung luas,keliling lingkaran menggunakan objek

public class lingkaran {
    public double phi = Math.PI;
    public String diameter;

    public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran();
        lingkaran.Input();
        double jarijari = lingkaran.Hitungjarijari(lingkaran.diameter);
        double luas = lingkaran.hitungLuas(jarijari, lingkaran.phi);
        double keliling = lingkaran.hitungKeliling(jarijari, lingkaran.phi);
        lingkaran.tampil(jarijari,luas,keliling);
    }

    public void tampil(double jarijari, double luas, double keliling){
        System.out.println("nilai jarijari lingkaran adalah " + jarijari);
        System.out.println("nilai luas lingkaran adalah " + luas);
        System.out.println("nilai keliling lingkaran adalah " + keliling);
    }

    public void Input(){
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        while(!valid) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = scan.next();
            valid = validasiIsNum(diameter);
            validasiAlert(valid);
        }
    }

    public void validasiAlert(boolean valid){
        if(!valid){
            System.out.println("Nilai diameter tidak sesuai!");
        }
    }

    private double hitungKeliling(double jarijari, double phi){
        double keliling = 2 * phi * jarijari;
        return keliling;
    }
    private double hitungLuas(double jarijari, double phi){
        double luas = phi * jarijari * jarijari;
        return luas;
    }

    private double Hitungjarijari(String diameter){
        double d_diameter = Double.parseDouble(diameter);
        return d_diameter / 2;
    }

    public  boolean validasiIsNum(Object object) {
        if(object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();
            try {
                Integer.parseInt(string);
            } catch(Exception e) {
                return false;
            }
        }
        return true;
    }
}