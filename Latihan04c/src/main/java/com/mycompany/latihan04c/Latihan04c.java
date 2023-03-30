/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan04c;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Latihan04c {

    public static void main(String[] args) 
    {
    	String nama, jurusan, huruf;
    	int nilai;
    		
    	Scanner input01 = new Scanner(System.in);
    	
    	System.out.println("Data Test");
    	System.out.println("========================");
    	System.out.print("Nama		: ");
    	nama = input01.nextLine();
    	System.out.print("Jurusan		: ");
    	jurusan = input01.nextLine();
    	System.out.print("Nilai		: ");
    	nilai = input01.nextInt();
    	
    	if (nilai >= 85){
    	huruf = "A";
    	}
    	else if (nilai >= 70){
    	huruf = "B";
    	}
    	else if (nilai >= 60){
    	huruf = "C";
    	}
    	else if (nilai >= 50){
    	huruf = "D";
    	}
    	else {
    	huruf = "E";
    	}
    	System.out.println("Nilai Huruf    : " + huruf);
    } 
}
 
