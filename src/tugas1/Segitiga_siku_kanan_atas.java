/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author windows10
 */
public class Segitiga_siku_kanan_atas {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int alas;
        
        boolean menu =true;
        while(menu)
        {
            System.out.print("Masukkan jumlah alas = ");
        	alas = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Siku kanan atas");
        	//Untuk memudahkan User interface saja
                
        for (int i=alas;i>=1;i--)
        	{
                    for (int j=i;j<alas;j++)
                    {
                        System.out.print(" ");
                    }
                    for (int k=0;k<i;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        
            System.out.print("\nMau Mencoba lagi (y/n) ?: ");
            String cek = scan.next();
            //Untuk mereturn atau mengclose program
            
            if(cek.equalsIgnoreCase("y"))
        	{
                    menu = true;
        	}
            else
            System.exit(0); 
        }
                
    }
    
}
