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
public class Segitiga_sama_kaki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alas;
        
        boolean menu =true;
        while(menu)
        {
            System.out.print("Masukkan jumlah alas = ");
        	alas = scan.nextInt();
                
            System.out.println("\nCetak Segitiga Samakaki");
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
                }
        }
        
    }
    
}
