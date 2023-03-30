/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka: ");
        int nilai = input.nextInt();
        
        if(nilai >= 85 && nilai <= 100){
            System.out.println("Nilai huruf: A");
        }
        else if (nilai >= 70 && nilai < 85){
            System.out.println("Nilai huruf: B");
        }
        else if (nilai >= 60 && nilai < 70){
            System.out.println("Nilai huruf: C");
        }
        else if (nilai >= 50 && nilai < 60){
            System.out.println("Nilai huruf: D");
        }
        else if (nilai >= 0 && nilai < 50){
            System.out.println("Nilai huruf: E");
        }
        else{
            System.out.println("Nilai yang dimasukkan tidak valid");
        }
    }
}
