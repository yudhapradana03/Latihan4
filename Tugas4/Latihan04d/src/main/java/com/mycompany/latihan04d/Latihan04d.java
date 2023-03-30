package com.mycompany.latihan04d;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;


/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Latihan04d {

    public static void main(String[] args) 
    {
        String nama, nopel;
        double biaya, jumlahMeterKubik;
        final double TARIF1 = 1000; // Tarif per meter kubik untuk 0-10 meter kubik
        final double TARIF2 = 2000; // Tarif per meter kubik untuk 11-20 meter kubik
        final double TARIF3 = 5000; // Tarif per meter kubik untuk > 20 meter kubik
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Perhitungan Biaya Pemakaian Air");
    	System.out.println("============================================");
    	System.out.print("Nama		: ");
    	nama = input.nextLine();
    	System.out.print("No. Pelanggan	: ");
        String NoPel;
        NoPel = input.nextLine();
        System.out.print("Pemakaian Air    : ");
        jumlahMeterKubik = input.nextDouble();
        
        if (jumlahMeterKubik <= 10) {
            biaya = TARIF1 * jumlahMeterKubik;
        } else if (jumlahMeterKubik <= 20) {
            biaya = (TARIF1 * 10) + (TARIF2 * (jumlahMeterKubik - 10));
        } else {
            biaya = (TARIF1 * 10) + (TARIF2 * 10) + (TARIF3 * (jumlahMeterKubik - 20));
        }
        
        System.out.println("Biaya Pakai    : " + biaya);
    }
}