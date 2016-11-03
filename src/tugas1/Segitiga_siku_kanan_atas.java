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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int alas;
        
        boolean menu =true;
        while(menu)
        {
            System.out.print("Masukkan jumlah alas = ");
        	alas = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Siku Kanan Atas");
        	//Untuk memudahkan User interface saja
                
                for (int i=1;i<=alas;i++)
        	{
                    for(int x=alas-1;x>=i;x--) 
                    { 
			System.out.print(" ");
                    }
                    
                    for(int x=1;x<=i;x++)
                    { 
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
    
