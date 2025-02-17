/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazasok1;

import java.util.Scanner;

/**
 *
 * @author szebb
 */
public class Elagazasok1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Kérek egy számot: ");
        Scanner be = new Scanner(System.in);
        int a = be.nextInt();
        
        System.out.println("Kérek egy másik számot");
        int b = be.nextInt();
        
        if(a < b) {
            System.out.printf("A %d kisebb, mint %d", a, b);
        }
        else {
            System.out.printf("A %d kisebb, mint %d", b, a);
        }
        
        System.out.println("\n");
        
        int egesz = 30;
        if(egesz % 10 == 0 && egesz % 3 == 0) {
            System.out.printf("A 30 osztható 10-zel és 3-mal maradék nélkül");
        }
    }
}
