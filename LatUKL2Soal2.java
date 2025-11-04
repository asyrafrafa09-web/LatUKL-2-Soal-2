/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latukl2soal2;

/**
 *
 * @author asyraf
 */
import java.util.Scanner;
public class LatUKL2Soal2 {

       static double hitungVolume(double jariJari, double tinggi) {
        double volume = 3.14 * jariJari * jariJari * tinggi; 
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("\n HASIL PERHITUNGAN ");
        System.out.println("Jari-jari : " + r + " cm");
        System.out.println("Tinggi    : " + t + " cm");
        System.out.println("Volume tabung = " + volume + " cm³");
    }
}
